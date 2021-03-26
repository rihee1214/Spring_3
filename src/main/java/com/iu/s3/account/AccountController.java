package com.iu.s3.account;

import java.util.Calendar;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s3.member.MemberDTO;

@Controller
@RequestMapping(value = "/account/**")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping("accountList")
	public ModelAndView accountList(HttpSession session)throws Exception{
		AccountDTO accountDTO = new AccountDTO();
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		accountDTO.setId(memberDTO.getId());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("accountList", accountService.accountList(accountDTO));
		modelAndView.setViewName("/account/accountList");
		return modelAndView;
	}
	
	@RequestMapping("accountInsert")
	public ModelAndView accountInsert(AccountDTO accountDTO, HttpSession session)throws Exception{
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		accountDTO.setId(memberDTO.getId());
		Calendar cal = Calendar.getInstance();
		
		return this.accountList(session);
	}
}
