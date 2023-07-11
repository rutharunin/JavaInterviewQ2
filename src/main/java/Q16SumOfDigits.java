public class Q16SumOfDigits {
    public static void main(String[] args) {
        int input=4577;

        int sum =0;

        while (input>0){
            sum+=input%10;
            input/=10;
        }
        System.out.println(sum);
    }
}
