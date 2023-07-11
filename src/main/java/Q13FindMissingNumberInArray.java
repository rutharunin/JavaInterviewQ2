import java.util.Arrays;

public class Q13FindMissingNumberInArray {
    public static void main(String[] args) {
        int [] arr={0,4,2,3,6,8,1,9,7};
        Arrays.sort(arr);
        for (int i=0; i<10; i++){
            if (i!=arr[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
