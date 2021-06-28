/**
 * 
 */
package com.ss.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ss.sb.de.Transaction;
import com.ss.sb.service.TransactionService;

/**
 * 
 * @author heman
 *
 */

@RestController
@RequestMapping("/transactions")
public class TransactionController {

	@Autowired
	TransactionService service;
	
	@CrossOrigin
	@GetMapping
	public List<Transaction> getAllTransactions() {
		return service.getAllTransactions();
	}
	
	@CrossOrigin
	@GetMapping("/id")
	public List<Transaction> getTransactionsById(@RequestParam Integer account_id) {
		return service.getTransactionsByAccount(account_id);
	}
	
}
