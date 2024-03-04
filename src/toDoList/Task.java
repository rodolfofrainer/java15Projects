package toDoList;

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
    public void setCompleted(int id, boolean completed) {
        this.completed = completed;
        JDBC.updateCompletedStatusInDatabase(id, completed);
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
