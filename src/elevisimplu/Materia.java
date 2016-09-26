package elevisimplu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Materia {

    String numeM;
    List<Integer> noteL;
    Integer[] note;


    public Materia(String linie) {
        String[] materie = linie.split(": ");
        numeM = materie[0];
        //    System.out.println(numeM);
        String[] a = materie[1].split(",");
        try {
            for (int i = 0; i <= a.length; i++) {
                note[i] = Integer.parseInt(a[i]);
            }
        } catch (NullPointerException var11) {
            System.err.println(var11);

       /* String[] a = materie[1].split(",");
        for (int i=0; i<= a.length; i++)
        {
            noteL.add(Integer.parseInt(a[i]));
        }
        */


            // note = Integer.parseInt(materie[1].split(","));
        }
    }
}
