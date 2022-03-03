package workout;

import java.util.List;
import java.util.Scanner;

public class TopicsMain {
	public static void main(String[] args)   {
		Scanner scan = new Scanner(System.in);
		TopicsRepostory TopicRepoImpl=new TopicRepoImpl();
		char choice = 'n';
		do {
			System.out.println("1.Get all Topics\n2.get a Topics\n3.Add a new Topics\n4.remove Topics\n5.update Topics");
			int option = Integer.parseInt(scan.nextLine());
			switch (option) {
			case 1:
				List<Topics> castList = TopicRepoImpl.getallTopics();
				System.out.println("Elemets from the Storage");
				if (!castList.isEmpty()) {
					for (Topics cast : castList) {
						System.out.println(cast);
					}
				}
				else
				{
					System.out.println("the storage list is empty");
				}
				break;
			case 2:
				System.out.println("Enter the Cast id:");
				int id = Integer.parseInt(scan.nextLine());
				Topics cast = TopicRepoImpl.get(id);
				System.out.println(cast!=null?cast:"id not found");
				break;
			case 3:
				System.out.println("Enter the cast Details");
				String data = scan.nextLine();
				Topics Top = Topics.createCast(data);
				boolean res=TopicRepoImpl.add(Top);
				System.out.println(res?"Cast Added successfully":"storage is full");
				break;
			case 4:
				System.out.println("Enter the id to be removed");
				int newId=Integer.parseInt(scan.nextLine());
				System.out.println(TopicRepoImpl.remove(newId)?"Removed successfully":"not removed");
				break;
			case 5:
				System.out.println("Enter the id to be updated:");
				int updateId=Integer.parseInt(scan.nextLine());
				System.out.println("Enter the details");
				String updateData=scan.nextLine();
				Topics updatedCast=Topics.createCast(updateData);
				boolean result=TopicRepoImpl.update(updateId);
				System.out.println(result?"updated":"not get updated");
				break;
				default:
				System.out.println("Invalid input");
			}
		
			System.out.println("Do you want ot cntinue (y/n)");
			choice = scan.nextLine().charAt(0);
	}while (choice == 'y' || choice == 'Y');
}
}

