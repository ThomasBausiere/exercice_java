package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String model;

    @Embedded
    private Identification identification;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="idProcessor")
    private Processor processor;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="idOperatingSystem")
    private OperatingSystem operatingSystem;

    @ManyToMany
    @JoinTable(name="computer_project",
    joinColumns = @JoinColumn(name="computerId"),
    inverseJoinColumns = @JoinColumn(name="projectId"))
    private List<Project> projects;

    public void addProject(Project project){projects.add(project);}
    public void removeProject(Project project){projects.remove(project);}


    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", identification=" + identification +
                ", processor=" + processor +
                ", operatingSystem=" + operatingSystem +
                ", projects=" + projects +
                '}';
    }
}