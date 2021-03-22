package com.iu.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankBookService {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	public List<BankBookDTO> bankBookList() throws Exception {
		return bankBookDAO.bankbookList();
	}
	
	public BankBookDTO bankBookSelect(BankBookDTO bDTO) throws Exception{
		return bankBookDAO.bankbookSelect(bDTO);
	}
	
	public int bankBookAdd(BankBookDTO bDTO) throws Exception {
		return bankBookDAO.bankbookAdd(bDTO);
	}
	
	public int bankBookUpdate(BankBookDTO bDTO) throws Exception {
		return bankBookDAO.bankbookUpdate(bDTO);
	}
	
	public int bankBookDelete(BankBookDTO bDTO) throws Exception {
		return bankBookDAO.bankbookUpdate(bDTO);
	}
	
}
