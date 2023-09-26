package builder;

import model.Car;

import java.util.Scanner;

public class FamiliarCar implements Builder {

    Scanner scanner = new Scanner(System.in);

    @Override
    public Car create(String brand) {
        System.out.print("Quelle modèle souhaiteriez vous : ");
        String model = scanner.nextLine();
        String color = setColor();
        return new Car(brand, model, color, true);
    }

    @Override
    public String setColor() {
        int numColor = 0;
        String color = "";
        while(color.equals("")) {
            System.out.print("Quelle couleur souhaitez-vous ?\n" +
                    "1. Grise\n2. Blanche\nVotre choix : ");
            numColor = scanner.nextInt();
            switch(numColor) {
                case 1:
                    color = "Gris";
                    break;
                case 2:
                    color = "Blanc";
                    break;
                default:
                    break;
            }
        }
        return color;
    }
}
