class Rev{
	public static void main(String args[])
{
	int arr[]=new int [] {3,4,2,9,8};
	System.out.println("Array");
	for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]+" ");
}
	System.out.println();
	System.out.println("Array in reverse order:");
	for(int i=arr.length-1;i>=0;i--)
{	
	System.out.print(arr[i]+" ");
	}
    }
}