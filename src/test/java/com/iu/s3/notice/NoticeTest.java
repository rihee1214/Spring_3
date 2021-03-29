package com.iu.s3.notice;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s3.MyAbstractTest;

public class NoticeTest extends MyAbstractTest{

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	public void insertTest()throws Exception{
		for(int i = 0 ; i < 120; i++) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setId("admin");
			noticeDTO.setNoticeContent("test"+i);
			noticeDTO.setNoticeSub("noticesub"+i);
			assertEquals(1,noticeDAO.noticeInsert(noticeDTO));
		}
	}

}
