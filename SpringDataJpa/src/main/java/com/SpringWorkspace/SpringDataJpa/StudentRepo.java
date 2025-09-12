package com.SpringWorkspace.SpringDataJpa;

import com.SpringWorkspace.SpringDataJpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
