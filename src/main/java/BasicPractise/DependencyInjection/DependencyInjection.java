package BasicPractise.DependencyInjection;

import BasicPractise.Helper.Doctor;
import BasicPractise.Helper.Nurse;
import BasicPractise.Helper.Staff;
import BasicPractise.Helper.Sweeper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjection {

    public static void withXmlBasedConfiguration(){
        // in this configuration we use the xml document to make use of our bean container rather than making new objects
        // using the XML configuration for dependency injection
        ApplicationContext context = new ClassPathXmlApplicationContext( "hello.xml");

        // First way of initializing an object without new
        Doctor doctor = (Doctor) context.getBean(Doctor.class);
        doctor.assist();
        // second way of initializing an object without new using the ID provided in spring.xml file
        Doctor doc = (Doctor) context.getBean("doctor");
        doc.assist();
        // Third way of initializing an object without new
        //3.1
        Staff staff = context.getBean(Nurse.class);
        staff.assist();
        //3.2
        Staff staf = (Staff) context.getBean("nurse");
        staf.assist();
        //3.3
        Staff sta = (Nurse) context.getBean("nurse");
        sta.assist();

        // to get the properties from XML -> Setter Injection
        System.out.println(doc.getQualification());

        Nurse nurse = context.getBean(Nurse.class);
        // Constructor injection
        System.out.println(nurse.getQualification());

        // to get setter injection of different class from different object class
        System.out.println(doc.getNurse().getQualification());
    }

    public static void withAnnotationBasedConfiguration(){
        ApplicationContext context = new ClassPathXmlApplicationContext("anotation.xml");
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        Staff nurse = context.getBean(Nurse.class);
        nurse.assist();
    }

    public static void withJavaBasedConfiguration(){
        ApplicationContext context = new AnnotationConfigApplicationContext(beansConfig.class);
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        Staff staff = context.getBean(Nurse.class);
        staff.assist();
        staff = context.getBean(Sweeper.class);
        staff.assist();

    }

    public static void main(String[] args) {
        withAnnotationBasedConfiguration();
    }
}
