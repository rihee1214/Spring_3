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
	public void memberLogin()throws Exception{	}
	
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
	
	@RequestMapping(value = "memberLogout")
	public String memberLogout(HttpSession session)throws Exception{
		session.invalidate();//세션의 유지기간을 0으로 만들어서 바로 종료시킨다.
		return "redirect:../";
	}

	@RequestMapping(value = "memberPage")
	public void memberPage()throws Exception{	}
	
	@RequestMapping(value = "memberDelete")
	public String memberDelete(HttpSession session)throws Exception{	
		memberService.memberDelete((MemberDTO)session.getAttribute("member"));
		session.invalidate();
		return "redirect:../";
	}
	
	@RequestMapping(value = "memberUpdate")
	public void memberUpdate()throws Exception{	}
	
	@RequestMapping(value = "memberUpdate", method = RequestMethod.POST)
	public String memberUpdate(MemberDTO memberDTO, HttpSession session)throws Exception{
		session.invalidate();
		memberService.memberUpdate(memberDTO);
		return "redirect:../";
	}
	
}
