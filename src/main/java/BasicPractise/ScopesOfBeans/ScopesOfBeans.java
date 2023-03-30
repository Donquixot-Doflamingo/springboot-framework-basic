package BasicPractise.ScopesOfBeans;

import BasicPractise.DependencyInjection.beansConfig;
import BasicPractise.Helper.Doctor;
import BasicPractise.Helper.Nurse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopesOfBeans {

    static ApplicationContext context = new AnnotationConfigApplicationContext(beansConfig.class);

    public static void singletonScope(){
        Doctor doctor = context.getBean(Doctor.class);
        doctor.setQualification("MBBS");
        System.out.println(doctor);
        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);
    }

    public static void prototypeScope(){
        Nurse nurse = context.getBean(Nurse.class);
        Nurse nurse2 = context.getBean(Nurse.class);
        nurse.setQualification("MA");
        System.out.println(nurse);
        System.out.println(nurse2);
    }

    public static void main(String[] args) {
        singletonScope();
    }
}
