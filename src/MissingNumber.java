class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,0,4,5,1};
        int output = missingNumber(arr);
        System.out.println(output);

    }
    static int missingNumber(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }return nums.length;
    }

    static void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}