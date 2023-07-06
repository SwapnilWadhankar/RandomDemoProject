import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String input = in.next();
        System.out.println("Please enter your department: ");
        String department = in.next();
        switch(input){
            case "Swapnil" ->{
                if (department.equals("IT")) {
                    System.out.println("Hello Swapnil Wadhankar");
                } else {
                    System.out.println("Enter a valid department");
                }

            }
            case "Vinay" ->{
                if (department.equals("CSE")) {
                    System.out.println("Hello Vinay Kumar Gahane");
                } else {
                    System.out.println("Enter a valid department");
                }

            }
            case "Shreyash" ->{
                if (department.equals("EE")) {
                    System.out.println("Hello Shreyash Ghonge");
                } else {
                    System.out.println("Enter a valid department");
                }

            }
            case "Shreyanshu" ->{
                if (department.equals("ETC")) {
                    System.out.println("Hello Shreyanshu Deshmukh");
                } else {
                    System.out.println("Enter a valid department");
                }

            }
            default -> System.out.println("Pleas enter a valid name");
        }


    }

}