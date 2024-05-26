import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, String> mapa = new LinkedHashMap<>();
        mapa.put("A", "Maçã");
        mapa.put("B", "Banana");
        mapa.put("C", "Cereja");
        System.out.println(mapa);
    }
}
