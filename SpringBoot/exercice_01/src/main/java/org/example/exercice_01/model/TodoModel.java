package org.example.exercice_01.model;



public class TodoModel {
    private int id;
    private String name;
    private String description;
    private boolean isDone;

    public TodoModel(int id, String name, String description, boolean b) {
    }

    public int getId(int id) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TodoModel{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isDone=" + isDone +
                '}';
    }
}
