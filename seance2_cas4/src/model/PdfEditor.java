package model;
public class PdfEditor extends Application{
    public PdfEditor() {
        super();
    }

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
