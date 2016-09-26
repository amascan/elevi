package elevi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 20.09.2016.
 */
public class Elev {
    String nume;
    String prenume;
    List<Materie> materii;

    public Elev(String line) {
    String[] temp = line.split("; ");
        prenume = temp[0];
        nume = temp[1];
        materii = new ArrayList<>();
        for(int i=2; i<temp.length; i++) {
            materii.add(new Materie(temp[i]));
        }

    }

    @Override
    public String toString() {
        return "Elev{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", materii=" + materii.toString() +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public List<Materie> getMaterii() {
        return materii;
    }

    public void setMaterii(List<Materie> materii) {
        this.materii = materii;
    }
}
