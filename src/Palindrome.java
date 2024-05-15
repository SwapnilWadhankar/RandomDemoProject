public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(232));
        System.out.println(sumOfDigits(1234));
    }
    static boolean isPalindrome(int x){
        int n = x;
        int palindrome =0;
        while(n>0){
            int remainder = n%10;
            palindrome = palindrome*10 + remainder;
            n = n/10;
        }
        if(palindrome == x){
            return true;
        }else{
            return false;
        }
    }
    static int sumOfDigits(int x){
        int n = x;
        if(n==0){
            return 0;
        }
        int rem = n%10;
        return rem+ sumOfDigits(n/10);
    }
}
