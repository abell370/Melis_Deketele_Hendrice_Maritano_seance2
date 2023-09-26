package model;

public class Car {

    private final String brand;
    private final String model;
    private final String color;
    private final boolean familiar;

    public Car(String brand, String model, String color, boolean familiar){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.familiar = familiar;
    }

    public String toString() {
        String str =  "Votre voiture est une " + this.brand + " " + this.model + " de couleur " + this.color + ".";
        if(this.familiar)
            str += "\nElle permet d'installer un siège enfant et de verrouiller les portes arrières.";
        else
            str += "\nElle est équipée d'un aileron et possède un turbo activable en roulant.";
        return str+"\n================================================================================\n\n";
    }
}
