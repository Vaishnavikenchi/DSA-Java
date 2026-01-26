class LargestElement 
{
    public static void main(String args[])
     {
        int arr[] = {22, 76, 11, 23, 97, 10};
        int LargestElement = arr[0]; 

        for (int i = 1; i < arr.length; i++) 
        { 
            if (arr[i] > LargestElement) {
                LargestElement = arr[i]; 
            }
        }

        System.out.println("Largest element is: " + LargestElement);
    }
}
