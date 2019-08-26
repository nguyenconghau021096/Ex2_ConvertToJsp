package com.nguyenconghau.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import JavaBean.UserBean;

public class UserRepository {
	
	public UserBean fetchUser(ResultSet rs) throws SQLException {
		return new UserBean(
				rs.getString("username"),
				rs.getString("email"),
				rs.getInt("gender"),
				rs.getString("password"));
	}
	
	public List<UserBean> fetchAllUser (ResultSet rs) throws SQLException{
		List<UserBean> list = new ArrayList<UserBean>();
		while (rs.next()) {
			list.add(fetchUser(rs));
		}
		return list;
	}
	
	
	public int deleteUser(String username) {
		String sql = "DELETE FROM user WHERE username = ?";
		Connection conn = JDBCConnection.getJDBCConnection();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
	
			int ret = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			return ret;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public int change(String username,String password,int gender, String email) {
		String sql = "UPDATE user SET password = ?, gender = ?, email = ? WHERE username = ?";
		Connection conn = JDBCConnection.getJDBCConnection();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setInt(2, gender);
			pstmt.setString(3, email);
			pstmt.setString(4, username);
			int ret = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			return ret;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public int changePassword(String username, String newPassword) {
		String sql = "UPDATE user SET password = ? WHERE username = ?";
		Connection conn = JDBCConnection.getJDBCConnection();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newPassword);
			pstmt.setString(2, username);
	
			int ret = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			return ret;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public int add(UserBean obj) {
		String sql = "INSERT INTO user VALUES (?,?,?,?)";
		Connection conn = JDBCConnection.getJDBCConnection();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, obj.getUsername());
			pstmt.setString(2, obj.getEmail());
			pstmt.setInt(3, obj.getGender());
			pstmt.setString(4, obj.getPassword());
			int ret = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			return ret;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		
	}
	
	
	public UserBean login(String username, String password) {
		String sql = "SELECT * FROM user WHERE password = ? AND username = ?";
		UserBean obj = null;
		Connection conn = JDBCConnection.getJDBCConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setString(2, username);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				obj = fetchUser(rs);
			}
			rs.close();
			pstmt.close();
			conn.close();
			return obj;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	public UserBean getUser(String username) {
		String sql = "SELECT * FROM user WHERE username = ?";
		UserBean obj = null;
		Connection conn = JDBCConnection.getJDBCConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				obj = fetchUser(rs);
			}
			rs.close();
			pstmt.close();
			conn.close();
			return obj;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public List<UserBean> getAllUser(){
		Connection conn = JDBCConnection.getJDBCConnection();
		List<UserBean> list = new ArrayList<UserBean>();
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM user";
			ResultSet rs = stmt.executeQuery(sql);
			list = fetchAllUser(rs);
			
			rs.close();
			conn.close();
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			list.add(new UserBean());
			return list;
		}
	}
}
