package toDoList;
import java.util.Date;
public class Task {
    private final int id;
    private boolean completed;
    private final String dateCreated;
    private final String description;

    public int getId() {
        return id;
    }
    public boolean getCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public String getDateCreated() {
        return dateCreated;
    }
    public String getDescription() {
        return description;
    }

    public Task(int id,boolean completed, String description,String dateCreated){
        this.id = id;
        this.completed = completed;
        this.description = description;
        this.dateCreated = dateCreated;
    }
}
