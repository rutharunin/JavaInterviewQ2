import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapThing {
    public static void main(String[] args) {


        Map<String, Integer>myMap=new HashMap<>();
        myMap.put("aaa",2);
        myMap.put("bbb",3);
        myMap.put("ccc",4);
        myMap.put("ddd",1);
int count=0;
for (int value:myMap.values()){
    if (value!=1){
        count++;
    }
}
        System.out.println(count);





    }
}
