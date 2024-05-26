import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> conjunto = new LinkedHashSet<>();
        conjunto.add("Maçã");
        conjunto.add("Banana");
        conjunto.add("Cereja");
        System.out.println(conjunto);
    }
}