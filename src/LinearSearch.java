import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,45,6};
        int number=4;
        String someString = "This is some string";
        System.out.println(someString.toCharArray());
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character to find: ");
        char target = input.next().charAt(0);
        for(int i=0;i<someString.length();i++){
            if(someString.charAt(i)==target){
                System.out.println("Congratulations we have found the character at "+i+" position");
                break;
            }
        }
        searchArray(arr,number);
    }

    static void searchArray(int[] arr, int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("The element is found at : "+ i);
            }
        }
        System.out.println("Sorry the element not found");
    }
}
