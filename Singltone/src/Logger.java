import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {

    @Override
    public String toString() {
        return "Logger{" +
                "loggerLevel=" + loggerLevel +
                ", LOG=" + LOG +
                '}';
    }

    private static Logger instance = null;
    private LoginType loggerLevel;

    private final File LOG = new File("Singltone/log.txt");


    private Logger(LoginType loggerLevel) {
        this.loggerLevel = loggerLevel;
    }

    public static Logger getLogger(LoginType type) {
        if (instance == null) {
            return new Logger(type);
        }
        return instance;
    }

    public void logMessage(LoginType type, String message) throws IOException {
        if (type.getLevel() > this.loggerLevel.getLevel()) {
            try (FileWriter fileWriter = new FileWriter(LOG, true)) {
                fileWriter.write(LocalDateTime.now() + " " + type.toString() + " " + message + "\n");
            }
        }
    }
}
