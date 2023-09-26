package model;

import javax.print.Doc;

public abstract class Application {
    private Document document;
    private final IDocumentFactory documentFactory;

    public Application(IDocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    public void createPdf() {
        this.document = this.documentFactory.createPdf();
    }

    public void createAscii() {
        this.document = this.documentFactory.createAscii();
    }

    public void read() {
        this.document.read();
    }

}
