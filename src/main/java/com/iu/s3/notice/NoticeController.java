package com.iu.s3.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/notice/**")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("noticeList")
	public ModelAndView noticeList(ModelAndView model) throws Exception{
		model.addObject("nList", noticeService.noticeList());
		model.setViewName("/notice/noticeList");
		return model;
	}
	
	@RequestMapping("noticeSelect")
	public void noticeSelect(NoticeDTO noticeDTO, Model model) throws Exception{
		model.addAttribute("nDTO", noticeService.noticeSelect(noticeDTO));
	}
	
	public void noticeInsert() throws Exception{
		
	}
	
	public void noticeDelete() throws Exception{
		
	}
	
	public void noticeUpdate() throws Exception{
		
	}
}
