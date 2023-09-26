package model;
public class SimpleTextEditor extends Application{
    public SimpleTextEditor() {
        super();
    }

    @Override
    public Document createDocument() {
        return new AsciiDocument();
    }
}
