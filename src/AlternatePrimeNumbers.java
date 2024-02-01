public class AlternatePrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Just revising the previously learned concepts!");
        alternatePrimeNumbers(20);
    }
    static int checkPrime(int num){
        if (num == 0 || num == 1 ){
            return 0;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i == 0){
                return 0;
            }
        }return 1;
    }

    static void alternatePrimeNumbers(int num){
        int flag = 2;
        for(int i=2;i<num;i++){
            if(checkPrime(i) == 1){
                flag ++;
                if(flag % 2 == 0){
                    System.out.print(" " + i);
                }
            }
        }
    }
}
