package memento.calculator;

import java.util.HashMap;
import java.util.Map;

public class MementoManager<T> {

    private Map<String, T> map;
    
    private int count;

    public MementoManager() {
        map = new HashMap<String, T>();
        count = 0;
    }
    
    public void addMemento(String key, T memento) {
        map.put(count + ": " + key, memento);
        count++;
    }
    
    public T getMemento(String key) {
        return map.get(key);
    }
    
    public String[] keys() {
        return map.keySet().toArray(new String[map.size()]);
    }
}
