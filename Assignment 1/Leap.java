import java.util.Scanner;
class Leap{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year");
	int y=sc.nextInt();
	if(y%4==0)

{
	if(y % 100==0 &&y%400==0) 
{
	System.out.println("Leap year" +y);
}
}

else
{
	System.out.println("Is Not leap year");
}
}
}