import java.util.Scanner;
class Marks{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Marks of sub1");
	int m1=sc.nextInt();
	System.out.println("enter the Marks of sub2");
	int m2=sc.nextInt();
	System.out.println("enter the Marks of sub3");
	int m3=sc.nextInt();
	System.out.println("enter the Marks of sub4");
	int m4=sc.nextInt();
	System.out.println("enter the Marks of sub5");
	int m5=sc.nextInt();
	int sum=m1+m2+m3+m4+m5;
	float perc=(sum/5);
	System.out.println("perc are " +perc);
	
	}
}

-----------------------------OUTPUT------------------------
E:\cdac20\java1>javac Marks.java

E:\cdac20\java1>java Marks
enter the Marks of sub1
50
enter the Marks of sub2
70
enter the Marks of sub3
65
enter the Marks of sub4
60
enter the Marks of sub5
55
perc are 60.0