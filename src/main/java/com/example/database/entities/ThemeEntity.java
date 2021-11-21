package com.example.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Theme")
@Getter
@Setter
public class ThemeEntity {

    @Id
    @Column(name = "id_work_theme")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    @Column(name = "title_of_thesis")
    @NotNull
    private String title;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="teacher_code")
    @NotNull
    private TeacherEntity teacher;

    @Override
    public String toString() {
        return title;
    }
}
