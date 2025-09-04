package HibProject;

import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.SQLOutput;
//

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setsName("Sundar");
        employee.setaAge(24);
        employee.setEmpID(13007);
        employee.setDept("IT");
        System.out.println(employee);

        Laptop l1 = new Laptop();

        l1.setLaptopId(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);

//        Configuration config = new Configuration();
//        config.addAnnotatedClass(HibProject.Employee.class);
//        config.configure();

        //Another way of using this config method

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(HibProject.Laptop.class)
                .addAnnotatedClass(HibProject.Employee.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(employee);
        transaction.commit(); // to save in database

        Employee employee1=session.getReference(Employee.class , 13001);

        session.close();
        sf.close();

    }
}