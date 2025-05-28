package org.example.dao;

import org.example.entity.Animal;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class animalDao extends BaseDao {
 Scanner scanner = new Scanner(System.in);

    @Override
    public boolean saveElement(Object element) throws EntityNotFoundException {
        System.out.println("Enter animal name: ");
        String name = scanner.nextLine();
        System.out.println("Enter animal age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter animal date of arrival: ");
        Date date = Date.valueOf(scanner.nextLine());
        System.out.println("Enter animal Alimentation type: ");

        String  alimentation = scanner.nextLine().toUpperCase();
        Animal.Alimentation alimentation1 = Animal.Alimentation.CARNIVORE;
        try{
             alimentation1 = Animal.Alimentation.valueOf(alimentation);
        }catch (IllegalArgumentException e){
            System.out.println("Invalid alimentation");
        }

        Animal animal = Animal.builder()
                .name(name)
                .age(age)
                .dateOfArrival(date)
                .alimentation(alimentation1)
                .build();

        if (animal != null) {
            em.getTransaction().begin();
            em.persist(animal);
            em.getTransaction().commit();
            System.out.println("Animal " + animal.getName() + " saved");
        }
            return (animal != null);
    }

    @Override
    public Object getById(int id) throws EntityNotFoundException {
        Animal animalById = em.find(Animal.class, id);
        if(animalById != null) {
            System.out.println("Animal " + animalById.getName() + " found");
        }else{
            System.out.println("Animal " + id + " not found");
        }
        return animalById;
    }

    @Override
    public List<Animal> getByName(String name) throws EntityNotFoundException {
        TypedQuery<Animal> query = em.createQuery("select a from Animal a where a.name = :name", Animal.class);
        query.setParameter("name", name);
        List<Animal> animals = query.getResultList();

        return animals;
    }

    @Override
    public Object getByAlimentation(String alimentation) throws EntityNotFoundException {
        return Animal.Alimentation.valueOf(alimentation);
        }

}
