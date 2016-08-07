package com.hand.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hand.entity.Film;

public class FilmDaoImpl implements FilmDao {

	@Override
	public void save(Connection conn, Film film) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updata(Connection conn, Long id, Film film) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Connection conn,String s) throws SQLException {
		
		String sql1="SET FOREIGN_KEY_CHECKS = 0";
		String sql = "delete from film where film_id = "+s ;
		PreparedStatement ps1= conn.prepareStatement(sql1);
		PreparedStatement ps = conn.prepareStatement(sql);
		ps1.execute();
		ps.execute();
	}

	@Override
	public ResultSet select(Connection conn) throws SQLException {
		 String sql = "select f.film_id,f.title,f.description,l.name "
		 		+ "from film f,language l WHERE f.language_id=l.language_id ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		return rs;
		
		
	}

	@Override
	public ResultSet selectlang(Connection conn) throws SQLException {
		String sql = "SELECT name FROM language";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		return rs;
	}

}
