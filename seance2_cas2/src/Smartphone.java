public class Smartphone extends BasicPhone {

    public Smartphone(IManufacturer manufacturer) {
        super.manufacturer = manufacturer;
    }

    public void surfOnWeb() {
        System.out.println("I surf on web");
    }

    public void takePicture() {
        System.out.println("I can take pictures");
    }

}
