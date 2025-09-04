package SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //(com2) we can search by the name
public class Alien {

    @Value("21")
   private int age;

   @Autowired
   @Qualifier("laptop") //Will search by the name
   private Computer com;

    public Alien(){

        System.out.println("Object created");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called here");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding...");
        com.Complie();

    }
}
