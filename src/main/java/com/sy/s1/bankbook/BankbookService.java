package com.sy.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sy.s1.util.Pager;

@Service
public class BankbookService {

	@Autowired
	private BankbookDAO bankbookDAO;

	
	public int setDelete(Long bookNumber) { 
		return bankbookDAO.setDelete(bookNumber); 
	}
	 
	public int setInsert(BankbookDTO bankbookDTO) {
		return bankbookDAO.setInsert(bankbookDTO);
	}

	public List<BankbookDTO> getList(Pager pager) {
		pager.makeRow();
		pager.makeNum();
		return bankbookDAO.getList(pager);
	}

	public BankbookDTO getSelect(BankbookDTO bankbookDTO) {

		return bankbookDAO.getSelect(bankbookDTO);
	}
	
	public int setUpdate(BankbookDTO bankbookDTO) {
		return bankbookDAO.setUpdate(bankbookDTO);
	}
	
}
