package org.example.dao;

import org.example.entity.Computer;
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

}

