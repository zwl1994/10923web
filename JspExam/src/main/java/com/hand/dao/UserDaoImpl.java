package com.hand.dao;

import com.hand.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

	@Override
//	public void save(Connection conn, User user) throws SQLException {
//		PreparedStatement ps = conn
//				.prepareCall("insert into tbl_user(name,password,email)"
//						+ "values(?,?,?)");
//		ps.setString(1, user.getName());
//
//		ps.setString(2, user.getPassword());
//		ps.setString(3, user.getEmail());
//		ps.execute();
//	}

//	public void updata(Connection conn, Long id, User user) throws SQLException {
//		String sql = "update tbl_user set name = ?,password =?,email=?"
//				+ "where id = ?";
//		PreparedStatement ps = conn.prepareStatement(sql);
//		ps.setString(1, user.getName());
//
//		ps.setString(2, user.getPassword());
//		ps.setString(3, user.getEmail());
//		ps.setLong(4, id);
//		ps.execute();
//	}

	public void delete(Connection conn, User user) throws SQLException {
		PreparedStatement ps = conn
				.prepareStatement("delete from tbl_user where id=?");
		ps.setLong(1, user.getId());
		ps.execute();
	}

	@Override
	public ResultSet select(Connection conn, User user) throws SQLException {
		PreparedStatement ps = conn
				.prepareStatement("select * from customer where first_name =?");
		ps.setString(1, user.getName());
		ResultSet rs = ps.executeQuery();
		return rs;
	}

	@Override
	public void save(Connection conn, User user) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updata(Connection conn, Long id, User user) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}