/**
 * 
 */
package com.ss.sb.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.sb.de.Account;
import com.ss.sb.de.AccountType;
import com.ss.sb.dto.AccountDTO;
import com.ss.sb.dto.AccountRepository;
import com.ss.sb.dto.UserRepository;

/**
 * @author heman
 *
 */

@Service
public class MapService {

	@Autowired
	AccountRepository accountrepository;
	
	@Autowired
	ModelMapper modelmapper;

	public List<AccountDTO> getAllAccounts() {
		return ((List<Account>) accountrepository.findAll()).stream().map(this::convertToAccountDTO)
				.collect(Collectors.toList());
	}

	public AccountDTO convertToAccountDTO(Account account) {
		modelmapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		AccountDTO aDTO = modelmapper.map(account, AccountDTO.class);
		return aDTO;

	}
}
