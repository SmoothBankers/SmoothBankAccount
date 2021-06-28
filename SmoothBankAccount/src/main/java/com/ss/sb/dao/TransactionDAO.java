/**
 * 
 */
package com.ss.sb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ss.sb.de.Transaction;

/**
 * @author heman
 *
 */
public interface TransactionDAO extends JpaRepository<Transaction, Integer> {

}
