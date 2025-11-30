import java.util.Map;
import java.util.HashMap;

public class D4HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"harry");
        map.put(2,"ronald");
        map.put(3,"hermione");

        System.out.println(map);
        System.out.println(map.get(2));
    }
}
