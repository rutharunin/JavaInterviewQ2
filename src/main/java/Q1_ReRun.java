public class Q1_ReRun {
    //swap numbers


    public static void main(String[] args) {
        int a=5;
        int b=10;
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println(a);
        System.out.println(b);

        String c ="abc";
        String d ="def";
        c=c+d;
        d=c.substring(0,3);
        c=c.substring(3);
        System.out.println(c);
        System.out.println(d);
    }
}
