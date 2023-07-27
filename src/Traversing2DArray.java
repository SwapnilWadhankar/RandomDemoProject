import java.util.Arrays;

public class Traversing2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {6,7,8}};
        
        String answer = findElement(arr,3);
        System.out.println(answer);
    }


    static String findElement(int[][] arr, int n){
        int[] answer = {-1,-1};
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                if(arr[i][j] == n){
                    answer[0] = i+1;
                    answer[1]=j+1;
                }
            }
        }return Arrays.toString(answer);
    }
}
