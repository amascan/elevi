package elevisimplu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Materia {

    String numeM;
    List<Integer> note;


    public Materia(String linie) {
        String[] materie = linie.split(": ");
        numeM = materie[0];
        //    System.out.println(numeM);
        String[] a = materie[1].split(",");
        note = new ArrayList<>();
        int sumanote = 0;
        Double media;
        for (int i = 0; i < a.length; i++) {
            note.add(Integer.parseInt(a[i]));
            sumanote = sumanote + Integer.parseInt(a[i]);
        }
        media = (double) sumanote / a.length;
        System.out.println(media);
    }

    public static Integer medie(ArrayList note) {
        int tmp = 0;
        for (int i = 0; i < note.size(); i++) {
            tmp = tmp + (int)note.get(i);

        }
        return tmp / note.size();
    }

        @Override
        public String toString () {
            return numeM = numeM + '\'' +
                    ", note=" + note +;
        }
    }
