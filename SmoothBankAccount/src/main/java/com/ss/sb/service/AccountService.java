/**
 * 
 */
package com.ss.sb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ss.sb.dao.AccountDAO;
import com.ss.sb.dao.AccountTypeDAO;
import com.ss.sb.dao.UserDAO;
import com.ss.sb.de.Account;
import com.ss.sb.de.AccountType;
import com.ss.sb.de.User;

import ch.qos.logback.classic.Logger;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

/**
 * @author heman
 *
 */
@Service
@Slf4j
public class AccountService {

	@Autowired
	AccountDAO adao;

	@Autowired
	UserDAO udao;

	@Autowired
	AccountTypeDAO atdao;

	public List<Account> getAllAccounts() {
		List<Account> accounts = new ArrayList<>();
		
		adao.findAll().forEach(accounts::add);
		
		List<Account> activeaccounts = new ArrayList<>();
		
		for(Account a: accounts) {
			if(a.isActive()) {
				activeaccounts.add(a);
			}
		}
		return activeaccounts;
	}
	
	public List<Account> getAccountsByUser(Integer user_id) {
		List<Account> accounts = new ArrayList<>();
		if(user_id != null) {
			adao.findAll().forEach(accounts::add);
		}
		List<Account> relevantaccounts = new ArrayList<>();
		for(Account a: accounts) {
			if((a.getUser().getUser_id() == user_id) && a.isActive()) {
				relevantaccounts.add(a);
			}
		}
		return relevantaccounts;
	}

	public Account createAccount(Account account) {
        return adao.save(account);
    }
	
	public void deleteAccount(int account_id) {
		List<Account> accounts = this.getAllAccounts();
		
		for(Account a: accounts) {
			if(a.getAccount_id() == account_id) {
				a.setActive(false);
				adao.save(a);
				System.out.println(a);
			}
		}

	}

}
