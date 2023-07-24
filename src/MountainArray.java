import java.util.Scanner;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,4,0};
        System.out.println("The index of mountain peak element is : " + binarySearch(arr));

    }
    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int middle = start + (end - start)/2;
            if(arr[middle]>arr[middle+1]){
                end = middle;
            }
            else {
                start = middle + 1;
            }
        }
        return start;
    }
}
