package com.iu.s3.account;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s3.account.AccountDAO.";
	
	public List<AccountDTO> accountList(AccountDTO accountDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"accountList", accountDTO);
	}
	
	public int accountInsert(AccountDTO accountDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"accountInsert", accountDTO);
	}
}
