import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String, String> mapa = new Hashtable<>();
        mapa.put("A", "Maçã");
        mapa.put("B", "Banana");
        mapa.put("C", "Cereja");
        System.out.println(mapa);
    }
}