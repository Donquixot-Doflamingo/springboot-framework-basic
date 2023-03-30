package BasicPractise.BeansLifeCycle;

import BasicPractise.DependencyInjection.beansConfig;
import BasicPractise.Helper.Doctor;
import BasicPractise.Helper.Sweeper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeansLifeCycle {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(beansConfig.class);
        Sweeper sweeper = context.getBean(Sweeper.class);
        sweeper.setQualification("CA");
        System.out.println(sweeper);
        sweeper.assist();
    }
}
