public class O2xxxx {


    public static void main(String[] args) {
        int[] array = {-100, -300, -200, -450,-350};
        int largest = array[0];
        int secondLargest = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }

    }
        System.out.println(secondLargest);
    }}
