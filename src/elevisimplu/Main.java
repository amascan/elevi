package elevisimplu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        List<Elev> elevi = new ArrayList<>();
        for(String element: FileRead.read("elevi.csv")) {
            Elev a = new Elev(element);
            elevi.add(a);
            map.put(a.nume, a.materii);
            System.out.println(a);
        }


        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

}