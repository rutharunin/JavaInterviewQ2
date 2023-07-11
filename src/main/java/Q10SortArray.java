import com.sun.source.doctree.SeeTree;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Q10SortArray {
    public static void main(String[] args) {
        int [] nums={3,7,7,6,2,2,9};
        int temp = 0;
        List<Integer> list11 =Arrays.stream(nums).boxed().collect(Collectors.toList());
        TreeSet numSet=new TreeSet(list11);
        System.out.println(numSet.toString());



        for (int i=0;i< nums.length;i++){

            for (int j=i+1;j< nums.length;j++){
                if (nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));



//        for (int i =0; i < nums.length; i++){
//            for (int j=i+1; j< nums.length; j++){
//                if (nums[i]>nums[j]){
//                    temp=nums[i];
//                    nums [i]=nums[j];
//                    nums[j]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(nums));

    }
}
