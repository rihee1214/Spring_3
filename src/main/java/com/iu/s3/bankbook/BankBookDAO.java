package com.iu.s3.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s3.bankbook.BankBookDAO.";
	
	public int bankbookAdd(BankBookDTO bankbookDTO) throws Exception{
		int result = sqlSession.insert(NAMESPACE+"bankbookAdd", bankbookDTO);
		return result;
	}
	
	public int bankbookUpdate(BankBookDTO bankbookDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"bankbookUpdate", bankbookDTO);	
	}
	
	public int bankbookDelete(BankBookDTO bankBookDTO) throws Exception{
		int result=sqlSession.delete(NAMESPACE+"bankbookDelete", bankBookDTO);
		return result;
	}
	
	public List<BankBookDTO> bankbookList() throws Exception{
		return sqlSession.selectList(NAMESPACE+"bankbookList");
	}
	
	public BankBookDTO bankbookSelect(BankBookDTO bDTO) throws Exception{
		Long num = Long.valueOf(bDTO.getBookNumber());
		bDTO = sqlSession.selectOne(NAMESPACE+"bankbookSelect", num);
		return bDTO;
	}
	
	
}
