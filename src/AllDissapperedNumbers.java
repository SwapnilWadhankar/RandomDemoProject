import java.util.ArrayList;

public class AllDissapperedNumbers {
    public static void main(String[] args) {
        int[] arr = {1,5,6,2,2,4};
        System.out.println(missingNumber(arr));

    }
    static ArrayList<Integer> missingNumber(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int j=0;j<nums.length;j++){

            if(nums[j]!=j+1){
                ans.add(j+1);
            }
        }return ans;
    }

    static void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
