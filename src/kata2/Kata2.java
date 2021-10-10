package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 1, 6, 8,5};
        Histogram histo = new Histogram(data);
        
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (int key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
            
        }

    }
    
}


