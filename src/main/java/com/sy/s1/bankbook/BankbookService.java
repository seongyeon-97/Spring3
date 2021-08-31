package com.sy.s1.bankbook;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;

public class BankbookService {
	
	private BankbookDAO bankbookDAO;
	
	public BankbookService() {
		bankbookDAO = new BankbookDAO();
	}
	
	public ArrayList<BankbookDTO> getList() {
		ArrayList<BankbookDTO> ar = bankbookDAO.getList();
		return ar;
	}
	
}