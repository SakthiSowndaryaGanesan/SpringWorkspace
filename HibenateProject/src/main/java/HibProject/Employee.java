package HibProject;

import jakarta.persistence.*;

@Entity
@Table(name="EmployeeList")
public class Employee {

    @Id   //Primary access key
    private int empID;
    @Column(name = "EmployeeName")
    private String sName;
    private int aAge;


    private String dept;
    @OneToOne
    private Laptop laptop; //Used a laptop class here.


    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getaAge() {
        return aAge;
    }

    public void setaAge(int aAge) {
        this.aAge = aAge;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", sName='" + sName + '\'' +
                ", aAge=" + aAge +
                ", dept='" + dept + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}





