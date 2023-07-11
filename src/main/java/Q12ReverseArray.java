import java.util.Arrays;

public class Q12ReverseArray {
    public static void main(String[] args) {
        int nums [] ={45,62,7,67, 23,35,11};
        int temp=0;
        for (int i=0, j= nums.length-1; i<nums.length/2;i++, j--){
            temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
