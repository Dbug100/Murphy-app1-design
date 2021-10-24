package baseline;

import java.time.LocalDate;

public class EventList {
    private String description;
    private LocalDate date;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void toDoList(LocalDate date, String description){
        this.setDate(date);
        this.setDescription(description);
    }
}
