/**
 * 
 */
package com.ss.sb.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ss.sb.dao.AccountTypeDAO;
import com.ss.sb.dao.UserDAO;
import com.ss.sb.de.Account;
import com.ss.sb.de.AccountType;
import com.ss.sb.de.User;
import com.ss.sb.dto.AccountDTO;
import com.ss.sb.service.AccountService;
import com.ss.sb.service.MapService;

/**
 * @author heman
 *
 */
@RestController
@RequestMapping(value = "/accounts", method = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST})
@CrossOrigin
public class AccountController {
	
	@Autowired
	UserDAO udao;
	
	@Autowired
	AccountTypeDAO atdao;
	
	@Autowired
	AccountService service;
	
	@Autowired
	MapService mservice;
	
	@Autowired
	ModelMapper modelmapper;

//	@CrossOrigin
//	@GetMapping
//	public ResponseEntity<List<Account>> getAllAccounts() {
//		return service.getAllAccounts();
//	}
	
//	@CrossOrigin
	@GetMapping("/all")
	public List<Account> getAllAccounts() {
		return service.getAllAccounts();
	}
	
//	@CrossOrigin
	@GetMapping("/id")
	public List<Account> getAccountById(@RequestParam Integer user_id) {
		return service.getAccountsByUser(user_id);
	}
	
//	@CrossOrigin
	@PostMapping("/signup")
	public AccountDTO createAccount(@RequestBody AccountDTO aDTO) {
		Account account = convertToEntity(aDTO);
		Account newaccount = service.createAccount(account);
		return mservice.convertToAccountDTO(newaccount);
	}
	
//	@CrossOrigin
	@PutMapping("/delete")
	public void deleteAccount(@RequestParam Integer account_id) {
		service.deleteAccount(account_id);
	}
	
	
	private Account convertToEntity(AccountDTO aDTO) {
		Account account = modelmapper.map(aDTO, Account.class);
		List<User> users = new ArrayList<>();
		udao.findAll().forEach(users::add);
		
		List<AccountType> types = new ArrayList<>();
		atdao.findAll().forEach(types::add);
		
		for(AccountType type: types) {
			if(type.getAccount_type_desc().equals(aDTO.getAccount_type())) {
				account.setAccount_type(type);
			}
		}
		
		for(User u: users) {
			if(u.getEmail().equals(aDTO.getEmail())){
				account.setUser(u);
			}
		}
		account.setActive(true);
		System.out.println(account);
		if (aDTO.getAccount_id() != 0) {
			List<Account> accounts = service.getAllAccounts();
			Account oldaccount = null;
			for (Account a : accounts) {
				if (a.getAccount_id() == aDTO.getAccount_id()) {
					oldaccount = a;
				}
			}
//			account.setInvesting_id(oldaccount.getInvesting_id());
//			account.setTransaction(oldaccount.getTransaction());
			account.setAccount_type(oldaccount.getAccount_type());
			account.setBalance(oldaccount.getBalance());
			account.setActive(oldaccount.isActive());
			account.setUser(oldaccount.getUser());
		}
		return account;
	}
}
