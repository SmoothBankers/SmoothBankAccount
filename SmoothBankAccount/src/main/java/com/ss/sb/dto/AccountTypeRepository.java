/**
 * 
 */
package com.ss.sb.dto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ss.sb.de.AccountType;

/**
 * @author heman
 *
 */

@Repository
public interface AccountTypeRepository extends CrudRepository<AccountType, Integer> {

}
