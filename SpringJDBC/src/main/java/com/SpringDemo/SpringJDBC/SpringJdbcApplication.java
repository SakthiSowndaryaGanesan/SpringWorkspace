package com.SpringDemo.SpringJDBC;

import com.SpringDemo.SpringJDBC.model.Student;
import com.SpringDemo.SpringJDBC.repository.StudentRepository;
import com.SpringDemo.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

        Student std = context.getBean(Student.class);

        std.setRollNumber(105);
        std.setName("Sakthi");
        std.setMarks(98);

        StudentService stdService = context.getBean(StudentService.class);
        stdService.addStudent(std);

        StudentRepository stdRepo = context.getBean(StudentRepository.class);


        List<Student> students = stdService.getStudents();
        System.out.println(students);
    }

}
