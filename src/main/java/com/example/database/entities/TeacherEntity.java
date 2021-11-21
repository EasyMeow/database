package com.example.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Teather")
@Getter
@Setter
public class TeacherEntity {
    @Id
    @Column(name = "teacher_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    @Column(name = "teather_full_name")
    @NotNull
    private String name;

    @Column(name = "degree")
    private String degree;

    @Column(name = "rank")
    private String rank;

    @Column(name = "pulpit")
    @NotNull
    private String pulpit;

    @Column(name = "phone_number")
    @NotNull
    private String phoneNumber;

    @Column(name = "e_mail")
    private String email;

    @Override
    public String toString() {
        return  name;
    }
}
