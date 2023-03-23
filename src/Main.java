import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("hieu", 28);
        hashMap.put("nam", 26);
        hashMap.put("khiet", 30);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in TreeMap");
        System.out.println(treeMap + "\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("nhan", 27);
        linkedHashMap.put("hieuHoa", 20);
        linkedHashMap.put("namGay", 19);
        System.out.println(linkedHashMap.get("hieuHoa"));

    }
}