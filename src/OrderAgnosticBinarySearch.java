import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {55, 44,33,22,21,14,11,9,8};
        int target = 9;
        System.out.println(orderAgnosticBinarySearch(arr, target));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        boolean isAscending = arr[start] < arr[end];
        if(isAscending){
            return isAscending(arr, target);
        }else{
            return isDescending(arr,target);
        }


    }
    static int isAscending(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
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
    static int isDescending(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            // first find the middle element using below formula as s+e may exceed the integer limit in java
            int middle = start + (end - start)/2;
            //if the target is < middle element then the element lies in the left side
            if(target > arr[middle]){
                end = middle-1;

            }
            //if the target > middle element that means the element lies in the right hand side
            else if (target<arr[middle]) {
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