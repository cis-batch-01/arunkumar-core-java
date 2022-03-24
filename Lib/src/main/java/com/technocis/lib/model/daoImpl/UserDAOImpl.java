package com.technocis.lib.model.daoImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import com.technocis.lib.model.User;
import com.technocis.lib.model.connection.ConnectionUtill;
import com.technocis.lib.model.dao.UserDAO;
public class UserDAOImpl implements UserDAO{
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	public String SelectAllUser="select id,Name,DOB,Email,Password,PhoneNumber,Address,JDate from User";
	public String selectUser="select Name,DOB,Email,Password,PhoneNumber,Address,JDate from User where id =?";
	public String insertUser="insert into User(Name,Dob,Email,Password,PhoneNumber,Address,JDate) values(?,?,?,?,?,?,?)";
	public String UpdateUser="update User setName=?,Dob=?,Email=?,Password=?,PhoneNumber=?,Address=?,JDate=?where Id=?";
	public String deleteser="delete from User where id=?";
	public List<User> getAllUser() {
	 User user=null;
		Connection con = ConnectionUtill.getDBConnect();
		List <User> resUser=new ArrayList<User>();
		try {
			PreparedStatement pstmt = con.prepareStatement(SelectAllUser);
			ResultSet res = pstmt.executeQuery();
			while (res.next())
			{
				user =new User(res.getInt(1), res.getString(2), res.getDate(3), res.getString(4), res.getString(5),res.getLong(6),res.getString(7), res.getDate(8));
				resUser.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resUser;
	}
public User getUser(int id) {
		Connection con = ConnectionUtill.getDBConnect();
		User user = null;
		try {
			PreparedStatement pstmt = con.prepareStatement(selectUser);
			pstmt.setInt(1, id);
			ResultSet res = pstmt.executeQuery();
			if (res.next())
			{
			user = new User(res.getInt(1), res.getString(2), res.getDate(3), res.getString(4), res.getString(5),res.getLong(6),res.getString(7), res.getDate(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	public User insertUser(User user) {
		Connection con=ConnectionUtill.getDBConnect();
		try {
			PreparedStatement pstmt=con.prepareStatement(insertUser);
			pstmt.setInt(1, user.getId());
			pstmt.setString(2,user.getName());
			pstmt.setDate(3,new java.sql.Date(user.getDob().getTime()));
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getPassword());
			pstmt.setLong(6,user.getPhoneNumber());
			pstmt.setString(7, user.getAddress());
			pstmt.setDate(8,new java.sql.Date(user.getjDate().getTime()));
			int res=pstmt.executeUpdate();
			if(res>0)
			{
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}
	public User updateUser(int id, User user) {
		Connection con=ConnectionUtill.getDBConnect();
		try {
			PreparedStatement pstmt=con.prepareStatement(UpdateUser);
			pstmt.setInt(8,user.getId());
			pstmt.setString(1,user.getName());
			pstmt.setDate(2,new java.sql.Date(user.getDob().getTime()));
			pstmt.setString(3,user.getEmail());
			pstmt.setString(4,user.getPassword());
			pstmt.setLong(5,user.getPhoneNumber());
			pstmt.setString(6,user.getAddress());
			pstmt.setDate(7,new java.sql.Date(user.getjDate().getTime()));
			int  res=pstmt.executeUpdate();
			if(res>0)
			{
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
		}
	public User deleteUser(int id) {
		Connection con=ConnectionUtill.getDBConnect();
		User user=getUser(id);
		try {
			PreparedStatement pstmt=con.prepareStatement(deleteser);
			pstmt.setInt(1, id);
			int res=pstmt.executeUpdate();
			if(res>0)
			{
				return user;
			}
	} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
}
}