package com.example.database.services;


import com.example.database.entities.MarkEntity;
import com.example.database.entities.StudentEntity;
import com.example.database.entities.ThemeEntity;
import com.example.database.repo.MarkRepository;
import com.example.database.repo.StudentRepository;
import com.example.database.repo.ThemeRepository;
import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final MarkRepository markRepository;
    private final ThemeRepository themeRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, MarkRepository markRepository, ThemeRepository themeRepository) {
        this.studentRepository = studentRepository;
        this.markRepository = markRepository;
        this.themeRepository = themeRepository;
    }

    public StudentEntity createStudent() {
        StudentEntity student = new StudentEntity();
        MarkEntity mark = new MarkEntity();
        student.setMark(mark);
        return student;
    }

    public void save(StudentEntity student){
        markRepository.save(student.getMark());
        studentRepository.save(student);
    }

    public void delete (StudentEntity student) {
        if(student != null) {
            markRepository.delete(student.getMark());
            studentRepository.delete(student);
        } else {
            Notification notification = new Notification("Невозможно удалить пустого студента",5000);
            notification.open();
        }
    }

    public List<StudentEntity> loadStudents() {
        return studentRepository.findAll();
    }

    public List<ThemeEntity> loadThemes() {
        return themeRepository.findAll();
    }
}
