package khegay.crud_app.models;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Entity
@Table(name = "Person")
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Name Should not be empty")
    @Size(min = 2,max = 30,message = "Name should be 2 and 30 characters")
    @Column(name = "name")
    private String name;

    @Min(value = 0,message = "Age should be greater than 0")
    @Column(name = "age")
    private int age;

    @Column(name = "email")
    @NotEmpty(message = "Email shoyld not is empty")
    @Email
    private String email;


    public Person(){}

    public Person(String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
