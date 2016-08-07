package com.hand.service;

import com.hand.entity.User;
import com.hand.util.ConnectionFaction;

import java.sql.Connection;
import java.sql.ResultSet;

import com.hand.dao.UserDao;
import com.hand.dao.UserDaoImpl;

public class checkService {
	UserDao userdao = new UserDaoImpl();
	User user = new User();
	public boolean check(User user){
		Connection conn = null;
		try {
			conn = ConnectionFaction.getInstance().makecConnection();
			conn.setAutoCommit(false);
			ResultSet rs = userdao.select(conn, user);
			if(rs.next())
				return true;
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (Exception e2) {
			}
		}finally{
			try {
				conn.close();
			} catch (Exception e3) {
				// TODO: handle exception
			}
		}
		return false;
	}
}
