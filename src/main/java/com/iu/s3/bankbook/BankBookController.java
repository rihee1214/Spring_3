package com.iu.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/bankbook/**")
public class BankBookController {

	@Autowired
	private BankBookService bankBookService;
	
	@RequestMapping(value = "bankbookList", method = RequestMethod.GET)
	public void bankbookList(Model model) throws Exception{
		List<BankBookDTO> ar = bankBookService.bankbookList();
		model.addAttribute("list", ar);
	}
	
	@RequestMapping("bankbookSelect")
	public ModelAndView bankbookSelect(BankBookDTO bankBookDTO)throws Exception{
		ModelAndView mav = new ModelAndView();
		bankBookDTO = bankBookService.bankbookSelect(bankBookDTO);
		mav.addObject("dto", bankBookDTO);
		mav.setViewName("/bankbook/bankbookSelect");
		return mav;
	}
	@RequestMapping(value="bankbookUpdate")
	public void bankbookUpdate(BankBookDTO bankBookDTO, Model model) throws Exception{
		bankBookDTO = bankBookService.bankbookSelect(bankBookDTO);
		model.addAttribute("dto", bankBookDTO);
	}
	
	@RequestMapping(value="bankbookUpdate", method = RequestMethod.POST)
	public String bankbookUpdate(BankBookDTO bankBookDTO)throws Exception{
		int result = bankBookService.bankbookUpdate(bankBookDTO);
		return "redirect:./bankbookList";
	}
	
	@RequestMapping("bankbookDelete")
	public String bankbookDelete(BankBookDTO bankBookDTO)throws Exception{
		bankBookService.bankbookDelete(bankBookDTO);
		return "redirect:./bankbookList";
	}
}