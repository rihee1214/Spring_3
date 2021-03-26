package com.iu.s3.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s3.notice.NoticeDAO.";
	
	public int noticeInsert(NoticeDTO noticeDTO) {
		return sqlSession.insert(NAMESPACE+"noticeInsert",noticeDTO);
	}
	
	public NoticeDTO noticeSelect(NoticeDTO noticeDTO) {
		return sqlSession.selectOne(NAMESPACE+"noticeSelect", noticeDTO);
	}
	
	public List<NoticeDTO> noticeList(NoticeDTO noticeDTO) {
		return sqlSession.selectList(NAMESPACE+"noticeList", noticeDTO);
	}
	
	public int noticeUpdate(NoticeDTO noticeDTO) {
		return sqlSession.update(NAMESPACE+"noticeUpdate", noticeDTO);
	}
	
	public int noticeHit(NoticeDTO noticeDTO) {
		return sqlSession.update(NAMESPACE+"noticeHit", noticeDTO);
	}
	
	public int noticeDelete(NoticeDTO noticeDTO) {
		return sqlSession.delete(NAMESPACE+"noticeDelete", noticeDTO);
	}
}
