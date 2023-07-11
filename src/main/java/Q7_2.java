public class Q7_2 {
    public static void main(String[] args) {
        int checkPrime =21;
         boolean isPrime = true;
         for(int i =2 ;i<checkPrime/2; i++){
             if (checkPrime%i ==0) isPrime=false;
         }
        System.out.println(isPrime);
    }
}
