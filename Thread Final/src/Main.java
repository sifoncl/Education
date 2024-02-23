import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        Map<String, Event> myEvents = new HashMap<>();

        myEvents.put("event 1", new Event("event 1",
                LocalDateTime.of(2024, 2, 17, 3, 24, 01),
                "event 1 description", true));

        myEvents.put("event 2", new Event("event 2",
                LocalDateTime.of(2024, 2, 17, 3, 55, 01),
                "event 1 description", false));

        myEvents.put("event 3", new Event("event 3",
                LocalDateTime.of(2024, 2, 17, 3, 41, 01),
                "event 1 description", false));


        ExecutorService pool = Executors.newFixedThreadPool(4);
        pool.submit(new EventProcessing(myEvents, EventProcessing.EventProcessingMode.COUNTER));
        pool.submit(new EventProcessing(myEvents, EventProcessing.EventProcessingMode.START_NOTIFICATION));
        pool.submit(new EventProcessing(myEvents, EventProcessing.EventProcessingMode.EVENT_IS_HAPPENING));

        pool.submit(new NotificationPrinter());
        
    }
}