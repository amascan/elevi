package elevisimplu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    List<Elev> elevi = new ArrayList<>();
        for(String element: FileRead.read("elevi.csv")) {
            Elev a = new Elev(element);
            elevi.add(a);
            System.out.println(a);
        }
    }

    Map m1 = new HashMap();


}