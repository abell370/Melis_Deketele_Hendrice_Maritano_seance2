package model;

public interface IDocumentFactory {
    Document createPdf();
    Document createAscii();
}
