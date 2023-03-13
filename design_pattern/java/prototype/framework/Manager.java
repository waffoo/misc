package framework;
import java.util.*;

public class Manager {
    public HashMap<String, Product> showcase = new HashMap<>();
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }
    public Product create(String protoname) {
        Product p = showcase.get(protoname);
        return p.createClone();
    }
}
