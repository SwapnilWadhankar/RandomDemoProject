import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,8,10,22,23,45,32,27};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to search in the array: ");
        int target = input.nextInt();
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            // first find the middle element using below formula as s+e may exceed the integer limit in java
            int middle = start + (end - start)/2;
            //if the target is < middle element then the element lies in the left side
            if(target < arr[middle]){
                end = middle-1;

            }
            //if the target > middle element that means the element lies in the right hand side
            else if (target>arr[middle]) {
                start = middle + 1;
            }
            //if the target == middle that means element is found
            else{
                return middle;
            }
        }
        //if no element is found then it will return -1
         return -1;

    }
}
