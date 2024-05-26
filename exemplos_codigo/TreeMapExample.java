import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, String> mapa = new TreeMap<>();
        mapa.put("A", "Maçã");
        mapa.put("B", "Banana");
        mapa.put("C", "Cereja");
        System.out.println(mapa);
    }
}