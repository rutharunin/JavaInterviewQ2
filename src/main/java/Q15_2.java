public class Q15_2 {

    public static void main(String[] args) {

        int row = 8;
        String space = " ";
        String star ="* ";

        for (int i =row; i>=0 ; i--){
            for (int j=i; j>0; j--){
                System.out.print(space);
            }
            for (int k =i; k<=row;k++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
