package com.iu.s3.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s3.util.Pager;

@Repository
public class NoticeDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s3.notice.NoticeDAO.";
	
	public int noticeInsert(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"noticeInsert",noticeDTO);
	}
	
	public NoticeDTO noticeSelect(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"noticeSelect", noticeDTO);
	}
	
	public List<NoticeDTO> noticeList(Pager pager) throws Exception{
		return sqlSession.selectList(NAMESPACE+"noticeList",pager);
	}
	
	public int noticeUpdate(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"noticeUpdate", noticeDTO);
	}
	
	public int noticeHit(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"noticeHit", noticeDTO);
	}
	
	public int noticeDelete(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"noticeDelete", noticeDTO);
	}
}
