package com.example.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Student")
@Getter
@Setter
public class StudentEntity {

    @Id
    @Column(name = "grade_book_number")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    @Column(name = "student_full_name")
    @NotNull
    @NotEmpty
    private String name;

    @Column(name = "faculty")
    @NotNull
    @NotEmpty
    private String faculty;

    @Column(name = "student_group")
    @NotNull
    private int group;

    @OneToOne
    @JoinColumn(name = "id_work_theme", referencedColumnName ="id_work_theme")
    private ThemeEntity theme;

    @OneToOne
    @JoinColumn(name = "grade_book_number",referencedColumnName = "mark_id")
    @NotNull
    private MarkEntity mark;

}
