public class Recursion {
    public static void main(String[] args) {


//        someNumbers(5);
//        int x = fibSeries(5);
//        System.out.println(x);

//        System.out.println(Factorial(4));
            countdown(3);
        System.out.println(sumOfDigit(123));
        System.out.println(1%10);

    }

    static void someNumbers(int n){
        if(n==0){
            return;
        }

        someNumbers(n-1);
        System.out.println(n);

    }
    static int fibSeries(int n){
        if(n<=1){
            return n;
        }
        return fibSeries(n-1)+fibSeries(n-2);
    }
    static int Factorial(int n){
        if(n==0){
            return 1;
        }
        return n * Factorial(n-1);
    }

    static void countdown(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        countdown(n-1);
    }
    static int sumOfDigit(int n){
        int  sum = 0;
        int rem = 0;
        if(n<=1){
            return 0;
        }
        rem = n%10;
        sum = sum + sumOfDigit(n%10);
        return rem;

    }
}

