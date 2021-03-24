package com.iu.s3.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member/**")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "memberLogin")
	public void memberLogin() {	}
	
	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
	public String memberLogin(MemberDTO memberDTO, HttpSession session)throws Exception{
		memberDTO = memberService.memberLogin(memberDTO);
		session.setAttribute("member", memberDTO);
		return "redirect:../";
	}
	
	@RequestMapping(value = "memberJoin")
	public void memberJoin()throws Exception{}
	
	@RequestMapping(value = "memberJoin", method = RequestMethod.POST)
	public String memberJoin(MemberDTO memberDTO)throws Exception{
		int result = memberService.memberJoin(memberDTO);
		if(result>=1) {
			return "redirect:../";
		}else {
			return "/member/memberJoin";
		}
	}

	@RequestMapping(value = "memberUpdate")
	public void memberUpdate()throws Exception{
		
	}
	
	@RequestMapping(value = "memberDelete")
	public void memberDelete()throws Exception{
		
	}
}
