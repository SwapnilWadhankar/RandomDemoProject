import java.util.Arrays;

public class FirstAndLastIndexProblem {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,4,4,4,5,6,7,9};
        int target = 3;
        int[] finalAnswer= displayAnswer(nums,target);
        System.out.println(Arrays.toString(finalAnswer));

    }
    static int[] displayAnswer(int[] nums,int target){
        int[] ans = {-1,-1};
        ans[0] = search(nums, target,true);
        ans[1] = search(nums, target, false);
        return ans;
    }
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int middle = start + (end - start)/2;
            if(target < nums[middle]){
                end = middle-1;
            }
            else if (target>nums[middle]) {
                start = middle + 1;
            }
            else{
                //this can be potential answer
                ans = middle;

                if(findStartIndex){
                    //to find the target values on the left of the potential answer
                    end = middle -1;
                }else{
                    //to find the target values on the right of the potential answer
                    start = middle + 1;
                }
            }
        }
        return ans;
    }
}
