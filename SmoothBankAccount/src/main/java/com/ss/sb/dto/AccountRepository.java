/**
 * 
 */
package com.ss.sb.dto;

import org.springframework.data.repository.CrudRepository;

import com.ss.sb.de.Account;

/**
 * @author heman
 *
 */

public interface AccountRepository extends CrudRepository<Account, Integer> {

}
