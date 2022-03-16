package com.technocis.Topics.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.technocis.Topics.model.Topics;
import com.technocis.Topics.services.TopicsService;
import com.technocis.Topics.services.TopicsServiceImpl;

public class TopicsTest {
	// private static Topics[] TopicsList;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char option = 'n';
		do {
			System.out.println("1.Get A Topics\n2.Get All Topics\n3.Insert Topics\n4.Update Topics\n5.Delete Topics");
			int choice = Integer.parseInt(br.readLine());
			TopicsService topicsService = new TopicsServiceImpl();
			switch (choice) {

			case 1:
				System.out.println("Enter the id to fetch");
				int id = Integer.parseInt(br.readLine());
				Topics topics = topicsService.getTopics(id);
				System.out.println(topics);
				break;
			case 2:
				List<Topics> TopicsList = topicsService.getallTopics();
				for (Topics element : TopicsList) {
					System.out.println(element);
				}
				break;
			case 3:
				System.out.println("Enter the Topics details");
				String detail = br.readLine();
				String datas[] = detail.split(",");
				Topics newTopics = new Topics(datas[0], datas[1], datas[2]);
				Topics insertedTopics = topicsService.insertTopics(newTopics);
				System.out.println(
						insertedTopics != null ? "Topics data inserted\n" + insertedTopics : "Topics Not Inserted");
				break;
			case 4:
				System.out.println("Enter the id to update");
				int updateId = Integer.parseInt(br.readLine());
				Topics oldCourse = topicsService.getTopics(updateId);
				System.out.println(oldCourse);
				System.out.println("Enter the course details");
				String updateDetail = br.readLine();
				String updateDatas[] = updateDetail.split(",");
				Topics UpdatedTopics = new Topics(updateDatas[0], updateDatas[1], updateDatas[2]);
				Topics resTopics = topicsService.updateTopics(updateId, UpdatedTopics);
				System.out.println(resTopics != null ? "Topics data updated\n" + resTopics : "Topics Not Updated");
				break;
			case 5:
				System.out.println("enter the id to delete the record from table");
				int deleteId = Integer.parseInt(br.readLine());
				Topics deleteTopics = topicsService.deleteTopics(deleteId);
				System.out.println(
						deleteTopics != null ? "Course data deleted success\n" + deleteTopics : "Topics Not deleted");

				break;
			default:
				System.out.println("Invalid choice");
			}

			System.out.println("Do you want you continue (y/n)");
			option = br.readLine().charAt(0);
		} while (option == 'y' || option == 'Y');
	}
}
