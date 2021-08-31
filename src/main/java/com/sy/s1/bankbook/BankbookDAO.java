package com.sy.s1.bankbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;




public class BankbookDAO {
	
	@Autowired
	private DataSource dataSource;
		
	public int setInsert(BankbookDTO bankbookDTO) {
		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement st = null;
		ResultSet rs = null;
		int result = 0;
		String sql = "INSERT INTO BANKBOOK(BOOKNUMBER, BOOKNAME, BOOKRATE, BOOKSALE) VALUES(BANKBOOK_SEQ.NEXTVAL, ?, ?, ?)";
		
		try {
			st = con.prepareStatement(sql);
			st.setString(1, bankbookDTO.getBookName());
			st.setDouble(2, bankbookDTO.getBookRate());
			st.setInt(3, bankbookDTO.getBookSale());			
			
			result = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		return result;
	}
		
	public ArrayList<BankbookDTO> getList() {
		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement st = null;
		ResultSet rs = null;
		ArrayList<BankbookDTO> ar = new ArrayList<BankbookDTO>();
		String sql = "SELECT * FROM BANKBOOK";
		try {
			st = con.prepareStatement(sql);
			rs = st.executeQuery();
			
			while(rs.next()) {
				BankbookDTO dto = new BankbookDTO();
				dto.setBookNumber(rs.getLong("booknumber"));
				dto.setBookName(rs.getString("bookname"));
				dto.setBookRate(rs.getDouble("bookrate"));
				dto.setBookSale(rs.getInt("booksale"));
				ar.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		return ar;
	}
	
	public BankbookDTO getSelect(BankbookDTO dto) {
		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement st = null;
		ResultSet rs = null;
		BankbookDTO result = null;
		String sql = "SELECT * FROM BANKBOOK WHERE BOOKNUMBER=?";
		try {
			st = con.prepareStatement(sql);
			st.setLong(1, dto.getBookNumber());
			rs = st.executeQuery();
			
			if(rs.next()) {
				result = new BankbookDTO();
				result.setBookNumber(rs.getLong("bookNumber"));
				result.setBookName(rs.getString("bookName"));
				result.setBookRate(rs.getDouble("bookRate"));
				result.setBookSale(rs.getInt("bookSale"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		return result;
		
	}
}
