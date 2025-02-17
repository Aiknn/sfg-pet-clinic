package guru.springframework.sfgpetclinic.model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person extends BaseEntity{

    private String firstName;
    private String lastName;

}
