class EvenOddCount
{
    public static void main(String args[])
    {
        int arr[]={2,3,6,8,1,15,20};
        int even=0,odd=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even numbers count:"+even);
        System.out.println("Odd numbers count:"+odd);
       }
}