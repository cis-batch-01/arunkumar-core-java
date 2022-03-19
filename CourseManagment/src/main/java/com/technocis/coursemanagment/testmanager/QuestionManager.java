package com.technocis.coursemanagment.testmanager;

import java.util.List;
import java.util.Scanner;

import com.technocis.coursemanagment.DAO.QuestionDAO;
import com.technocis.coursemanagment.DAO.TopicsDAO;
import com.technocis.coursemanagment.DAOImpl.QuestionDAOImpl;
import com.technocis.coursemanagment.DAOImpl.TopicsDAOImpl;
import com.technocis.coursemanagment.model.Question;
import com.technocis.coursemanagment.model.Topics;

public class QuestionManager {
	public static void questionmanager() {
		Scanner scan = new Scanner(System.in);
		QuestionDAO questionDao = new QuestionDAOImpl();
		char option = 'n';
		do {
			System.out.println(
					"1.Show a particular question \n2.List of all theQuestion \n3.Insert a question \n4.Update a question \n5.Remove a question");
			int choice = Integer.parseInt(scan.nextLine());
			switch (choice) {
			case 1:
				System.out.println("Enter the id to be viewed");
				int id = Integer.parseInt(scan.nextLine());
				Question getquestion = questionDao.getquestion(id);
				System.out.println(getquestion != null ? "Question   viewed" : "Question not found");
				System.out.println(getquestion);
				break;
			case 2:
				List<Question> resquestion = questionDao.getallQuestion();
				if (resquestion == null) {
					System.out.println("record not found");
				} else {
					for (Question question : resquestion) {
						System.out.println(question);
					}
				}
				break;
			case 3:
				System.out.println("Enter the details");
				String details = scan.nextLine();
				String insertedquestion[] = details.split(",");
				Question question = new Question(insertedquestion[0], Integer.parseInt(insertedquestion[1]),
						insertedquestion[2]);
				Question question1 = questionDao.insertQuestion(question);
				System.out
						.println(insertedquestion != null ? "inserted question Successfully" : "Question not inserted");
				break;
			case 4:
				System.out.println("Enter the id to be viewed");
				int updatedId = Integer.parseInt(scan.nextLine());
				Question oldquestion = questionDao.getquestion(updatedId);
				if (oldquestion == null) {
					System.out.println("Question id not found");
				} else {
					System.out.println(oldquestion);
					System.out.println("Enter the details");
					String details1 = scan.nextLine();
					String updatedquestion[] = details1.split(",");
					question = new Question(updatedquestion[0], Integer.parseInt(updatedquestion[1]),
							updatedquestion[2]);
					question = questionDao.updateQuestion(updatedId, question);
					System.out.println(
							updatedquestion != null ? "updated Question Successfully" : "question not updated");
				}
				break;
			case 5:
				System.out.println("enter the id to delete the topics");
				int deleteId = Integer.parseInt(scan.nextLine());
				Question deletedquestion = questionDao.deleteQuestion(deleteId);
				System.out.println(deletedquestion != null ? "deleted Question Successfully" : "Question not deleted");
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue (y/n)");
			option = scan.nextLine().charAt(0);
		} while (option == 'y' || option == 'Y');

	}
}
