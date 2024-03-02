package toDoList;
import java.util.Date;
public class Task {
    private int id;
    private boolean completed;
    private String dateCreated;
    private String description;

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

    public Task(int id, String description,String dateCreated){
        this.id = id;
        this.completed = false;
        this.description = description;
        this.dateCreated = dateCreated;
    }
}
