import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;


public class EventProcessing implements Runnable {

    public enum EventProcessingMode {

        COUNTER, START_NOTIFICATION, EVENT_IS_HAPPENING

    }

    private Map<String, Event> myEvents;
    private EventProcessingMode mode;


    public EventProcessing(Map<String, Event> myEvents, EventProcessingMode mode) {
        this.myEvents = myEvents;
        this.mode = mode;
    }

    @Override
    public void run() {
        switch (mode) {

            case COUNTER:

                while (true) {
                    for (Map.Entry<String, Event> entry : myEvents.entrySet()) {

                        long beetween = Duration.between(LocalDateTime.now(),
                                entry.getValue().getDate()).toSeconds();
                        if ((beetween <= 3600) && (beetween > 0)) {
                            String msg = "До мероприятия " + entry.getValue().getName() + " осталось " + beetween / 60 +
                                    " минут, и " + beetween % 60 + " секунд";
                            NotificationPrinter.addMesege(entry.getKey(), msg);
                        }
                    }
                }

            case START_NOTIFICATION:
                while (true) {
                    for (Map.Entry<String, Event> entry : myEvents.entrySet()) {
                        long beetween;
                        if (((beetween = Duration.between(LocalDateTime.now(),
                                entry.getValue().getDate()).toSeconds()) < 0) && (entry.getValue().isActive() == false)) {
                            entry.getValue().setActive(true);
                            System.out.println("Мероприятие: " + entry.getValue().getName() + " началось");
                        }
                    }
                }
            case EVENT_IS_HAPPENING:
                while (true) {
                    for (Map.Entry<String, Event> entry : myEvents.entrySet()) {
                        if (entry.getValue().isActive()) {
                            String msg = "Мероприятие: " + entry.getValue().getName() + " уже идет: " + Duration.between(entry.getValue().getDate(),
                                    LocalDateTime.now()).toMinutes() + " минут";
                            NotificationPrinter.addMesege(entry.getKey(), msg);
                        }
                    }
                }
        }
    }

    public Map<String, Event> getMyEvents() {
        return myEvents;
    }

    public void setMyEvents(Map<String, Event> myEvents) {
        this.myEvents = myEvents;
    }

    public EventProcessingMode getMode() {
        return mode;
    }

    public void setMode(EventProcessingMode mode) {
        this.mode = mode;
    }
}


