import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
public class ArrayListLearning {
    public static void main(String[] args) {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
        System.out.println(newArrayList);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array: ");
        for (int i=0;i<3;i++){
             newArrayList.add(in.nextInt());
        }
        for (int num:newArrayList
             ) {
            System.out.println(num);
        }
    }



}
