import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Maçã");
        conjunto.add("Banana");
        conjunto.add("Cereja");
        System.out.println(conjunto);
    }
}