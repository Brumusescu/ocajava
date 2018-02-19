/**
 * Created by Diana on 2/4/2018.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class TestClass {
    public static void main(String[] args) throws IOException{
        /* Ensure directory has been created */
        Files.createDirectories(Paths.get("logs"));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
        LocalDateTime now = LocalDateTime.now();
        String date = now.format(df);
        String logFileName = "logs\\testlog-" + date + ".txt";
        /* Set up Logger */
        FileHandler myFileHandler = new FileHandler(logFileName);
        Logger ocajLogger = Logger.getLogger("OCAJ Logger");
        ocajLogger.setLevel(Level.ALL);
        ocajLogger.addHandler(myFileHandler);
        ocajLogger.info("\n This is a logged information message. ");
        myFileHandler.close();
    }
}
