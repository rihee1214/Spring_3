package com.iu.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s3.util.Pager;

@Service
public class BankBookService {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	public List<BankBookDTO> bankbookList(Pager pager)throws Exception{
		return bankBookDAO.bankbookList(pager);
	}
	
	public BankBookDTO bankbookSelect(BankBookDTO bankBookDTO)throws Exception {
		return bankBookDAO.bankbookSelect(bankBookDTO);
	}
	
	public int bankbookUpdate(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.bankbookUpdate(bankBookDTO);
	}
	
	public int bankbookDelete(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.bankbookDelete(bankBookDTO);
	}
}
