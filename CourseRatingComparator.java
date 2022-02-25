package comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CourseRatingComparator {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	List<Course> courseList=new  ArrayList<Course>();
	System.out.println("enter the no of elements");
	Integer num=Integer.parseInt(scan.nextLine());
	String[] str=new String[num];
	System.out.println("");
 for(int i=0;i<num;i++)
 {
	 System.out.println("enter the details one by one");
	 String course=(scan.nextLine());
	 String[] UserData=course.split(",");
	  Course cou=new Course(UserData[0], UserData[1], Integer.parseInt(UserData[2]), Integer.parseInt(UserData[3]), UserData[4], UserData[5], false);
	  courseList.add(cou);
	 
 }
 System.out.println("The Details are: ");
 System.out.println(courseList);
 Collections.sort(courseList,new RateComparator());
 System.out.println(courseList);
 }




 }


