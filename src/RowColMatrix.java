import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {11,22,33,44},
                {12,24,36,46},
                {15,29,38,50}
        };
        System.out.println(Arrays.toString(search(arr,36)));
    }
    static int[] search(int[][] arr,int target){
        int row =0;
        int col = arr.length - 1;
        int[] ans = {-1,-1};
        while(row<arr.length && col>=0){
            if(arr[row][col] == target){
                ans[0] = row;
                ans[1] = col;
                return ans;
            }
            if(arr[row][col] > target){
                col--;
            }
            if(arr[row][col]< target){
                row++;
            }
        }
        return ans;
    }
}
