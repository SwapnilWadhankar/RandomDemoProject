import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

public class RecursionTest {
    public static void main(String[] args) {
//        printName(1,4);
//        printNumbers(1,5);
//        printReverseNumbers(1,5);
//        System.out.println(printSum(5));
//        System.out.println(fibonacci(5));
          int[] arr2 = {3,1,2};
          int[] arr3 = {1,2,1};
//          ArrayList<Integer> myArrayList = new ArrayList<Integer>();
//          myArrayList.add(10);
//          myArrayList.add(20);
//          myArrayList.add(30);
//          myArrayList.add(40);
//          myArrayList.add(50);
//          System.out.println(myArrayList.size());
          int n = 3;
          int sum=2;
          ArrayList<Integer> myArraylist = new ArrayList<Integer>();
//          printSubsequenceOfArray(0,myArraylist,arr2,n);
//          printSubsequenceWithSum(0,myArraylist,0,sum,arr3,n);
          printSubsequenceWithSumOnlyOnePair(0,myArraylist,0,2,arr3,n);
          System.out.println();
          System.out.println(printCountOfPossibleSubsequence(0,0,2,arr3,n));
//          int[] arr1= {1,2,3,4,5,6};
//          reverseArray(arr1);
//          System.out.println(Arrays.toString(arr1));
//          String s ="LOHOHOL";
//          System.out.println(stringPalindrome(0,s));
//        System.out.println(fibonacci(6));
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

    public static void printSubsequenceOfArray(int index, ArrayList<Integer> list, int[] arr, int n){
        if(index >= n){
            for(int i : list){
                System.out.print(" "+i);
            }
            if(list.isEmpty()){
                System.out.println("{}");
            }else{
                System.out.println();
                return;
            }
        }
        //to take and push the number to the arraylist
        list.add(arr[index]);
        printSubsequenceOfArray(index+1, list, arr, n);

        //to remove the element form being pushed to the arraylist
        list.remove(list.size()-1);
        printSubsequenceOfArray(index+1, list, arr, n);


    }

    public static void printSubsequenceWithSum(int index, ArrayList<Integer> list,int s,int sum, int[] arr, int n){
        if(index == n){
            if(s==sum){
                for(int i : list){
                    System.out.print(" "+i);
                }
                System.out.println();
            }
            if(list.isEmpty()){
                System.out.println("{}");
            }else{
                return;
            }
        }
        //to take and push the number to the arraylist
        list.add(arr[index]);
        s=s+arr[index];
        printSubsequenceWithSum(index+1, list, s,sum,arr, n);

        //to remove the element form being pushed to the arraylist
        list.remove(list.size()-1);
        s=s-arr[index];
        printSubsequenceWithSum(index+1, list, s,sum,arr, n);
    }


    public static boolean printSubsequenceWithSumOnlyOnePair(int index, ArrayList<Integer> list,int s,int sum, int[] arr, int n){
        if(index == n){
            if(s==sum){
                for(int i : list){
                    System.out.print(" "+i);
                }
                return true;
            }
            else{
                return false;
            }
        }
        //to take and push the number to the arraylist
        list.add(arr[index]);
        s=s+arr[index];
        if(printSubsequenceWithSumOnlyOnePair(index + 1, list, s, sum, arr, n)){
            return true;
        }

        //to remove the element form being pushed to the arraylist
        list.remove(list.size()-1);
        s=s-arr[index];
        if(printSubsequenceWithSumOnlyOnePair(index + 1, list, s, sum, arr, n)){
            return true;
        }
        return false;
    }

    public static int printCountOfPossibleSubsequence(int index,int s,int sum, int[] arr, int n){
        if(index == n){
            if(s==sum){
                return 1;
            }
            else{
                return 0;
            }
        }
        //to take and push the number to the arraylist

        s=s+arr[index];
        int l = printCountOfPossibleSubsequence(index + 1, s, sum, arr, n);

        //to remove the element form being pushed to the arraylist

        s=s-arr[index];
        int r = printCountOfPossibleSubsequence(index + 1, s, sum, arr, n);
        return l+r;
    }








}
