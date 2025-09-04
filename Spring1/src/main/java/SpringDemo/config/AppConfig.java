package SpringDemo.config;

import SpringDemo.Alien;
import SpringDemo.Computer;
import SpringDemo.Desktop;
import SpringDemo.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("SpringDemo")
public class AppConfig {

//    @Bean
//    public Alien alien(Computer com){ //@Qualifier("desktop")
//
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
//  //  @Bean(name = {"com2","desktop1","Beast"} ) //if didn't given any name default name will be taken
//   @Bean
//   //@Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }



}
