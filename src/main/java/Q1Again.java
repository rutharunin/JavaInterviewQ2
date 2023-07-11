public class Q1Again {
    public static void main(String[] args) {
        int a=5;
        int b=10;

        b=a+b; //15
        a=b-a; //10
        b=b-a;
        System.out.println(a);
        System.out.println(b);
        switchString();
    }
    public static void switchString(){
        String x="Hello";
        String y="Techtorial";
        x=x+y;
        y=x.substring(0,5);
        x=x.substring(5);
        System.out.println(x);
        System.out.println(y);
    }
}
