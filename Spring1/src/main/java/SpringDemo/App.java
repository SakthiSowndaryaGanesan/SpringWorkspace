package SpringDemo;


import SpringDemo.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean( Desktop.class);
        dt.Complie();

        Desktop dt1 = context.getBean(Desktop.class);
        dt.Complie();

        Alien obj1 = context.getBean(Alien.class);
        obj1.code();
        System.out.println(obj1.getAge()) ;




//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1 = (Alien)context.getBean("alien");
//        obj1.code();
   //    obj1.age = 21; //It will change the both value. Different refference but same obj

//          System.out.println(obj1.getAge());

//        Alien obj2 = (Alien)context.getBean("alien");
    //    obj2.code();
     //   System.out.println(obj2.age);



    }
}
