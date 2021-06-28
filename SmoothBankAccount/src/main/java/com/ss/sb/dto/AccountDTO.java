/**
 * 
 */
package com.ss.sb.dto;

import com.ss.sb.de.AccountType;
import com.ss.sb.de.User;
import com.sun.istack.NotNull;

/**
 * @author heman
 *
 */


public class AccountDTO {
	
	private int account_id;
	
//	@NotNull
//	private int transaction_id;
	
//	@NotNull
//	private int investing_id;
	
	@NotNull
	private double balance;
	
	@NotNull
	private Boolean isActive;
	
//	@NotNull
//	private AccountType account_type;
	
//	@NotNull
//	private User user;
	
	@NotNull
	private String email;
	
	@NotNull
	private String account_type;
	
	/**
	 * @return the account_type
	 */
	public String getAccount_type() {
		return account_type;
	}

	/**
	 * @param account_type the account_type to set
	 */
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the isActive
	 */
	public Boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(Boolean isActive) {
		this.isActive = isActive;
	}
//
//	/**
//	 * @return the transaction_id
//	 */
//	public int getTransaction_id() {
//		return transaction_id;
//	}
//
//	/**
//	 * @param transaction_id the transaction_id to set
//	 */
//	public void setTransaction_id(int transaction_id) {
//		this.transaction_id = transaction_id;
//	}
//
//	/**
//	 * @return the investing_id
//	 */
//	public int getInvesting_id() {
//		return investing_id;
//	}
//
//	/**
//	 * @param investing_id the investing_id to set
//	 */
//	public void setInvesting_id(int investing_id) {
//		this.investing_id = investing_id;
//	}

//	/**
//	 * @return the account_type
//	 */
//	public AccountType getAccount_type() {
//		return account_type;
//	}
//
//	/**
//	 * @param account_type the account_type to set
//	 */
//	public void setAccount_type(AccountType account_type) {
//		this.account_type = account_type;
//	}

//	/**
//	 * @return the user
//	 */
//	public User getUser() {
//		return user;
//	}
//
//	/**
//	 * @param user the user to set
//	 */
//	public void setUser(User user) {
//		this.user = user;
//	}

	/**
	 * @return the account_id
	 */
	public int getAccount_id() {
		return account_id;
	}

	/**
	 * @param account_id the account_id to set
	 */
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	
}
