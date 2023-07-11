public class Q7CheckPrime {
    public static void main(String[] args) {
        int number =5;
        boolean isPrime=true;
        for (int i=2; i<=number/2; i++){
            if (number%i==0) isPrime=false;
        }
        System.out.println(isPrime);
    }
}
