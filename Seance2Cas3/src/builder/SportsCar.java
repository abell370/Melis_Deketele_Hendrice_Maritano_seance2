package builder;

import model.Car;
import java.util.Scanner;

public class SportsCar implements Builder {

    Scanner scanner = new Scanner(System.in);

    @Override
    public Car create(String brand) {
        System.out.print("Quelle modèle souhaiteriez vous : ");
        String model = scanner.nextLine();
        String color = setColor();
        return new Car(brand, model, color, false);
    }

    @Override
    public String setColor() {
        int numColor = 0;
        String color = "";
        while(color.equals("")) {
            System.out.print("Quelle couleur souhaitez-vous ?\n" +
                    "1. Rouge\n2. Bleue\nVotre choix : ");
            numColor = scanner.nextInt();
            switch(numColor) {
                case 1:
                    color = "Rouge";
                    break;
                case 2:
                    color = "Bleu";
                    break;
                default:
                    break;
            }
        }
        return color;
    }
}
