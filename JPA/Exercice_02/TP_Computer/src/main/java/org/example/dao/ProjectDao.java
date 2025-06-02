package org.example.dao;


import org.example.entity.Computer;
import org.example.entity.Project;

import java.util.List;

public class ProjectDao extends BaseDao<Project>{

    public List<Project> getAll(){
        return em.createQuery("Select p from Project p", Project.class).getResultList();
    }

}
