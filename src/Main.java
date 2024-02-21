import javax.sound.sampled.EnumControl;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> somelist = new ArrayList<Integer>(3);
        somelist.add(50);
        somelist.add(30);
        somelist.add(40);
        somelist.forEach((item)-> System.out.println(item*10) );

        int a =10;
        int b = 0;
        try{
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Program closed successfully!");
        }
    }


}