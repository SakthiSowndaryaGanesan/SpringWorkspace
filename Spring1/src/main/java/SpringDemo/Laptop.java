package SpringDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Laptop implements Computer{


    @Override
    public void Complie() {
        System.out.println("laptop");
    }
}
