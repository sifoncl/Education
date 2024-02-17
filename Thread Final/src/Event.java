import java.time.LocalDateTime;
import java.util.Objects;

public class Event {

    private String name;
    private LocalDateTime date;
    private String descriprion;
    private boolean isActive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescriprion() {
        return descriprion;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Event(String name, LocalDateTime date, String descriprion, boolean isActive) {
        this.name = name;
        this.date = date;
        this.descriprion = descriprion;
        this.isActive = isActive;
    }
}
