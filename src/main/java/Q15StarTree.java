public class Q15StarTree {
    public static void main(String[] args) {
        int height = 10;
        String space = " ";
        String star = "* ";
        for (int i=1; i<=height; i++){
            for (int j=i;j<height; j++){
                System.out.print(space);}
                for (int k=1; k<i;k++){
                    System.out.print(star);
                }System.out.println();
        }
    }
}

