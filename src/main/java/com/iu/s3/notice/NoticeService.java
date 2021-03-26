package com.iu.s3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	public List<NoticeDTO> noticeList() throws Exception{
		return noticeDAO.noticeList();
	}
	
	public NoticeDTO noticeSelect(NoticeDTO noticeDTO) throws Exception{
		noticeDAO.noticeHit(noticeDTO);
		return noticeDAO.noticeSelect(noticeDTO);
	}
	
	public int noticeInsert(NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.noticeInsert(noticeDTO);
	}
	
	public int noticeDelete(NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.noticeDelete(noticeDTO);
	}
	
	public int noticeUpdate(NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.noticeUpdate(noticeDTO);
	}
	
}
