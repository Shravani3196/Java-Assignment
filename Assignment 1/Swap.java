import java.util.Scanner;
class Swap{
	public static void main(String args[])
{
	int i=10;
	int j=20;
	System.out.println("Number before swap: "+i);
	System.out.println("Number before swap: "+j);
	 i=i+j;
	 j=i-j;
	 i=i-j;
	System.out.println("Number after swap: "+i);
System.out.println("Number before swap: "+i);
}
}

------------------------------OUTPUT-------------------------------------
E:\cdac20\java1>javac Swap.java

E:\cdac20\java1>java Swap
Number before swap: 10
Number before swap: 20
Number after swap: 20
Number before swap: 20
