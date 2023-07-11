public class TestMainMethod {

    public static void newMain(String[] args){
        for(String s : args){
            System.out.println("User entered command line argument is: "+s);
        }
    }

    public static void main(String[] args) {
        String[]xx={"Hello","I love you"};
        newMain(xx);
    }
}
