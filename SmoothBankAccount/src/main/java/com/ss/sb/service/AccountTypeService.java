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

import com.ss.sb.dao.AccountTypeDAO;
import com.ss.sb.de.AccountType;

/**
 * @author heman
 *
 */

@Service
public class AccountTypeService {
	
	@Autowired
	AccountTypeDAO atdao;
	
	public ResponseEntity<List<AccountType>> getAllAccountTypes(){
		List<AccountType> accounttypes = new ArrayList<>();
		atdao.findAll().forEach(accounttypes::add);
		return new ResponseEntity<List<AccountType>>(accounttypes, HttpStatus.OK);
	}

}
