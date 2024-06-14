import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortUsingRecursion {
    public static void main(String[] args) {
        int arr[] = {4,2,3,1,7,6,9,8};
        mergeSortRecursion(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSortRecursion(int arr[], int low, int high){
        if(low>=high){
            return;
        }
        int mid = low + (high-low)/2;
        mergeSortRecursion(arr,low,mid);
        mergeSortRecursion(arr,mid+1,high);
        mergeSort(arr,low,mid,high);
    }
    public static void mergeSort(int arr[], int low, int mid, int end){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=end){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=end){
            list.add(arr[right]);
            right++;
        }
        for(int i=low;i<=end;i++){
            arr[i] = list.get(i-low);
        }
    }
}
