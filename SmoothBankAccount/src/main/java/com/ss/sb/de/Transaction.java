/**
 * 
 */
package com.ss.sb.de;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author heman
 *
 */

@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	private int transaction_id;

	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account account;

	@Column(name = "transaction_desc")
	private String transaction_desc;

	@Column(name = "amount")
	private double amount;

	@Column(name = "datetime")
	private LocalDateTime datetime;

	/**
	 * @return the transaction_id
	 */
	public int getTransaction_id() {
		return transaction_id;
	}

	/**
	 * @param transaction_id the transaction_id to set
	 */
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * @return the transaction_desc
	 */
	public String getTransaction_desc() {
		return transaction_desc;
	}

	/**
	 * @param transaction_desc the transaction_desc to set
	 */
	public void setTransaction_desc(String transaction_desc) {
		this.transaction_desc = transaction_desc;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the datetime
	 */
	public LocalDateTime getDatetime() {
		return datetime;
	}

	/**
	 * @param datetime the datetime to set
	 */
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

}
