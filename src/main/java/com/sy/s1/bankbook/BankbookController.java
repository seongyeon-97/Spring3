package com.sy.s1.bankbook;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bankbook/*")
public class BankbookController {
	//pojo (plain old java object)
	
	@Autowired
	private BankbookService bankbookService; 
	
	@RequestMapping("bankbookDelete")
	public String delete(Long bookNumber) {
		int result = bankbookService.SetDelete(bookNumber);
		return "redirect: ./bankbookList";
	}
	
	@RequestMapping("bankbookList")
	public ModelAndView list(ModelAndView mv){
		List<BankbookDTO> ar = bankbookService.getList();
		mv.addObject("list", ar);
		mv.setViewName("bankbook/bankbookList");
		return mv;
	}
	
	@RequestMapping("bankbookSelect")
	public void select(BankbookDTO bankbookDTO, Model model) {
		
		bankbookDTO = bankbookService.getSelect(bankbookDTO);
		model.addAttribute("dtov", bankbookDTO);
		
	}
	
	@RequestMapping(value = "bankbookInsert", method = RequestMethod.GET)
	public void insert() {}
		
	@RequestMapping(value = "bankbookInsert", method = RequestMethod.POST)	
	public String insert(BankbookDTO bankbookDTO) {
		
		int result = bankbookService.setInsert(bankbookDTO);
		
		return "redirect: ./bankbookList";
	}
		
	
	
}
