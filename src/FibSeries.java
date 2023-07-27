public class FibSeries {
    public static void main(String[] args) {
        System.out.println(fibSeries(10));
    }
    static int fibSeries(int n) {
        int i = 0;
        int sum =1;
        if(n==0 || n==1){
            return n;
        }
        else {
            sum = fibSeries(n-1)+fibSeries(n-2);
            return sum;
        }
    }
}
