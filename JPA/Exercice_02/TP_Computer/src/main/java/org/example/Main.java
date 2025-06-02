package org.example;

import org.example.dao.ComputerDao;
import org.example.dao.OperatingSystemDao;
import org.example.dao.ProcessorDao;
import org.example.dao.ProjectDao;
import org.example.entity.*;

import javax.persistence.EntityManager;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     EntityManager em;
        ComputerDao cptDao = new ComputerDao();
        ProjectDao pjtDao = new ProjectDao();
        ProcessorDao processorDao= new ProcessorDao();
        OperatingSystemDao operatingSystemDao = new OperatingSystemDao();

       Identification identification= new Identification("maxadressExemple","IPADRESST0O:00");
//        Identification identification2= new Identification("maxadressExemple2","IPADRESST0O:00");
//        Identification identification3= new Identification("maxadressExemple3","IPADRESST0O:0000");
//        Computer computer1 = Computer.builder().model("rog1").identification(identification).operatingSystem(OperatingSystem.builder().name("NewOS").build()).processor(Processor.builder().processorName("justGiveItAry").build()).build();
//        Computer computer2 = Computer.builder().model("rog2").identification(identification2).build();
//        Computer computer3 = Computer.builder().model("rog3").identification(identification3).build();
//
//
//
 //        cptDao.save(computer1);


//        cptDao.createComputer(computer2);
//        cptDao.createComputer(computer3);

     //   cptDao.updateComputer(1, "Asus Certified");

//      cptDao.getComputerById(4);

 //     cptDao.deleteComputer(3);
   //     cptDao.getAllComputer();

//        System.out.println(cptDao.getAll());

//        Processor processor = Processor.builder().processorName("Obiwan").computers(Arrays.asList(computer1)).build();
//        processorDao.save(processor);
//
//        OperatingSystem operatingSystem =OperatingSystem.builder().name("Kenobi").computers(Arrays.asList(computer1)).build();
//        operatingSystemDao.save(operatingSystem);



//
//        cptDao.update(computer1);

//        Project project1 = Project.builder().name("projet 1").description("ceci est la description du projet 1").build();
//        Project project2 = Project.builder().name("projet 2").description("ceci est la description du projet 2").build();
//        Project project3 = Project.builder().name("projet 3").description("ceci est la description du projet 3").build();
////        pjtDao.save(project1);
//        pjtDao.save(project2);
//        pjtDao.save(project3);
//        Project project1 = pjtDao.getById(1, Project.class);
//        Project project2 = pjtDao.getById(2, Project.class);
//        Project project3 = pjtDao.getById(3, Project.class);
//
//
//        Computer computer1 = cptDao.getById(1, Computer.class );
//        Computer computer2 = cptDao.getById(2, Computer.class );

//        computer1.addProject(project1);
 //      computer1.addProject(project2);
//        computer2.addProject(project3);

 //       computer1.removeProject(project1);

  //      cptDao.save(computer1);
  //      cptDao.save(computer2);

 //       System.out.println(cptDao.getById(1, Computer.class).getProjects());
        System.out.println(pjtDao.getById(3, Project.class).getComputers());




    }
}