package com.SpringWorkspace.SpringDataJpa;

import com.SpringWorkspace.SpringDataJpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        Student student1 = context.getBean(Student.class);
        Student student2 = context.getBean(Student.class);
        Student student3 = context.getBean(Student.class);

        StudentRepo repo = context.getBean(StudentRepo.class);

//        student1.setRollNumber(101);
//        student1.setName("Sakthi");
//        student1.setMarks(98);
//
//        student2.setRollNumber(102);
//        student2.setName("Prabha");
//        student2.setMarks(90);

        student3.setRollNumber(103);
        student3.setName("Kavya");
        student3.setMarks(80);

        //Saving the deta
      //  repo.save(student1);
      //  repo.save(student2);
        //repo.save(student3);

        //System.out.println(repo.findAll());
       // System.out.println(repo.findById(103));

        //Optional means it will return a null value. What if the value is not present
//        Optional<Student> std = repo.findById(104);
//        System.out.println(std.orElse(new Student()));



        //To update the data there is no update method so use save
        //repo.save(student3);

        //To delete
        repo.delete(student3);

    }


}
