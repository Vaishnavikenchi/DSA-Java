import java.util.Scanner;
class CountZero
{
    public static void main(String args[])
    {
       int zerocount,count=0;
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter number of Elements:");
       int n=sc.nextInt();

       int arr[]=new int[n];

       System.out.println("Enter "+ n +" Elements");
       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++)
       {
        if(arr[i]==0)
        {
            count++;
        }
       }
       zerocount=count;
       System.out.println("Total number of Zero's in an Array:"+ zerocount);
    }
}