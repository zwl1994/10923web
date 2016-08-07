package com.hand.dao;

import com.hand.entity.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;



public interface UserDao {
	
	public void save(Connection conn, User user) throws SQLException;
	public void updata(Connection conn,Long id,User user)throws SQLException;
	public void delete(Connection conn,User user)throws SQLException;
	public ResultSet select(Connection conn,User user)throws SQLException;

}
