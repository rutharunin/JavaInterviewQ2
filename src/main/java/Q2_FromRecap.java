public class Q2_FromRecap {

    public static void main(String[] args) {

//        int[] array = {450, 100, 125, 300, 200, 350};
//        int[] array = {-100, -125, -300, -200, -450, -350};
        int[] array = {5,4,3,2,1};
        int max1 = array[0];
        int max2 = array[1];
        for (int num:array) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        System.out.println(max2);
    }
}
