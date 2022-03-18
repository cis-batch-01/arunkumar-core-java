package com.technocis.coursemanagment.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.technocis.coursemanagment.DAO.TopicsDAO;
import com.technocis.coursemanagment.connection.ConnectionUtill;
import com.technocis.coursemanagment.model.Question;
import com.technocis.coursemanagment.model.Topics;

public class TopicsDAOImpl implements TopicsDAO {
	Topics topics = null;
	static String getTopics="select id,name,cid,desc from Topics where id=?";
	static String getallTopics= "select id,name,cid,desc from Topics";
	static String insertTopics="insert into Topics(id,name,cid,desc)values(?,?,?,?)";
	static String Updatetopics="update Topics(id,name,cid,desc where id=? ";
	static String deleteTopics="delete from Topics where id=?";
	public Topics getTopics(int id) {
		Connection con=ConnectionUtill.getDBConnect();
		try{
		PreparedStatement pstmt=con.prepareStatement(getTopics);
		ResultSet rs=pstmt.executeQuery();
		rs.getInt(id);
		if(rs.next())
		{
		Topics topics=new Topics(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
		}
		return topics ; 
		}catch(SQLException e){
			e.printStackTrace();}
		return null;
		}
		
		public List<Topics> getallTopics() {
			List<Topics> restopics1=new ArrayList();
			Connection con=ConnectionUtill.getDBConnect();
			try{
			PreparedStatement pstmt=con.prepareStatement(getallTopics);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				Topics restopic1 =new Topics(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		return restopics1;
	}
	public Topics insertTopics(Topics topics) {
		Connection con=ConnectionUtill.getDBConnect();
		try{
		PreparedStatement pstmt=con.prepareStatement(insertTopics);
		int res=pstmt.executeUpdate();
		pstmt.setString(1, topics.getName());
		pstmt.setString(2, topics.getTopic());
		pstmt.setString(3,topics.getDesc());
		int rs=pstmt.executeUpdate();
		if(res>0)
		{
			
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	} 
		return topics;}

	public Topics updateTopics(int id, Topics topics) {
		Connection con=ConnectionUtill.getDBConnect();
		try {
			PreparedStatement pstmt=con.prepareStatement(Updatetopics);
			pstmt.setInt(4, id);
			pstmt.setString(1, topics.getName());
			pstmt.setString(2, topics.getTopic());
			pstmt.setString(3,topics.getDesc());
			int res=pstmt.executeUpdate();
			if(res>0)
			{
				return topics;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	
	}
	public Topics deleteTopics(int id) {
		Connection con=ConnectionUtill.getDBConnect();
		Topics topics=getTopics(id);
		try {
			PreparedStatement pstmt=con.prepareStatement(deleteTopics);
			pstmt.setInt(1, id);
			int res=pstmt.executeUpdate();
			if(res>0)
			{
				return topics;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}

}
