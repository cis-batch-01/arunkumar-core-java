package com.technocis.coursemanagment.DAO;
import java.util.List;
import com.technocis.coursemanagment.model.Question;
public interface QuestionDAO {
	//get Topics
	public Question getquestion(int id);
	//get All Topics
	public List<Question>getallQuestion();
	//insert Topics
	public Question insertQuestion(Question question);
	//update Question
	public Question updateQuestion(int id,Question question);
	//delete Question
	public Question deleteQuestion(int id);
}
