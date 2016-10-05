package elevisimplu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        List<Elev> elevi = new ArrayList<>();
        double mediamat = 0;
        double mediarom = 0;
        double mediasp = 0;

        for(String linie: FileRead.read("elevi.csv")) {
            Elev elev = new Elev(linie);
            elevi.add(elev);

            mediamat = mediamat + elev.materii.get(0).media;
            mediarom = mediarom + elev.materii.get(1).media;
            mediasp = mediasp + elev.materii.get(2).media;

            map.put(elev.materii.get(0).numeM, mediamat/ elevi.size());
            map.put(elev.materii.get(1).numeM, mediarom/ elevi.size());
            map.put(elev.materii.get(2).numeM, mediasp/ elevi.size());

            System.out.println(elev);
        }

        for (String key : map.keySet()) {
            System.out.println("Media generala " + key + "\t" + map.get(key));
        }
    }

}