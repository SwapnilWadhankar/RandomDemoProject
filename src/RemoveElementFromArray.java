public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeElementFromArray(arr,1));


    }
    static int removeElementFromArray(int[] nums, int val){
        int i=0;
        int j=0;
        int n = nums.length;
        if(n==0){
            return n;
        }
        if(n==1 && val ==nums[i]){
            return 0;
        }
        if(n==1 && val!=nums[i]){
            return 1;
        }
        else{
            for(i=0;i<n-1;i++){
                if(nums[i] == val){
                    continue;
                }else{
                    nums[j++] = nums[i];
                }
            }
            if(nums[n-1] != val){
                nums[j++] = nums[n-1];
            }
            return j;
        }
    }
}
