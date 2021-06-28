/**
 * 
 */
package com.ss.sb.de;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author heman
 *
 */

/*
 * The account type should have a description as well as different perks to
 * distinguish them: mainly ways to affect the balance (starting fee, interest
 * rate, etc.)
 */

@Entity
@Table(name = "account_type")
@Data
public class AccountType {

	@Id
	private Integer account_type_id;

	@Column(name = "account_type_desc")
	private String account_type_desc;

	/**
	 * @return the account_type_id
	 */
	public Integer getAccount_type_id() {
		return account_type_id;
	}

	/**
	 * @param account_type_id the account_type_id to set
	 */
	public void setAccount_type_id(Integer account_type_id) {
		this.account_type_id = account_type_id;
	}

	/**
	 * @return the account_type_desc
	 */
	public String getAccount_type_desc() {
		return account_type_desc;
	}

	/**
	 * @param account_type_desc the account_type_desc to set
	 */
	public void setAccount_type_desc(String account_type_desc) {
		this.account_type_desc = account_type_desc;
	}

	@Override
	public String toString() {
		return "AccountType [account_type_id=" + account_type_id + ", account_type_desc=" + account_type_desc + "]";
	}

}
