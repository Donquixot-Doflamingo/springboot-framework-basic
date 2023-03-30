package AOPSpringDemo;

import AOPSpringDemo.Config.beanConfig;
import AOPSpringDemo.baseClasses.ShoppingKart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(beanConfig.class);
        ShoppingKart cart = context.getBean(ShoppingKart.class);
        cart.checkOut("CANCELLED");
        cart.quantity();
    }
}
