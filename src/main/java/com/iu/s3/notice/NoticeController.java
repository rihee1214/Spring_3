package com.iu.s3.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s3.util.Pager;

@Controller
@RequestMapping(value = "/notice/**")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("noticeList")
	public ModelAndView noticeList(Pager pager) throws Exception{
		ModelAndView model = new ModelAndView();
		model.addObject("nList", noticeService.noticeList(pager));
		model.addObject("pager", pager);
		model.setViewName("/notice/noticeList");
		return model;
	}
	
	@RequestMapping("noticeSelect")
	public void noticeSelect(NoticeDTO noticeDTO, Model model) throws Exception{
		model.addAttribute("nDTO", noticeService.noticeSelect(noticeDTO));
	}
	
	@RequestMapping("noticeInsert")
	public void noticeInsert() throws Exception{}
	
	@RequestMapping(value = "noticeInsert", method = RequestMethod.POST)
	public String noticeInsert(NoticeDTO noticeDTO) throws Exception{
		noticeService.noticeInsert(noticeDTO);
		return "redirect:./noticeList";
	}
	
	public void noticeDelete() throws Exception{
		
	}
	
	public void noticeUpdate() throws Exception{
		
	}
}
