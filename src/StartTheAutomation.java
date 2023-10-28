public class StartTheAutomation {
    public static void start(){
        try {
//            new XMLParser().startXMLParser();
            new CsvReader().startCsvreader();
            DriverAndWebdriverSetup driverWeb = new DriverAndWebdriverSetup();
            driverWeb.setupTheDriverAndWebdriver();
            new FetchTheData().runTheAutomationOnData();
            driverWeb.stopTheDriver();
        }
        catch (Exception ignored){}
    }
    public static void main(String[] args){
        if(args.length == 0)
        {
            System.out.println("No Arguments passed");
            System.exit(0);
        }
        for(int i = 0; i < args.length; i++){
            if(i == 0)      Data.setInputFilePath(args[i]);
            else if(i == 1) Data.setOutputFilePath(args[i]);
            else if(i == 2) Data.setLeetcodeColumnName(args[i]);
            else if(i == 3) Data.setCodechefColumnName(args[i]);
            else if(i == 4) Data.setCodeforcesColumnName(args[i]);
            else if(i == 5) Data.setGeekforgeeksColumnName(args[i]);
        }
        StartTheAutomation.start();
    }
}
