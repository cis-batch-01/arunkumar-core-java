package com.technocis.coursemanagment.testing;

import java.util.Scanner;

import com.technocis.coursemanagment.DAO.QuestionDAO;
import com.technocis.coursemanagment.DAOImpl.QuestionDAOImpl;
import com.technocis.coursemanagment.testmanager.QuestionManager;
import com.technocis.coursemanagment.testmanager.TopicsManager;

public class CourseManagerTest {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char option='n';
		do
		{
		System.out.println("1.Question \n2.Topics ");
		int choice=Integer.parseInt(scan.nextLine());
		switch(choice)
		{
		case 1:
			try {
			QuestionManager.questionmanager();
			}catch(NumberFormatException e) {
				//System.out.println(e.getMessage());
				System.out.println("id should be an integer");
			}
			break;
		case 2:
			try {
			
			TopicsManager.TopicsManager();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		}
		System.out.println("Do you want to continue (y/n)");
		option=scan.nextLine().charAt(0);
		}while(option=='y'||option=='Y');
	
	
	}
}
