class Reverse
{
    public static void main(String args[])
    {
        int arr[]={10,20,30,40,50,60};
        int temp;

        for(int i=0;i<arr.length/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println("Reverse Array");
        for(int i=0;i<arr.length;i++)
        {
        
            System.out.println(arr[i]+" ");
        }
    }
}