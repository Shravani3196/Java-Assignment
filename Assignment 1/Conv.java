import java.util.Scanner;
class Conv{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the temp in fahrenheit");
	float f=sc.nextInt();
	float c=(5*(f-32)/9);
	System.out.println("temp in Celcius" +c);
	}
}
	
---------------------OUTPU-----------------------------------------
E:\cdac20\java1>javac Conv.java

E:\cdac20\java1>java Conv
enter the temp in fahrenheit
120
temp in Celcius48.88889