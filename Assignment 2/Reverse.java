import java.util.Scanner;
class Reverse{
	public static void main(String args[])
{
	int num=0;
	int reversenum=0;
	System.out.println("input your number");
	Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(num!=0)
{
	reversenum=reversenum*10;
	reversenum=reversenum+num%10;
	num=num/10;
}
	System.out.println("Reverse Number:"+reversenum);
}
}
-----------------------------OUTPUT----------------------------
E:\cdac20\java1>javac Reverse.java

E:\cdac20\java1>java Reverse
input your number
456
Reverse Number:654

E:\cdac20\java1>
