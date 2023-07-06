import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the array elements till 5 : ");
        for(int i=0;i<arr1.length;i++){
            arr1[i] = in.nextInt();
        }

        System.out.println();
        printArray(arr1);
    }
    static void printArray(int arr[]){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            System.out.print(arr[i] + " ");

        }
        System.out.println("");
        System.out.println("The sum of the array is : " + sum);
    }
}
