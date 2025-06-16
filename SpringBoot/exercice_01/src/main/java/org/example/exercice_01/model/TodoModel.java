package org.example.exercice_01.model;



public class TodoModel {
    private String name;
    private String description;
    private boolean isDone;

    public TodoModel(String name, String description, boolean b) {
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
