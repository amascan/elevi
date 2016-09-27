package elevisimplu;

public class Main {
    public static void main(String[] args) {

        System.out.println(FileRead.read("elevi.csv"));
        Elev a = new Elev(FileRead.read("elevi.csv"));
        System.out.println(a);
       // Materia.medie(a.materii.note);
    }



}
