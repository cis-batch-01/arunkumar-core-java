package com.technocis.Topics.model.TopicsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.technocis.Topics.model.Topics;

public class TopicsDAOImpl implements TopicsDAO {
	static String selectAllTopics="select id,name,chapter,description from Topic";
	static String selectTopics="select id,name,chapter,description from Topic where id=?";
	static String insertTopics="insert into Topic (name,chapter,description) values(?,?,?)";
	static String updateTopics="update Topic set name=?,chapter=?,description=? where id=?";
	static String deleteTopics="delete from  Topic where id=?";
	public Topics getTopics(int id)  {
		Topics topics=null;
		Connection con=ConnectionUtil.getDBConnect();
		try {
		PreparedStatement pstmt=con.prepareStatement(selectTopics);
			
				pstmt.setInt(1, id);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				topics=new Topics(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return topics ;
		}
	public List<Topics> getallTopics() {
		List<Topics> resList=new ArrayList();
		Connection con=ConnectionUtil.getDBConnect();
		try {
			PreparedStatement pstmt=con.prepareStatement(selectAllTopics);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
			resList.add(new Topics(rs.getInt(1) ,rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resList;
	}
			

	public Topics insertTopics(Topics topics) {
		Connection con=ConnectionUtil.getDBConnect();
		try {
			PreparedStatement pstmt=con.prepareStatement(insertTopics);
			pstmt.setString(1,topics.getName());
			pstmt.setString(2,topics.getDesc());
			pstmt.setString(3,topics.getChapter());
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

	public Topics updateTopics(int id, Topics topics) {
		Connection con=ConnectionUtil.getDBConnect();
		try {
			PreparedStatement pstmt=con.prepareStatement(updateTopics);
			pstmt.setString(1,topics.getName());
			pstmt.setString(2,topics.getDesc());
			pstmt.setString(3,topics.getChapter());
			pstmt.setInt(4,id );
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
	Connection con=ConnectionUtil.getDBConnect();
	Topics topics=getTopics(id);
	try {
		PreparedStatement pstmt=con.prepareStatement(deleteTopics);
		pstmt.setInt(1, id);
		int res=pstmt.executeUpdate();
		
		if(res>0) {
			return topics ;
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return null;
}


}

