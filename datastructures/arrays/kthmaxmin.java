import java.util.*;
class kthmaxmin
{
	public static void sort(int arr[])
	{
		 int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
	}
	public static void main (String args[])
	{
		int arr[]=new int[]{2,3,5,9,7,6,1};
		sort(arr);
		Scanner s =new Scanner(System.in);
		System.out.println("enter k value");
		int k = s.nextInt();
		System.out.println(arr[k-1]);
		
	}
}
