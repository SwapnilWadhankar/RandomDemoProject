import java.util.Arrays;

public class RowColBoolean {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {60,70,80,90},
                {100,110,120,130}
        };
        System.out.println((search(arr,37)));
    }
    static boolean search(int[][] matrix,int target){
        int row =0;
        int col = matrix.length - 1;
        boolean ans = false;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == target){
                ans = true;
                return ans;
            }
            if(matrix[row][col] > target){
                col--;
            }
            if(matrix[row][col]< target){
                row--;
            }
        }
        return ans;
    }
}
