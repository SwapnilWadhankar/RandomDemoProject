import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 8, 10, 22, 23, 45, 32, 27};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to search in the array: ");
        int target = input.nextInt();
        System.out.println(orderAgnosticBinarySearch(arr, target));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        boolean isAscending = arr[start] < arr[end];
        while(start<=end){
            int middle = start + (end - start)/2;
            if(target == arr[middle]){
                return middle;
            }
            if(isAscending){
                if (target>middle){
                    start = middle + 1;
                }else{
                    end = middle -1;
                }

            }
            else{
                if(target<middle){
                    start = middle + 1;
                }else{
                    end = middle -1;
                }
            }
        }
        return -1;
    }


}