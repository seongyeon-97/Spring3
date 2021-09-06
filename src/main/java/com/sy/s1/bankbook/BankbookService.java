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
		System.out.println(pager.getKind());
		System.out.println(pager.getSearch());
		//totalCount 구해오기
		Long totlaCount = bankbookDAO.getCount(pager);
		pager.makeNum(totlaCount);
		pager.makeRow();
		return bankbookDAO.getList(pager);
	}

	public BankbookDTO getSelect(BankbookDTO bankbookDTO) {

		return bankbookDAO.getSelect(bankbookDTO);
	}
	
	public int setUpdate(BankbookDTO bankbookDTO) {
		return bankbookDAO.setUpdate(bankbookDTO);
	}
	
}
