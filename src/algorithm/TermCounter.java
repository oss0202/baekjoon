package algorithm;

import java.util.HashMap;
import java.util.Map;

public class TermCounter {
    private Map<String, Integer> map;
    private String label;

    public TermCounter(String label) {
        this.label = label;
        this.map = new HashMap<>();
    }

    public void put(String term, int count){
        map.put(term, count);
    }
    public Integer get(String term){
        Integer count = map.get(term);
        return count == null ? 0 : count;
    }
}
