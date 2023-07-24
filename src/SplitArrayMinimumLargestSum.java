public class SplitArrayMinimumLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(arr,m));
    }
    static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;
        for (int j : nums) {
            start = Math.max(start, j);
            end = end + j;
        }
        while(start<end){
            int middle = start + (end - start)/2;
            int sum = 0;
            int piece = 1;
            for(int num : nums){
                if(sum + num > middle){
                    sum = num;
                    piece++;
                }
                else{
                    sum += num;
                }
            }
            if(piece > m){
                start = middle+1;
            }else{
                end = middle;
            }
        }
        return end;
    }
}
