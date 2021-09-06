package com.sy.s1.bankbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sy.s1.util.Pager;

@Repository
public class BankbookDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.sy.s1.bankbook.BankbookDAO.";
	
	public int setUpdate(BankbookDTO bankbookDTO) {
		return sqlSession.update(NAMESPACE+"setUpdate", bankbookDTO);
	}
	
	public int setDelete(Long bookNumber) {
		return sqlSession.delete(NAMESPACE+"setDelete", bookNumber);
	}
	
	public int setInsert(BankbookDTO bankbookDTO) {
		return sqlSession.insert(NAMESPACE+"setInsert", bankbookDTO);
	}
	
	public List<BankbookDTO> getList(Pager pager){
		return sqlSession.selectList(NAMESPACE+"getList", pager);
	}
	
	public BankbookDTO getSelect(BankbookDTO dto) {
		return sqlSession.selectOne(NAMESPACE+"getSelect", dto);		
	}
	
	public Long getCount(Pager pager) {
		return sqlSession.selectOne(NAMESPACE+"getCount", pager);
	}
}
