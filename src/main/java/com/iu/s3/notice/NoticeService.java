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
		long perblock = 5;
		pager.setStartRow((pager.getCurPage()-1)*perpager+1);
		pager.setLastRow(pager.getCurPage()*perpager);
//		long totalCount=72; 
//		long totalPage=totalCount%perpager==0?totalCount/perpager:totalCount/perpager+1;
//		long totalblock=totalCount%perblock==0?totalCount/perblock:totalCount/perblock+1;
		long curBlock = pager.getCurPage()/perblock;
		if(pager.getCurPage()%perblock!=0) {
			curBlock++;
		}
		long startnum = (curBlock-1)*perblock+1;
		long lastnum = curBlock*perblock;
		pager.setStartnum(startnum);
		pager.setLastnum(lastnum);
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
