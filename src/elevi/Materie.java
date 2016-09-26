package elevi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 20.09.2016.
 */
public class Materie {
    List<Double> note;
    double media;
    String nume;

    public Materie(String line) {
        String[] materie = line.split(": ");

            nume = materie[0];
            String[] noteString =  materie[1].split(",+");
            note = new ArrayList<>();
            double sum=0;
            for (int j=0 ; j<noteString.length; j++) {
               double nota1=Double.parseDouble(noteString[j]);
               note.add(nota1);
                sum+=nota1;
            }
            this.media =sum/noteString.length ;
        }

    @Override
    public String toString() {
        return  "note=" + note +
                ", media=" + media +
                ", nume='" + nume + '\'';
    }

    public List<Double> getNote() {
        return note;
    }

    public void setNote(List<Double> note) {
        this.note = note;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }


}
