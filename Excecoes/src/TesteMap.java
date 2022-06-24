import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TesteMap {
    public static void main(String[] args) {
        
        Map<Integer, String> familia = new HashMap<>();
        familia.put(22, "Jeziel");
        familia.put(42, "Ana");
        familia.put(25, "Adiel");
        familia.put(26, "Arielton");
        familia.put(64, "Aristides");

        familia.keySet().forEach(idade -> {
            System.out.println(familia.get(idade));
        });

        Set<Entry<Integer, String>> associacoes = familia.entrySet();

        for (Entry<Integer,String> associacao : associacoes) {
            System.out.println(associacao);
        }

    }
}
