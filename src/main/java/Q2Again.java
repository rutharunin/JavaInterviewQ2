public class Q2Again {
    public static void main(String[] args) {
        int[] array = {-100, -50, -150, -300, -200, -450, -350};

        int largest=array[0];
        for (int i=0;i<array.length;i++){
            if(array[i]>largest)largest=array[i];
        }
        System.out.println(largest);
        //=================================================================================================
        //this breaks when the index of the real second largest is equal the pre-initialized second largest
        //this has no solution.
        //=================================================================================================
        int secondLargest=array[1];
        for (int i=0;i<array.length;i++){
            if (array[i]<largest && array[i]>secondLargest){
                secondLargest=array[i];
            }
        }
        System.out.println(secondLargest);
    }
}