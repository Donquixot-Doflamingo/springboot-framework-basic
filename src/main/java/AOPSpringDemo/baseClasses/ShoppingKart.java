package AOPSpringDemo.baseClasses;

import org.springframework.stereotype.Component;

@Component
public class ShoppingKart {

    /* Our Cross Cutting Concerns will be these all called as aspects
    * Logging
    * Authentication and Authorization
    * Sanitize the data
    */

    // Our business Logic
    public void checkOut(String status){
        System.out.println("Checkout method is called from the class ShoppingKart");
    }

    public int quantity(){
        return 2;
    }
}
