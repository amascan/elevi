package elevisimplu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Materia {

    String numeM;
    List<Integer> note;
    double media;


    public Materia(String linie) {
        String[] materie = linie.split(": ");
        numeM = materie[0];
        String[] a = materie[1].split(",");
        note = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            note.add(Integer.parseInt(a[i]));
        }
        int tmp = 0;
        for (int i = 0; i < note.size(); i++) {
            tmp = tmp + note.get(i);
        }
        media = (double)(tmp) / (double)note.size();
    }

    @Override
    public String toString () {
       return numeM = numeM + '\'' +
          ", note=" + note + ", Media=" + media ;
        }
    }
