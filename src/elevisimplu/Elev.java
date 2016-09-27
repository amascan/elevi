package elevisimplu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 21.09.2016.
 */
public class Elev {
        String nume;
        String prenume;
        List<Materia> materii;

        public Elev(String temp) {

          //      String temp = FileRead.read("elevi.csv");


                String[] element = temp.split("; ");

                this.nume = element[1];
                this.prenume = element[0];
                Materia m1 = new Materia(element[2]);
                Materia m2 = new Materia(element[3]);
                Materia m3 = new Materia(element[4]);
                materii = new ArrayList<>();
                this.materii.add(m1);
                this.materii.add(m2);
                this.materii.add(m3);

        }

        @Override
        public String toString() {
                return "Elev{" +
                        "nume='" + nume + '\'' +
                        ", prenume='" + prenume + '\'' +
                        ", materii=" + materii +
                        '}';
        }
}
