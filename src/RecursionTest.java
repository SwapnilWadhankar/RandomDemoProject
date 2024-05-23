import java.sql.Date;
import java.util.Arrays;

public class RecursionTest {
    public static void main(String[] args) {
//        printName(1,4);
//        printNumbers(1,5);
//        printReverseNumbers(1,5);
//        System.out.println(printSum(5));
//        System.out.println(fibonacci(5));
          int[] arr1= {1,2,3,4,5,6};
          reverseArray(arr1);
          System.out.println(Arrays.toString(arr1));
          String s ="LOHOHOL";
          System.out.println(stringPalindrome(0,s));
        System.out.println(fibonacci(6));
    }

    public static void printName(int i,int n){
        if(i>n){
            return;
        }


        System.out.println("Swapnil");
        printName(i+1,n);

    }

    static void printNumbers(int i,int n){
        if(i>n){
            return;
        }

        System.out.println(i);
        printNumbers(i+1,n);
    }
    static void printReverseNumbers(int i,int n){
        if(i>n){
            return;
        }
        printReverseNumbers(i+1,n);
        System.out.println(i);
    }

    static int printSum(int n){
        if(n==0){
            return 0;
        }
        return n + printSum(n-1);
    }

    static int factorial(int n){
        if(n==0){
            return 1;
        }

        return n * factorial(n-1);
    }
    static void reverseArray(int[] arr){
        int n=arr.length-1;
        for(int i=0;i<=n/2;i++){
            if(i>=n/2){
                return;
            }else{
                swapArray(i,n,arr);
                i++;
                n--;
            }
        }

    }
    static void swapArray(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]=temp;
    }
    static void reverseArrayRecursion(int i, int[] arr, int n){
        if(i>=n){
            return;
        }else{
            swapArray(i,n,arr);
            reverseArrayRecursion(i+1,arr,n-1);
        }
    }

    static boolean stringPalindrome(int i, String s){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return stringPalindrome(i+1, s);

    }
    static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }




}
