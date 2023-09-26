package model;

import javax.print.Doc;

public abstract class Application {

    public void readDocument() {
        Document doc = createDocument();
        doc.read();
    }

    public abstract Document createDocument();

}
