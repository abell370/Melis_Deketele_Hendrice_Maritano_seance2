public class BasicPhone implements IBasicPhone{

    protected IManufacturer manufacturer;

    public BasicPhone() {}

    public BasicPhone(IManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void call() {
        System.out.println("Appel sortant "+" "+this.manufacturer.getName() );
    }

    @Override
    public void sendMessage() {
        System.out.println("Sms sended");
    }
    
}
