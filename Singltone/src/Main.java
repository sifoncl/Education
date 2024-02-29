import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        Logger logger = Logger.getLogger(LoginType.INFO);


        logger.logMessage(LoginType.FATAL, "ОШИБОЧКА!!!!");

        logger.logMessage(LoginType.ERROR, "ЕЩЕ ОДНА !!!");

        logger.logMessage(LoginType.DEBUG, "А эту не запишет");

    }


}