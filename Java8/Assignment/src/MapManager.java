import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapManager {

    public Set<String> getKeys(Map<String,Integer> hMap){
            return hMap.keySet();
    }

    public static void main(String[] args) {
        MapManager obj = new MapManager();
        Map<String,Integer> hMap = new HashMap<>();
        hMap.put("One",1);
        hMap.put("Two",2);
        hMap.put("Three",3);

        System.out.println(obj.getKeys(hMap));

    }
}
