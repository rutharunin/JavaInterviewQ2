public class Q7_Extra {
    public static void main(String[] args) {
        long renge = 29l;

        for (int i = 2 ; i<=renge; i++){
            int count =0;
            for (int j =2 ; j<=i/2; j++){
                if (i%j==0) count++;

            }if (count==0) System.out.println(i);
        }

    }
}
