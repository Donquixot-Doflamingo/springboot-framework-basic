package BasicPractise.Helper;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //For Dependency Injection Class
@Scope(scopeName = "prototype") //For Scope Of beans Class
public class Nurse implements Staff{
    public Nurse(String qualification) {
        Qualification = qualification;
    }

    public Nurse() {
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "Qualification='" + Qualification + '\'' +
                '}';
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    private String Qualification;

    public void assist() {
        System.out.println("Nurse is assisting");
    }
}
