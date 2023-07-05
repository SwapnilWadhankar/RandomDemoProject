import javax.sound.sampled.EnumControl;
import java.util.*;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String input = in.next();
        System.out.println("Please enter your department: ");
        String department = in.next();
        switch(input){
            case "Swapnil" ->{
                switch (department){
                    case "IT" -> System.out.println("Hello Swapnil Wadhankar");
                    default -> System.out.println("Enter a valid department");
                }

            }
            case "Vinay" ->{
                switch (department){
                    case "CSE" -> System.out.println("Hello Vinay Kumar Gahane");
                    default -> System.out.println("Enter a valid department");
                }

            }
            case "Shreyash" ->{
                switch (department){
                    case "EE" -> System.out.println("Hello Shreyash Ghonge");
                    default -> System.out.println("Enter a valid department");
                }

            }
            case "Shreyanshu" ->{
                switch (department){
                    case "ETC" -> System.out.println("Hello Shreyanshu Deshmukh");
                    default -> System.out.println("Enter a valid department");
                }

            }
            default -> System.out.println("Pleas enter a valid name");
        }


    }

}