package org.example.dao;

import org.example.entity.Computer;
import org.example.entity.Project;
import org.example.util.DataBaseManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class ComputerDao extends BaseDao<Computer>{

    public List<Computer> getAll(){
        return em.createQuery("Select c from Computer c", Computer.class).getResultList();
    }

    public List<Project> getAllProjectById(int i){
        return em.createQuery("Select c_p from computer_project c_p WHERE computerId=i", Project.class).getResultList();
    }

}

