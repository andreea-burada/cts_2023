import ro.ase.csie.cts.design_patterns.singleton.ILog;
import ro.ase.csie.cts.design_patterns.singleton.LogService;

import java.io.IOException;
public class Test {
    public static void main(String[] args) throws IOException {
        // ILog logger = new LogService("logs.txt");
        ILog logger = LogService.getLogger();
        logger.Debug("Testing Singleton");
        logger.Info("The End");

        // after 1000 lines of code

        //ILog myLogger = new LogService("myLogger.txt");
        ILog myLogger = LogService.getLogger();
        myLogger.Debug("Different Log File");
        myLogger.Info("The End");

        //ILog logger2 = new LogService("logs.txt");
        ILog logger2 = LogService.getLogger();
        logger2.Info("Another One");

        logger.Info("The End Again");
    }
}
