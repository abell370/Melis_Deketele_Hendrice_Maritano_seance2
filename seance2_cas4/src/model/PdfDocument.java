package model;
public class PdfDocument implements Document {

    @Override
    public void read() {
        System.out.println("Je suis un document PDF");
    }

}
