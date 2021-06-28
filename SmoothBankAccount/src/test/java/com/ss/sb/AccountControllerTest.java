/**
 * 
 */
package com.ss.sb;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author heman
 *
 */

@SpringBootTest
@AutoConfigureMockMvc
public class AccountControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getAllAccountsTest() throws Exception {
		mockMvc.perform(get("/accounts").contentType(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	public void putAccountsTest() throws Exception {
		mockMvc.perform(put("/accounts/delete").contentType(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk());
	}
	
	

}
