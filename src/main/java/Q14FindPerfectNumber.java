public class Q14FindPerfectNumber {
    public static void main(String[] args) {
int input =6;
int sumOfDivisors=0;
for (int i=1; i<=input/2; i++){

    if (input%i==0){
        sumOfDivisors+=i;
    }

}if (sumOfDivisors==input){
            System.out.println("it is perfect");
        }else {
            System.out.println("it's not perfect");
        }
    }
}
