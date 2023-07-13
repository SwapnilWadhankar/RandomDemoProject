import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,45,6};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int target = input.nextInt();
        System.out.println("Enter the range in which you want to search : ");
        int i = input.nextInt();
        int j = input.nextInt();

//        String someString = "This is some string";
//        System.out.println(someString.toCharArray());
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a character to find: ");
//        char target = input.next().charAt(0);
//        for(int i=0;i<someString.length();i++){
//            if(someString.charAt(i)==target){
//                System.out.println("Congratulations we have found the character at "+i+" position");
//                break;
//            }
//        }
        searchArray(arr,target,i,j);
    }

    static void searchArray(int[] arr, int element, int startIndex, int lastIndex){
        for(int i=startIndex;i<lastIndex;i++){
            if(arr[i]==element){
                System.out.println("The element is found at : "+ i);
            }
        }
//        System.out.println("Sorry the element not found");
    }
}
