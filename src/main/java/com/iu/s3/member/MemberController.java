package com.iu.s3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/member/**")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "memberLogin")
	public String memberLogin(MemberDTO memberDTO)throws Exception{
		
		return "redirect:../home.jsp";
	}
	
	@RequestMapping(value = "memberJoin")
	public void memberJoin()throws Exception{
		
	}

	@RequestMapping(value = "memberUpdate")
	public void memberUpdate()throws Exception{
		
	}
	
	@RequestMapping(value = "memberDelete")
	public void memberDelete()throws Exception{
		
	}
}
