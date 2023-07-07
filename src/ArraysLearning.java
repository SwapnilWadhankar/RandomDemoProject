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
        System.out.println("---------------");
        swap(arr1,0,1,1,2);
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
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println("");
        }

    }
    static void swap(int[][] arr, int row1, int col1, int row2, int col2){
        int temp = arr[row1][col1];
        arr[row1][col1] = arr[row2][col2];
        arr[row2][col2] = temp;
    }
}
