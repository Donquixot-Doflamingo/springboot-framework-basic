package BasicPractise.Helper;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //For Dependency Injection Class
@Scope(scopeName = "singleton") //For Scope Of beans Class
public class Doctor implements Staff{

    @Override
    public String toString() {
        return "Doctor{" +
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
    private Nurse nurse;

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public void assist(){
        System.out.println("Doctor is assisting");
    }
}
