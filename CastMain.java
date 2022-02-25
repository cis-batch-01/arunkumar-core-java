package sorting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CastMain {
	public static void main(String[] args) throws ParseException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of Cast Elements");
		int num=Integer.parseInt(scan.nextLine());
		List<Cast> castList=new ArrayList<Cast>();
		for(int i=0;i<num;i++)
		{
			String castData=scan.nextLine();
			Cast cast=Cast.createCast(castData);
			castList.add(cast);
		}
		for(Cast cast:castList)
		{
			System.out.println(cast);
			
		}
		System.out.println("Enter the Search Type:\n1.Nationality\n2.Date Of Birth");
		int choice=Integer.parseInt(scan.nextLine());
		switch(choice)
		{
		case 1:
			System.out.println("Enter the nationality:");
			String nation=scan.nextLine();
			CastBO castBO=new CastBO();
			List<Cast> resList=castBO.findCast(castList, nation);
			for(Cast cast:resList)
			{
				System.out.println(cast);
				
			}break;
		case 2:
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Enter the DOB:");
			Date dob=sdf.parse(scan.nextLine());
			CastBO castBONew=new CastBO();
			List<Cast> resList1=castBONew.findCast(castList, dob);
			for(Cast cast:resList1)
			{
				System.out.println(cast);
				
			}
			
			break;
			default:
				System.out.println("Invalid input");
				
		}
	}
}

