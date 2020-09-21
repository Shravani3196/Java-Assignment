import java.util.Scanner;
class GreterNum{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=sc.nextInt();
	System.out.println("Enter the Second number");
	int b=sc.nextInt();
	System.out.println("Enter the third number");
	int c=sc.nextInt();
if(a>b && a>c)
{
	System.out.println("First number is greater!");
}
else if(b>a && b>c)
{
	System.out.println("Second number is greater!");
}
else
{
	System.out.println("Third number is greater!");
}
}
}

------------------------------OUTPUT------------------------------------------------
E:\cdac20\java1>javac GreterNum.java

E:\cdac20\java1>java GreterNum
Enter the first number
22
Enter the Second number
10
Enter the third number
88
Third number is greater!