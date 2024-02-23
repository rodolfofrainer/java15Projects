package toDoList;

import java.util.Date;

public class Task {
    int id;
    String description;
    Date dateCreated;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }


    public Task(int id, String description){
        Date dateCreated = new Date();
    }
}
