package com.iu.s3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s3.util.Pager;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	public List<NoticeDTO> noticeList(Pager pager) throws Exception{
		long perpager = 10;
		pager.setStartRow((pager.getCurPage()-1)*perpager+1);
		pager.setLastRow(pager.getCurPage()*perpager);
		long totalCount=72;
		long totalPage=totalCount%perpager==0?totalCount/perpager:totalCount/perpager+1;
		pager.setTotalPager(totalPage);
		return noticeDAO.noticeList(pager);
	}
	
	public NoticeDTO noticeSelect(NoticeDTO noticeDTO) throws Exception{
		noticeDTO=noticeDAO.noticeSelect(noticeDTO);
		noticeDAO.noticeHit(noticeDTO);
		return noticeDTO;
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
