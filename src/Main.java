import javax.sound.sampled.EnumControl;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        int sum =0, a=0, b=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth term : ");
        System.out.println(a);
        System.out.println(b);
        int n = input.nextInt();
        for (int i=2; i<=n; i++){
            a=b;
            b=sum;
            sum = a+b;
            System.out.println(sum);
        }


    }
}