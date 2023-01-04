package com.example.lab7.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Getter @Setter @Table @Entity @NoArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
    @Transient
    private int age;
    private String status;

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public void update() {
        if (status.equals(null)) {
            this.setStatus("Waiting for order");
        }
        else {
            this.setStatus("Order is delivered");
        }
    }
}
