public class EvenDigitsProblem {
    public static void main(String[] args) {
        int[] arr = {1, 2,3,4,55,66,232,12,34535,23,24,535,561,6};
        System.out.println(evenDigit(arr));
    }
    static int evenDigit(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(even2(arr[i])){
                count++;
            }
        }
        return count;

    }
// we can iterate through each item and then check if that item is even or odd
    private static boolean even(int i) {
        String convertedtoString = i + "";
        if(convertedtoString.length()%2==0){
            return true;
        }else{
            return false;
        }

    }
    // just converting the digits into string and then checking if the length is even or odd
    private static boolean even2(int i){
        int count = 0;
        while(i>0){
            count++;
            i = i/10;
        }
        if(count%2==0){
            return true;
        }else{
            return false;
        }
    }

}
