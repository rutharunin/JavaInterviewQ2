public class Q2KeyAnswer {

    public static void main(String[] args) {

//        int[] array = {450, 100, 125, 300, 200, 350};
//        int[] array = {-100, -50, -150, -300, -200, -450, -350};
        int[] array = {-100, -300, -200, -450,-350};
//        int[]array={5,4,3,2,1};
        int largest = array[0];
        int secondLargest =array[1];
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //this will break if neither the first nor the second if is true
        //it happens if the pre-initialized largest+pre-initialized second-largest index is the same as the real largest index
        //we need to differentiate the pre-initialized the largest and the second-largest indexes

        // Eventually, this is the only solution.
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i];
            }
        }
        System.out.println(secondLargest);
    }
}
