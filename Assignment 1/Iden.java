import java.util.Scanner;
class Iden{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the gender");
	char m=sc.nextChar();
	System.out.println("Enter the age");
	int a=sc.nextInt();
if(m=Female && a>21 || m=Male&&a>18)
{
	System.out.println("Eligible for marriage");
}
else if(m=Female&&a<21 || m=Male&&a<18)
{
	System.out.println("Not Eligible for marriage");
}
}
}
	