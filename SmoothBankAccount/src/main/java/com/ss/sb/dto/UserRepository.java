/**
 * 
 */
package com.ss.sb.dto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ss.sb.de.User;

/**
 * @author heman
 *
 */

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
}
