package com.hand.dao;

import com.hand.entity.Film;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;



public interface FilmDao {
	
	public void save(Connection conn, Film film) throws SQLException;
	public void updata(Connection conn,Long id,Film film)throws SQLException;
	public void delete(Connection conn,String s)throws SQLException;
	public ResultSet select(Connection conn)throws SQLException;
	public ResultSet selectlang(Connection conn)throws SQLException;
	

}