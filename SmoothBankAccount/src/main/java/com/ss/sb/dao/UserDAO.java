/**
 * 
 */
package com.ss.sb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ss.sb.de.User;

/**
 * @author heman
 *
 */
public interface UserDAO extends JpaRepository<User, Integer>{

}
