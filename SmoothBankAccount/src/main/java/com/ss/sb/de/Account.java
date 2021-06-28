/**
 * 
 */
package com.ss.sb.de;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author heman
 *
 */

/*
 * An account should display the account type, the account balance, the account
 * number, as well as options for transactions and investments. User should also
 * be allowed to transfer money between accounts.
 */

@Entity
@Table(name = "account")
@Data
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int account_id;

//	@Column(name = "transaction_id")
//	private int transaction_id;
	
//	@ManyToOne
//	@JoinColumn(name = "transaction_id")
//	private Transaction transaction;
//
//	/**
//	 * @return the transaction
//	 */
//	public Transaction getTransaction() {
//		return transaction;
//	}
//
//	/**
//	 * @param transaction the transaction to set
//	 */
//	public void setTransaction(Transaction transaction) {
//		this.transaction = transaction;
//	}

	@Column(name = "investing_id")
	private int investing_id;

	@ManyToOne
	@JoinColumn(name = "account_type_id")
	private AccountType account_type;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "balance")
	private double balance;
	
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

	@Column(name = "isActive", nullable = false, columnDefinition = "TINYINT(1)")
	private Boolean isActive;

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

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

	/**
	 * @return the investing_id
	 */
	public int getInvesting_id() {
		return investing_id;
	}

	/**
	 * @param investing_id the investing_id to set
	 */
	public void setInvesting_id(int investing_id) {
		this.investing_id = investing_id;
	}

	/**
	 * @return the account_type
	 */
	public AccountType getAccount_type() {
		return account_type;
	}

	/**
	 * @param account_type the account_type to set
	 */
	public void setAccount_type(AccountType account_type) {
		this.account_type = account_type;
	}

	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", investing_id=" + investing_id + ", account_type=" + account_type
				+ ", user=" + user + ", balance=" + balance + ", isActive=" + isActive + "]";
	}



}
