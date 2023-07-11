public class Q6Palindrome {
    public static void main(String[] args) {
//        String word = "asdfdsa";
        String word = "dhgajk";
        boolean isPalindrome =true;

        for (int i=0, j= word.length()-1; i<word.length()/2; i++, j--){
            if (word.charAt(i)!=word.charAt(j)){
                isPalindrome=false;
            }
        }
        System.out.println(isPalindrome);
    }
}
