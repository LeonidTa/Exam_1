package rekursion;

import java.util.ArrayList;

public class Ort {
    private String name;
    private ArrayList<Ort> nachbarn = new ArrayList<>();

    public Ort(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ort> getNachbarn() {
        return nachbarn;

    }

    public void addNachbar(Ort o){
        nachbarn.add(o);
    }

    public boolean hasCircle(Ort o){
        for (Ort ort : nachbarn) {
            if (ort.nachbarn.contains(o)){
                return true;
            }
            if (ort.hasCircle(o)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Ort{" +
                "name='" + name + '\'' +
                '}';
    }
}
