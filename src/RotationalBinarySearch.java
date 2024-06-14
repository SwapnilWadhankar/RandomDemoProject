public class RotationalBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
        System.out.println(findPivot(arr));



    }
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1, arr.length-1);


    }
    static int binarySearch(int[] arr,int target, int start, int end){
        
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
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int middle = start + (end -start)/2;
            if(middle < end && arr[middle]>arr[middle + 1]){
                return middle;
            }
            if(middle > start && arr[middle]<arr[middle-1]){
                return middle-1;
            }
            if(arr[start]>arr[middle]){
                end = middle-1 ;
            }else{
                start = middle+1;
            }
            
        }
        return -1;
    }
}
