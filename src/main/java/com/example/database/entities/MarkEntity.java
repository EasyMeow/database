package com.example.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Mark")
@Getter
@Setter
public class MarkEntity {

    @Id
    @Column(name = "mark_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    @Column(name = "assessment_received_on_project_defense")
    private int exam_mark;

    @Column(name = "assessment_received_at_the_state_exam")
    private int defence_mark;

}
