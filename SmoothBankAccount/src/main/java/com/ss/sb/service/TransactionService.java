/**
 * 
 */
package com.ss.sb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.sb.dao.TransactionDAO;
import com.ss.sb.de.Transaction;

/**
 * @author heman
 *
 */

@Service
public class TransactionService {

	@Autowired
	TransactionDAO tdao;

	public List<Transaction> getAllTransactions() {

		List<Transaction> transactions = new ArrayList<>();

		tdao.findAll().forEach(transactions::add);
		return transactions;

	}

	public List<Transaction> getTransactionsByAccount(Integer account_id) {

		List<Transaction> transactions = this.getAllTransactions();

		List<Transaction> accounttransactions = new ArrayList<>();

		for (Transaction t : transactions) {
			if (t.getAccount().getAccount_id() == account_id) {
				accounttransactions.add(t);
			}
		}

		return accounttransactions;
	}

}
