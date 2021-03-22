package com.iu.s3.bankbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	@RequestMapping(value = "/bankbook/bankbookList")
	public ModelAndView bankbookList(ModelAndView mav) throws Exception{
		System.out.println("BankBookList");
		mav.addObject("bblist",bankBookService.bankBookList());
		mav.setViewName("bankbook/bankbookList");
		return mav;
	}
	
	@RequestMapping(value = "/bankbook/bankbookAdd")
	public void bankbookAdd() {
		System.out.println("BankBookAdd");
	}
	
	@RequestMapping(value = "/bankbook/bankbookAdd", method = RequestMethod.POST)
	public void bankbookAdd(BankBookDTO bDTO)throws Exception{
		System.out.println("BankBookAdd");
		bankBookService.bankBookAdd(bDTO);
		System.out.println("입력 성공");
	}
	
	@RequestMapping(value = "/bankbook/bankbookSelect")
	public ModelAndView bankbookSelect(BankBookDTO bDTO,ModelAndView mav) throws Exception {
		System.out.println("BankBookSelect");
		mav.setViewName("/bankbook/bankbookSelect");
		mav.addObject("bDTO",bankBookService.bankBookSelect(bDTO));
		return mav;
	}
	
	@RequestMapping(value = "/bankbook/bankbookUpdate")
	public Model bankbookUpdate(int bookNumber, Model model) {
		System.out.println("BankBookUpdate");
		model.addAttribute("number", bookNumber);
		return model;
	}
	
	@RequestMapping(value = "/bankbook/bankbookUpdate", method = RequestMethod.POST)
	public String bankbookUpdate(BankBookDTO bDTO)throws Exception {
		System.out.println("BankBookUpdate");
		bankBookService.bankBookUpdate(bDTO);
		System.out.println("입력성공");
		return "redirect:bankbookList";
	}
	
	@RequestMapping(value = "/bankbook/bankbookRemove")
	public void bankbookRemove() {
		System.out.println("BankBookRemove");
	}
}
