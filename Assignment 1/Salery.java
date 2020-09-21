import java.util.Scanner;
class Salery{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the salery");
	double sal=sc.nextInt();
if(sal<10000)
{
double HRA=10*(sal/100);
System.out.println("HRA is " +HRA);
double DA=90*(sal/100);
System.out.println("DA is " +DA);

}
else if(sal==10000||sal>10000)
{
	double HRA=2000;
System.out.println("HRA is " +HRA);
double DA=98*(sal/100);
System.out.println("DA is " +DA);
		}


	}
}

------------------OUTPUT-------------------------------
E:\cdac20\java1>java Salery
Enter the salery
8000
HRA is 800.0
DA is 7200.0