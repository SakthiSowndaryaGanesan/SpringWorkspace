package com.SpringDemo.SpringJDBC.service;

import com.SpringDemo.SpringJDBC.model.Student;
import com.SpringDemo.SpringJDBC.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository stdRepo;

    public StudentRepository getStdRepo() {
        return stdRepo;
    }

    @Autowired
    public void setStdRepo(StudentRepository stdRepo) {
        this.stdRepo = stdRepo;
    }

    public void addStudent(Student std) {
        stdRepo.save(std);

    }

    public List<Student> getStudents() {
        return stdRepo.findAll();
    }
}
