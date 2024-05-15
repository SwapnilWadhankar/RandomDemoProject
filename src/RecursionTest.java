public class RecursionTest {
    public static void main(String[] args) {
//        printName(1,4);
//        printNumbers(1,5);
//        printReverseNumbers(1,5);
        System.out.println(printSum(5));
        System.out.println(fibonacci(5));
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

    static int fibonacci(int n){
        if(n==1 || n==0){
            return 1;
        }

        return n * fibonacci(n-1);
    }
}
