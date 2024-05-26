import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("A", "Maçã");
        mapa.put("B", "Banana");
        mapa.put("C", "Cereja");
        System.out.println(mapa);
    }
}