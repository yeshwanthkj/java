import java.io.*;
class minmax 
{	
	static int min(int arr[],int n)
	{
		int t =arr[0];
		for(int i=1;i<n;i++)
		{
			if (t<arr[i])
				t=arr[i];
		}
		return t;
	}
    
	static int max(int arr[],int n)
	{
		int m =arr[0];
		for(int i=1;i<n;i++)
		{
			if (m>arr[i])
				m=arr[i];
		}
		return m;
	}
		public static void main (String args[])
		{
	     int arr [] =new int[] {5,8,3,1,31,2};
		 
		 System.out.println(min(arr,arr.length));
		 System.out.println(max(arr,arr.length));
		}
		
}
