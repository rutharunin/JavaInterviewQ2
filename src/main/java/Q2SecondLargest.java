public class Q2SecondLargest {
    public static void main(String[] args) {

        int []original = {1,2,3,4,5,6,-10,100};
        int largest=original[0];
        int secondLargest =original[0];

        for (int num:original){
            if (num >largest){
                largest=num;
            }
        }
        for (int num:original){
if (num<largest && num>secondLargest){
    secondLargest=num;
}
        }
        System.out.println(secondLargest);

    }
}
