
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.Thread.sleep;

public class NotificationPrinter implements Runnable {

    static LinkedHashMap<String, String> messeges = new LinkedHashMap();

    static void addMesege(String key, String msg) {
        messeges.put(key, msg);
    }

    @Override
    public void run() {
        while (true) {
            for (Map.Entry<String, String> entery : messeges.entrySet()) {
                System.out.println(entery.getValue());
            }
            System.out.println();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
