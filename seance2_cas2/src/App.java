public class App {
    public static void main(String[] args) throws Exception {
     
        IManufacturer apple = new Apple();
        IManufacturer samsung = new Samsung();

        BasicPhone basicPhoneSamsung = new BasicPhone(samsung);
        BasicPhone basicPhoneApple = new BasicPhone(apple);
        Smartphone smartphone = new Smartphone(apple);

        basicPhoneApple.call();
        basicPhoneSamsung.call();
        System.out.println("-------------");
        smartphone.call();
        smartphone.sendMessage();
        smartphone.surfOnWeb();
        smartphone.takePicture();

    }
}
