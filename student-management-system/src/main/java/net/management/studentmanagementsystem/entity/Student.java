package net.management.studentmanagementsystem.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "facuilty")
    private String facuilty;
    @Column(name = "address")
    private String address;
    @Column(name = "Ph. No.")
    private Long PhoneNumber;

//make sure to create default constructor even if the parameterized constructor is created
//    Because hibernte uses intenally forges to create dynamically so it req default constructor
    public Student(){

    }
    public Student(String firstname, String lastname, String email, String facuilty) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.facuilty = facuilty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacuilty() {
        return facuilty;
    }

    public void setFacuilty(String facuilty) {
        this.facuilty = facuilty;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
