import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q9RemoveDuplicates {
    public static void main(String[] args) {

        List aList= Arrays.asList("John", "Jane", "James", "Jasmine", "Jane", "James");
        HashSet solution1 = new HashSet<>(aList);
        System.out.println(solution1);


        ArrayList arrayList = new ArrayList<>(aList);
        for (int i=0; i<arrayList.size();i++){
            for (int j=i+1; j<=arrayList.size()-1;j++){
                if (arrayList.get(i).equals(arrayList.get(j))){
                    arrayList.remove(j);
                }
            }

        }
        System.out.println(arrayList);
    }
}
