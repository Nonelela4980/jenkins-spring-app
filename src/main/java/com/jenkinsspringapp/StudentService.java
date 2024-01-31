package com.jenkinsspringapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();
    private long nextId = 1;

    public StudentService() {
        // Adding dummy student data
        createStudent(new Student("John", "Doe", 20));
        createStudent(new Student("Jane", "Smith", 22));
        createStudent(new Student("Alice", "Johnson", 21));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Optional<Student> getStudentById(Long id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst();
    }

    public Student createStudent(Student student) {
        student.setId(nextId++);
        students.add(student);
        return student;
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId().equals(id)) {
                updatedStudent.setId(id);
                students.set(i, updatedStudent);
                return updatedStudent;
            }
        }
        throw new RuntimeException("Student not found with id: " + id);
    }

    public void deleteStudent(Long id) {
        students.removeIf(student -> student.getId().equals(id));
    }
}
