public class Q1switchNumber {
    public static void main(String[] args) {
        int a =45;
        int b =54;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a"+a +"\nb"+b);

        String c ="abc";
        String d ="def";

        c = c+d;
        d = c.substring(0,3);
        c = c.substring(3);
        System.out.println(c);
        System.out.println(d);
    }
}
