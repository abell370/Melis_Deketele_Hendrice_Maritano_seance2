import model.*;

public class App {

    public static void main(String[] args) throws Exception {

        Application application = new PdfEditor();
        application.readDocument();

        application = new SimpleTextEditor();
        application.readDocument();

    }
}
