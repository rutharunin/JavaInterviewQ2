public class Q2_ReRun {
    public static void main(String[] args) {
        int []original = {1,2,3,4,5,6,-10,100,99};
        int largest=original[3];
        int secondLargest=original[1];
        for (int number:original){
//            if (number>largest){largest=number;}
         }
        for (int number:original){
//            if (number<largest && number>secondLargest){secondLargest=number;}
            secondLargest=number<largest && number>secondLargest? number:secondLargest;
        }System.out.println(secondLargest);
    }
}
