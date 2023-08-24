import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,4,1,5,5};
        cyclicSort(arr);
        System.out.println(cyclicSort(arr));
    }

    static int cyclicSort(int[] nums){
        int i =0;
        while(i<nums.length){
            if(nums[i]!=i+1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            }else{
                i++;
            }
        }return -1;

    }
    static void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
