package com.SpringDemo.SpringJDBC.repository;

import com.SpringDemo.SpringJDBC.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private static final Logger log = LoggerFactory.getLogger(StudentRepository.class);
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student std) {
        String sql = "insert into students (rollNumber , name,marks) values(?,?,?)";
      int rows = jdbc.update(sql , std.getRollNumber(), std.getName(),std.getMarks());
        System.out.println( rows +"Effected");
    }

    public List<Student> findAll() {

        String sql = "select * from students"; //returns result set

        // to setch the details from the result set needs to use row mapper

        RowMapper<Student> mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

                Student std = new Student();

                std.setRollNumber(rs.getInt("rollNumber"));
                std.setName(rs.getString("name"));
                std.setMarks(rs.getInt("marks"));

                return std;
            }
        };
        return jdbc.query(sql, mapper ); //returns list of students
    }
}
