package com.technocis.coursemanagment.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.technocis.coursemanagment.DAO.QuestionDAO;
import com.technocis.coursemanagment.connection.ConnectionUtill;
import com.technocis.coursemanagment.model.Question;

public class QuestionDAOImpl implements QuestionDAO {
	 Question Question = null;
	static String getQuestion="select id,name,cid,desc from Question where id=?";
	static String getallQuestion= "select id,name,cid,desc from Question";
	static String insertQuestion="insert into question(id,name,cid,desc)values(?,?,?,?)";
	static String UpdateQuestion="update question(id,name,cid,desc where id=? ";
	static String deleteQuestion="delete from Question where id=?";

	public Question getquestion(int id) {
		Connection con=ConnectionUtill.getDBConnect();
		try{
		PreparedStatement pstmt=con.prepareStatement(getQuestion);
		ResultSet rs=pstmt.executeQuery();
		rs.getInt(id);
		if(rs.next())
		{
		Question question=new Question(Integer.parseInt(rs.getString(1)), rs.getString(2), Integer.parseInt(rs.getString(3)), rs.getString(4));
		}
		return Question ; 
		}catch(SQLException e){
			e.printStackTrace();}
		return null;
		}
		public List<Question> getallQuestion() {
			List<Question> resquestion=new ArrayList();
			Connection con=ConnectionUtill.getDBConnect();
			try{
			PreparedStatement pstmt=con.prepareStatement(getallQuestion);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
			Question requestion =new Question(Integer.parseInt(rs.getString(1)), rs.getString(2), Integer.parseInt(rs.getString(3)), rs.getString(4));
			
		return null;
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return resquestion;
	}

	public Question insertQuestion(Question question) {
		Connection con=ConnectionUtill.getDBConnect();
		try{
		PreparedStatement pstmt=con.prepareStatement(insertQuestion);
		int res=pstmt.executeUpdate();
		pstmt.setInt(1, Question.getId());
		pstmt.setString(2, Question.getName());
		pstmt.setInt(3,Question.getCid());
		pstmt.setString(4, Question.getDesc());
		int rs=pstmt.executeUpdate();
		if(res>0)
		{
			return Question;
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	} 
	return null;
	}
	public Question updateQuestion1(int id, Question question) {
		Connection con=ConnectionUtill.getDBConnect();
		try {
			PreparedStatement pstmt=con.prepareStatement(UpdateQuestion);
			pstmt.setInt(4, id);
			pstmt.setString(1, question.getName());
			pstmt.setInt(2,question.getCid());
			pstmt.setString(3, question.getDesc());
			int res=pstmt.executeUpdate();
			if(res>0)
			{
				return question;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	
			}

	public Question deleteQuestion(int id) {
		Connection con=ConnectionUtill.getDBConnect();
		Question question=getquestion(id);
		try {
			PreparedStatement pstmt=con.prepareStatement(deleteQuestion);
			pstmt.setInt(1, id);
			int res=pstmt.executeUpdate();
			if(res>0)
			{
				return question;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	
			}
	public Question updateQuestion(int id,Question question) {
		Connection con=ConnectionUtill.getDBConnect();
		try {
			PreparedStatement pstmt=con.prepareStatement(UpdateQuestion);
			pstmt.setInt(5, id);
			pstmt.setString(1, question.getName());
			pstmt.setInt(2,question.getCid());
			pstmt.setString(3,question.getDesc());
			int res=pstmt.executeUpdate();
			if(res>0)
			{
				return question;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return question;
		
	}
	

}
