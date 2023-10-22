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
        if (args.length != 1) {
            System.err.println("Usage: java YourAutomation <inputXML>");
            System.exit(1);
        }
        String inputfile = args[0];
        StartTheAutomation.start(inputfile);
    }
}
