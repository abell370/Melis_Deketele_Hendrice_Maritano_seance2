import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        IDocumentFactory factory = new DocumentFactory();

        Application pdf = new PdfEditor(factory);
        pdf.createPdf();
        pdf.read();

        Application ascii = new SimpleTextEditor(factory);
        ascii.createAscii();
        ascii.read();
    }
}
