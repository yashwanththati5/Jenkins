import java.io.File;

public class StartTheAutomation {
    public static void start(String inputfile){
        try {
            new XMLParser().startXMLParser(inputfile);
            new CsvReader().startCsvreader();
            DriverAndWebdriverSetup driverWeb = new DriverAndWebdriverSetup();
            driverWeb.setupTheDriverAndWebdriver();
            new FetchTheData().runTheAutomationOnData();
            driverWeb.stopTheDriver();
        }
        catch (Exception ignored){}
    }
    public static void main(String[] args){
        String inputfile = args[0];
        StartTheAutomation.start(inputfile);
    }
}
