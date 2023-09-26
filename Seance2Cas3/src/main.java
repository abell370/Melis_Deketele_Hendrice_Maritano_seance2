import builder.FamiliarCar;
import builder.SportsCar;
import director.Director;
import model.Car;
import java.util.Scanner;

public class main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String brand = init();
        int choose = 0;
        do {
            System.out.println(
                    "1. Créer une nouvelle voiture familiale\n" +
                    "2. Créer une nouvelle voiture sportive\n" +
                    "3. Quitter");
            System.out.print("Votre choix : ");
            choose = scanner.nextInt();
            Car car;
            if(choose == 1) {
                car = new Director(new FamiliarCar()).init(brand);
                System.out.println(car.toString());
            } else if(choose == 2) {
                car = new Director(new SportsCar()).init(brand);
                System.out.println(car.toString());
            }
        } while(choose != 3);
        System.out.print("A bientôt !");
    }

    /**
     * init to ask what brand is the car configuration
     */
    private static String init() {
        System.out.println("Bienvenue !");
        String brand = "";
        int numBrand = 3;
        while(brand.equals("")) {
            System.out.print("Quelle marque de voiture souhaitez-vous créer ?\n"+
                    "1. Peugeot\n" +
                    "2. Toyota\n" +
                    "Votre choix : ");
            numBrand = scanner.nextInt();
            switch(numBrand){
                case 1:
                    brand = "Peugeot";
                    break;
                case 2:
                    brand = "Toyota";
                    break;
                default:
                    break;
            }
        }
        return brand;
    }
}
