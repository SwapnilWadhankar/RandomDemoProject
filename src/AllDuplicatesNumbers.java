import java.util.ArrayList;
import java.util.List;

public class AllDuplicatesNumbers {
    public static void main(String[] args) {
        int[] arr = {3,4,4,2,1,5,5};
        System.out.println(cyclicSort(arr));


    }
    static List<Integer> cyclicSort(int[] nums){
        int i =0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(nums[i]);
            }
        }
        return ans;

    }
    static void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
