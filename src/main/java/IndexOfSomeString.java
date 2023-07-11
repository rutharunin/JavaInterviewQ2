public class IndexOfSomeString {
    //Sara's interview


    public static void main(String[] args) {
        String input1="I love you blablabla so much";
        String input2="you";
        myEngine(input1,input2);
    }

    public static void myEngine(String a,String b){

        if (a.contains(b) && b!=""){
         String[]result=a.split(b);
            System.out.println(result[0].length());
        }else {
            System.out.println("bye");
        }
    }
}