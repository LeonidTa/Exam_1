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

/*
    public boolean hasCircle(Ort o){
        for (Ort ort : o.nachbarn) {
            if (ort.name.equals(o.name)){
                return true;
            }
            hasCircle(ort);
        }  return false;
    }
 */

    public boolean hasCircle(Ort o){
        for (Ort ort : nachbarn) {
            if (ort.nachbarn.contains(o)){
                return true;
            }
            ort.hasCircle(o);
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
