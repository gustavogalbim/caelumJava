package neliosudemy.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CollegeStudent {

    private String name;
    private String email;

    public CollegeStudent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString(){
        return  name + ", "
                + email;
    }
}
