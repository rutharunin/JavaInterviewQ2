import java.util.Arrays;

public class Q5ReverseString {
    public static void main(String[] args) {
        String word= "Hello Techtorial";
        StringBuilder solution1 = new StringBuilder(word);
        System.out.println(solution1.reverse());

        for (int i=word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
        System.out.println();

        String[]solution3 = word.split(" ");
        //System.out.println(Arrays.toString(solution2));

        String reverse2="";
        for (String word3:solution3){

            for (int i=word3.length()-1; i>=0;i--){
                reverse2+=word3.charAt(i);
            }
            reverse2+=" ";
        }
        System.out.println(reverse2);

        String[]solution4=new String[solution3.length];
        for (int i=0,j=1;i<solution3.length;i++,j--){
            solution4[i]=solution3[j];
            }
        for (String word4:solution4){

            for (int i=word4.length()-1; i>=0;i--){
                reverse2+=word4.charAt(i);
            }
            reverse2+=" ";
        }
        System.out.println("XXX"+reverse2);
        }

    }
