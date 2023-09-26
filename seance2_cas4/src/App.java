import model.Application;
import model.ApplicationFactory;
import model.IApplicationFactory;

public class App {
    public static void main(String[] args) throws Exception {
        IApplicationFactory appFactory = new ApplicationFactory();
        Application pdfApp = appFactory.createPdfApp();
        Application simpleTxtApp = appFactory.createSimpleTextApp();
        pdfApp.read();
        simpleTxtApp.read();
    }
}
