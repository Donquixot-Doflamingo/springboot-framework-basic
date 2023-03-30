package BasicPractise.Helper;

import org.springframework.beans.factory.BeanNameAware;

import javax.annotation.PostConstruct;

public class Sweeper implements Staff, BeanNameAware {      //For Beans LifeCycle  Class

    public Sweeper(String qualification) {
        Qualification = qualification;
    }

    public Sweeper() {
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    private String Qualification;

    public void assist() {
        System.out.println("Sweeper is assisting");
    }

    @Override
    public String toString() {
        return "Sweeper{" +
                "Qualification='" + Qualification + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean Name Method is called for Sweeper");
    }

    @PostConstruct
    // when the object is created at that point of time if you want to call anything we use Post Initialization
    public void postConstruct(){
        System.out.println("Post Construct Method is called for Sweeper");
    }
}
