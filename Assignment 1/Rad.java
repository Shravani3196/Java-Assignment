import java.util.Scanner;
class Rad{
		public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the rdius");
	double r=sc.nextInt();

	double area=3.14*r*r;
	System.out.println("Area of the circle is=" +area);
	double c=2*3.14*r;
	System.out.println("Circumference of the circle is=" +c);
}
	}
	

--------------------OUTPUT--------------------------------------------
E:\cdac20\java1>javac Rad.java

E:\cdac20\java1>java Rad
enter the rdius
3
Area of the circle is=28.259999999999998
Circumference of the circle is=18.84
