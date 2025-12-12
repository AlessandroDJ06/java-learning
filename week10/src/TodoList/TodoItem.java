package TodoList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class TodoItem {
    private String description;
    private int priority;
    private LocalDate deadline;

    public TodoItem(String description,int priority,LocalDate deadline){
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return String.format("%-5d%-40s%s",priority,description,deadline.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

    }
}
