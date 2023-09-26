package model;

public abstract class Application {
    private Document document;

    public Application(Document document) {
        this.document = document;
    }

    public void read() {
        this.document.read();
    }

}
