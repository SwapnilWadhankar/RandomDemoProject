public class Arrays1D {
    public static void main(String[] args) {
       int[] array1 = {1, 2,4 ,6};
       checkSum(array1, 10);
    }
    // Function which returns true if elements add up to the given target value
    static void checkSum(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            int compare = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(compare + arr[j] == target){
                    System.out.println(" Yes!");
                }
            }
        }
    }
}

