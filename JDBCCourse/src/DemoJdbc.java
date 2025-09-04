import java.sql.*;

import static java.lang.Class.forName;

public class DemoJdbc {

    public static void main (String[] args) throws ClassNotFoundException, SQLException {

        /*
        import package
        load and register
        create connection
        create statement
        execute statement
        process the result
        close

         */
        int studentid = 4;
        String studentname = "Sowndarya";
        int marks = 76;

        String url = "jdbc:postgresql://localhost:5432/Demo" ;
        String uname = "postgres";
        String pass = "postgres";

        // String query = "update student set studentname= 'steve' where studentid=5" ;
       // String query = "delete from student where studentid =5";
        String query = "insert into student values (?,?,?)" ;
        String query1 = " select * from student" ;


        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");

        PreparedStatement pstatement = con.prepareStatement(query); //pass the query here it self for the precomplie.

        pstatement.setInt(1,studentid);
        pstatement.setString(2,studentname);
        pstatement.setInt(3,marks);

        pstatement.execute();

      //  boolean  status = statement.execute(query);
      //  System.out.println(status);

       // ResultSet rs = statement.executeQuery(query1); //to get value

//        System.out.println(rs.next()); //Returns boolean
//        String name = rs.getString("studentname"); //getting the string value
//        System.out.println("Student name : " + name);
//        con.close();
//        System.out.println("Connection closed");

//        while(rs.next()){ //point to the next row
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2)+ " - ");
//            System.out.println(rs.getInt(3));
//
//        }

        con.close();
        System.out.println("Connection closed");

    }
}
