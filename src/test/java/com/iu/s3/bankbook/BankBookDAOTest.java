package com.iu.s3.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s3.MyAbstractTest;

public class BankBookDAOTest extends MyAbstractTest{
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	@Test
	public void bankbookUpdateTest() throws Exception{
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(66);
		bankBookDTO=bankBookDAO.bankbookSelect(bankBookDTO);
		bankBookDTO.setBookName("EPL");
		int result = bankBookDAO.bankbookUpdate(bankBookDTO);
		assertEquals(1, result);
	}
	
	//@Test
	public void bankbookDeleteTest()throws Exception{
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(66L);
		int result = bankBookDAO.bankbookDelete(bankBookDTO);
		assertEquals(1, result);
	}
	
	//@Test
	public void bankbookListTest()throws Exception {
		List<BankBookDTO> ar = bankBookDAO.bankbookList();
		assertNotEquals(0, ar.size());
	}
	
	
	//@Test
	public void bankbookSelectTest()throws Exception {
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(1);
		bankBookDTO = bankBookDAO.bankbookSelect(bankBookDTO);
		assertNotNull(bankBookDTO);
	}
	
	//@Test
	public void bankbookAddTest() throws Exception{
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName("TEST");
		bankBookDTO.setBookRate(0.12);
		bankBookDTO.setBookSale("Y");
		int result = bankBookDAO.bankbookAdd(bankBookDTO);
		assertEquals(1, result);
	}
}
