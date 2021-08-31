package com.sy.s1.bankbook;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sy.s1.util.DBConnector;


public class BankbookService {
	
	private BankbookDAO bankbookDAO;
	
	
	public void setBankbookDAO(BankbookDAO bankbookDAO) {
		this.bankbookDAO = bankbookDAO;
	}



	
	public ArrayList<BankbookDTO> getList() {
		ArrayList<BankbookDTO> ar = bankbookDAO.getList();
		return ar;
	}
	
}