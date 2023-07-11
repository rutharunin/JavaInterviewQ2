public class IntegerPalindrome {
    public static void main(String[] args) {
        int palindrome=1234321;
        int input=palindrome;
        int original=palindrome;
        int result=0;
        int count=0;
        while (input>0){
            count++;
            input/=10;
        }
        while (count>0){
            result+=(palindrome%10) * (Math.pow(10,count-1));
            palindrome/=10;
            count--;
        }
        if (original==result){
            System.out.println("Awesome");
        }else {
            System.out.println("you are not cool");
        }
//==========================================================================================================
        int num=223454322;
        int palindromeAgain=num;
        int digit=0;
        int output=0;
        while (palindromeAgain>0){
            digit=palindromeAgain%10;
            output=(output * 10) + digit;
            palindromeAgain/=10;
        }
        String print = num==output? "Awesome":"Oh";
        System.out.println(print);

        //or

        System.out.println(num==output? "Awesome":"Oops");
    }
}