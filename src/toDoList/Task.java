package toDoList;

import java.util.Date;

public class Task {
    int id;
    String description;
    Date dateCreated;


    public int getId() {
        return id;
    }


    public String getDescription() {
        return description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }



    public Task(int id, String description){

        this.id = id;
        this.description = description;
        this.dateCreated = new Date();
    }
}
