package org.example;

import org.example.dao.ComputerDao;
import org.example.entity.Computer;
import org.example.entity.Identification;

import javax.persistence.EntityManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     EntityManager em;
        ComputerDao cptDao =new ComputerDao();

        Identification identification= new Identification("maxadressExemple","IPADRESST0O:00");
        Identification identification2= new Identification("maxadressExemple2","IPADRESST0O:00");
        Identification identification3= new Identification("maxadressExemple3","IPADRESST0O:0000");
        Computer computer1 = Computer.builder().model("rog1").identification(identification).build();
        Computer computer2 = Computer.builder().model("rog2").identification(identification2).build();
        Computer computer3 = Computer.builder().model("rog3").identification(identification3).build();



        cptDao.createComputer(computer1);
        cptDao.createComputer(computer2);
        cptDao.createComputer(computer3);

     //   cptDao.updateComputer(1, "Asus Certified");

      cptDao.getComputerById(4);

      cptDao.deleteComputer(3);

    }
}