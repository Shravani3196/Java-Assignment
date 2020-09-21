import java.util.Scanner;
class Convo{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num of days");
	int d=sc.nextInt();
	int year=d/365;
System.out.println("Year" +year);
	int week=(d%365)/7;
System.out.println("week" +week);
	int days=(d%365)%7;
System.out.println("days" +days);
	}
}