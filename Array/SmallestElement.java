class SmallestElement 
{
    public static void main(String args[])
     {
        int arr[] = {22, 76, 11, 23, 97, 10};
        int SmallestElement = arr[0]; 

        for (int i = 1; i < arr.length; i++) 
        { 
            if (arr[i] < SmallestElement) {
                SmallestElement = arr[i]; 
            }
        }

        System.out.println("Smallest element is: " + SmallestElement);
    }
}
