public class Q3HowManyAlphaCharactors {
    public static void main(String[] args) {
        String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";

        String answer="";
        for (int i =0; i<given.length(); i++){
            if (given.charAt(i)>='A' && given.charAt(i)<='Z' || given.charAt(i)>='a' && given.charAt(i)<='z'){
                answer+=given.charAt(i);
            }
        }
        System.out.println(answer.length());

    }
}