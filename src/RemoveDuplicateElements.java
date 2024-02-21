import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));


    }
    static int removeDuplicates(int[] nums){
        if(nums.length == 0 || nums.length ==1){
            return nums.length;
        }
        int n = nums.length;
        int i=0;
        int j=0;
        for(i=0;i<n-1;i++){
            if(nums[i] != nums[i+1]){
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[i];
        return j;


    }

}
