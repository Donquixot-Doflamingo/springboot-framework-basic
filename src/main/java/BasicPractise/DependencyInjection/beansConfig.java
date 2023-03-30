package BasicPractise.DependencyInjection;

import BasicPractise.Helper.Sweeper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "BasicPractise.Helper")
public class beansConfig {
    // if there is any class that we want to add but isn't defined with Component annotation
    @Bean
    public Sweeper sweeper(){
        return new Sweeper();
    }
}
