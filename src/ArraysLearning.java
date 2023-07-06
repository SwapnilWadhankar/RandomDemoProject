import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
public class ArraysLearning {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the array elements : ");
        for(int row=0;row<arr1.length;row++){
            for(int col=0;col<arr1[row].length;col++){
                arr1[row][col] = in.nextInt();
            }
        }
        System.out.println();
        print3DArray(arr1);
    }
    static void printArray(int[] arr){
        int sum =0;
        for (int j : arr) {
            sum += j;
            System.out.print(j + " ");

        }
        System.out.println("");
        System.out.println("The sum of the array is : " + sum);
    }
    static void print3DArray(int[][] arr){
        for (int row =0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
