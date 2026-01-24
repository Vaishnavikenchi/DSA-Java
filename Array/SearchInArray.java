import java.util.Scanner;

class SearchInArray {
    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 40, 50, 70, 98};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element you want to search:");
        int searchElement = sc.nextInt();

        int index = -1; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                index = i;
                break; 
            }
        }

        if (index != -1) {
            System.out.println("Element is present in the array.");
            System.out.println(searchElement + " is present at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
