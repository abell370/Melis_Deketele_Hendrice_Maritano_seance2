package model;
public class ApplicationFactory  implements IApplicationFactory{

    @Override
    public Application createPdfApp() {
        return new PdfEditor(new PdfDocument());
    }

    @Override
    public Application createSimpleTextApp() {
        return new SimpleTextEditor(new AsciiDocument());
    }
    
}
