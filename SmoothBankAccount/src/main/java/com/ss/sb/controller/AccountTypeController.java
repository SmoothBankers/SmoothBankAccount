/**
 * 
 */
package com.ss.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.sb.de.AccountType;
import com.ss.sb.service.AccountTypeService;

/**
 * @author heman
 *
 */
@RestController
@RequestMapping("/accounttypes")
public class AccountTypeController {
	
	@Autowired
	AccountTypeService service;
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<AccountType>> getAllAccountTypes() {
		return service.getAllAccountTypes();
	}
	
}
