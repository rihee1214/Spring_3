package com.iu.s3.bankbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {

	public int bankbookAdd(BankBookDTO bankbookDTO) throws Exception{
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "INSERT INTO BANKBOOK VALUES(BANKBOOK_SEQ.NEXTVAL,?,?,?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, bankbookDTO.getBookName());
		st.setDouble(2, bankbookDTO.getBookRate());
		st.setString(3, bankbookDTO.getBookSale());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	public int bankbookUpdate(BankBookDTO bankbookDTO) throws Exception{
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "UPDATE BANKBOOK SET BOOKNAME = ?, BOOKRATE = ? , BOOKSALE = ? WHERE BOOKNUMBER = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, bankbookDTO.getBookName());
		st.setDouble(2, bankbookDTO.getBookRate());
		st.setString(3, bankbookDTO.getBookSale());
		st.setLong(4, bankbookDTO.getBookNumber());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	public int bankbookDelete(BankBookDTO bankbookDTO) throws Exception{
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "DELETE FROM BANKBOOK WHERE NUMBER = ? ";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, bankbookDTO.getBookNumber());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	public List<BankBookDTO> bankbookList() throws Exception{
		ArrayList<BankBookDTO> arr = new ArrayList<BankBookDTO>();
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "SELECT * FROM BANKBOOK";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BankBookDTO bDTO = new BankBookDTO();
			bDTO.setBookNumber(rs.getLong("bookNumber"));
			bDTO.setBookName(rs.getString("bookName"));
			bDTO.setBookRate(rs.getDouble("bookRate"));
			bDTO.setBookSale(rs.getString("bookSale"));
			arr.add(bDTO);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return arr;
	}
	
	public BankBookDTO bankbookSelect(BankBookDTO bDTO) throws Exception{
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "SELECT * FROM BANKBOOK WHERE BOOKNUMBER = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setLong(1, bDTO.getBookNumber());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			bDTO.setBookNumber(rs.getLong("bookNumber"));
			bDTO.setBookName(rs.getString("bookName"));
			bDTO.setBookRate(rs.getDouble("bookRate"));
			bDTO.setBookSale(rs.getString("bookSale"));
		}else {
			bDTO=null;
		}
		
		rs.close();
		st.close();
		con.close();
		
		return bDTO;
	}
	
	
}
