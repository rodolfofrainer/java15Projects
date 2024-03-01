package toDoList;
import java.util.Date;
public class Task {
    private int id;
    private String description;
    private long dateCreated;

    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public long getDateCreated() {
        return dateCreated;
    }

    public Task(int id, String description){
        this.id = id;
        this.description = description;
        this.dateCreated = new Date().getTime();
    }
}
