import java.util.Scanner;
class SimpInt{
		public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the princ balance");
	int p=sc.nextInt();
	System.out.println("enter the rate");
	int r=sc.nextInt();
	System.out.println("enter the time");
	int t=sc.nextInt();

	int SI=p*(1+r*t);
	System.out.println("Simple Interest is=" +SI);
	
}
	}
	

-----------------------OUTPUT-----------------------------------------
E:\cdac20\java1>javac SimpInt.java

E:\cdac20\java1>java SimpInt
enter the princ balance
400
enter the rate
40
enter the time
2
Simple Interest is=32400

