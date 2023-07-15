public class InfiniteArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,8,10,34,56,67,78,89,192};
        int target = 2;
        int ans = findElement(arr,target);
        System.out.println(ans);
    }
    static int findElement(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end + 1;
            end = end + (end -start +1)*2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);

    }
    static int binarySearch(int[] arr, int target, int start, int end){

        while(start<=end){
            // first find the middle element using below formula as s+e may exceed the integer limit in java
            int middle = start + (end - start)/2;
            //if the target is < middle element then the element lies in the left side
            if(target < arr[middle]){
                end = middle-1;

            }
            //if the target > middle element that means the element lies in the right hand side
            else if (target>arr[middle]) {
                start = middle + 1;
            }
            //if the target == middle that means element is found
            else{
                return middle;
            }
        }
        //if no element is found then it will return -1
        return -1;

    }


}
