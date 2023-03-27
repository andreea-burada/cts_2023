package ro.ase.csie.cts.design_patterns.singleton;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class LogService implements ILog {
    private String fileName;
    private File file;
    private PrintWriter writer;
    private static LogService logger;
    private static final String LOG_FILE_NAME = "SingletonLogger.txt";

    private LogService(String fileName) throws IOException {
        super();
        this.fileName = fileName;
        this.file = new File(fileName);
        if (!this.file.exists()) {
            this.file.createNewFile();
        }
        this.writer = new PrintWriter(this.file);
    }

    public static ILog getLogger() throws IOException {
        // log file name can be obtained from application settings or config files
        if (logger == null) {
            logger = new LogService(LOG_FILE_NAME);
        }
        return logger;
    }

    @Override
    public void Error(String message) {
        writer.write(String.format("ERROR - %s\n", message));
        writer.flush();
    }

    @Override
    public void Debug(String message) {
        writer.write(String.format("DEBUG - %s\n", message));
        writer.flush();
    }

    @Override
    public void Info(String message) {
        writer.write(String.format("INFO - %s\n", message));
        writer.flush();
    }
}
