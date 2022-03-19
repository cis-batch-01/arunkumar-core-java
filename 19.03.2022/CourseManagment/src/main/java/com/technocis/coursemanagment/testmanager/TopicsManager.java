package com.technocis.coursemanagment.testmanager;

import java.util.List;
import java.util.Scanner;

import com.technocis.coursemanagment.DAO.TopicsDAO;
import com.technocis.coursemanagment.DAOImpl.TopicsDAOImpl;
import com.technocis.coursemanagment.model.Topics;


public class TopicsManager {
	public static void TopicsManager() {

		Scanner scan=new Scanner(System.in);
		TopicsDAO topicsDao=new TopicsDAOImpl();
		char option='n';
		do
		{
		System.out.println("1.Show a particular Topics \n2.List of all the Toics\n3.Insert a Topics \n4.Update a Topics \n5.Remove a Topics");
		int choice=Integer.parseInt(scan.nextLine());
		switch(choice)
		{
		case 1:
			System.out.println("Enter the id to be viewed");
			int id=Integer.parseInt(scan.nextLine());
			Topics getTopics=topicsDao.getTopics(id);
			System.out.println(getTopics!=null?"Topics  successfully viewed":"Topics not found");
			System.out.println(getTopics);	
			break;
		case 2:
			List<Topics> restopics =topicsDao.getallTopics();
			if(restopics==null)
			{
				System.out.println("record not found");
			}
			else
			{
			for(Topics topics:restopics)
			{
			System.out.println(topics);
			}
			}
			break;
		case 3:
			System.out.println("Enter the details");
			String details=scan.nextLine();
			String  insertedTopics[]=details.split(",");
			Topics topics=new Topics( insertedTopics[0], insertedTopics[1], insertedTopics[2]);
			Topics  topics1=topicsDao.insertTopics(topics);
			System.out.println(insertedTopics!=null?"inserted Topics Successfully":"Topics not inserted");
			break;
		case 4:
			System.out.println("Enter the id to be viewed");
			int updatedId=Integer.parseInt(scan.nextLine());
			Topics oldTopics=topicsDao.getTopics(updatedId);
			if(oldTopics==null) {
				System.out.println("Topic id not found ");
			}
			else {
			System.out.println(oldTopics);
			System.out.println("Enter the details");
			String details1=scan.nextLine();
			String  UpdatedTopics[]=details1.split(",");
			topics1=new Topics( UpdatedTopics[0], UpdatedTopics[1], UpdatedTopics[2]);
			topics=topicsDao.updateTopics(updatedId, oldTopics);
			System.out.println(UpdatedTopics!=null?"updated Topics Successfully":"Topics not updated");
			}
			break;
		case 5:
			System.out.println("enter the id to delete the topics");
			int deleteId=Integer.parseInt(scan.nextLine());
			Topics deletedTopics=topicsDao.deleteTopics(deleteId);
			System.out.println(deletedTopics!=null?"deleted Topics Successfully":"Topics not deleted");
			break;
			default:
				System.out.println("Invalid choice");
		}
		System.out.println("Do you want to continue (y/n)");
		option=scan.nextLine().charAt(0);
		}while(option=='y'||option=='Y');
	
	}
}