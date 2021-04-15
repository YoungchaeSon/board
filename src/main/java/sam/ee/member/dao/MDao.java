package sam.ee.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import sam.ee.member.dto.BDto;
import sam.ee.member.dto.MDto;
import sam.ee.member.util.Constant;

public class MDao {

	JdbcTemplate template;
	public MDao() {
		this.template = Constant.template;
	}
	public void join(final String mName,final String mId,final String mPassword,final String mEmail,final String mZipNo,final String mAddr1,final String mAddr2,final int mYear,
			final int mMonth,final int mDate,final String mInterest,final String mIntroduce, final String mIdentity) {
		
		this.template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				
				String query ="insert into mvc_member (mName,mId,mPassword,mEmail,mZipNo,mAddr1,mAddr2,mYear,mMonth,mDate,mInterest,mIntroduce,mIdentity)"
						+ "	values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, mName);
				pstmt.setString(2, mId);
				pstmt.setString(3, mPassword);
				pstmt.setString(4, mEmail);
				pstmt.setString(5, mZipNo);
				pstmt.setString(6, mAddr1);
				pstmt.setString(7, mAddr2);
				pstmt.setInt(8, mYear);
				pstmt.setInt(9, mMonth);
				pstmt.setInt(10, mDate);
				pstmt.setString(11, mInterest);
				pstmt.setString(12, mIntroduce);
				pstmt.setString(13, mIdentity);
				return pstmt;
			}
		});
	}
	
	public ArrayList<MDto> login(final String lId, final String lPw) {
		System.out.println("login activate");

				System.out.println(lId+"///"+lPw);
				String query = "select mId,mPassword from mvc_member where mId='"+lId+"' and mPassword='"+lPw+"'";
			
				
				return (ArrayList<MDto>) template.query(query, new BeanPropertyRowMapper<MDto>(MDto.class));
			}
	public ArrayList<MDto> list() {
		String query = "select * from mvc_member";
		return (ArrayList<MDto>) template.query(query, new BeanPropertyRowMapper<MDto>(MDto.class));
		
	}
	public ArrayList<MDto> selfdetail(Object object) {
		String query = "select * from mvc_member where mId ='"+object+"'";
		return (ArrayList<MDto>) template.query(query, new BeanPropertyRowMapper<MDto>(MDto.class));
		
	}
	public MDto detail(Object object) {
		String query = "select * from mvc_member where mId ='"+object+"'";
		return template.queryForObject(query, new BeanPropertyRowMapper<MDto>(MDto.class));
		
	}
	public void delete(final String mId) {
		String query = "delete from mvc_member where mId = ?";
			this.template.update(query, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, mId);
			}
		});
	}
	
	
}
