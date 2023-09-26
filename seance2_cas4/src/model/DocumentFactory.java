package model;

public class DocumentFactory implements  IDocumentFactory{

    @Override
    public Document createPdf() {
        return new PdfDocument();
    }

    @Override
    public Document createAscii() {
        return new AsciiDocument();
    }
}
