package com.HospitalManagement.doclogin.enity;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String age;
    private String systomps;
    private String number;

    public Appointment(Long id, String name, String age, String systomps, String number) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.systomps = systomps;
        this.number = number;
    }
    public Appointment(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSystomps() {
        return systomps;
    }

    public void setSystomps(String systomps) {
        this.systomps = systomps;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
