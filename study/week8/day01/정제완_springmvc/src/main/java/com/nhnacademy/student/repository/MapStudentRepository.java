package com.nhnacademy.student.repository;

import com.nhnacademy.student.domain.Student;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapStudentRepository implements StudentRepository{
    private Map<String, Student> studentsMap = new ConcurrentHashMap<>();
    @Override
    public void save(Student student) {
        studentsMap.put(student.getId(),student);
    }

    @Override
    public void update(Student student) {
        studentsMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(String id) {
        studentsMap.remove(id);
    }

    @Override
    public Student getStudentById(String id) {
        return studentsMap.get(id);
    }

    @Override
    public List<Object> getStudents() {
        return new ArrayList<>(studentsMap.values());
    }

    @Override
    public boolean existById(String id) {
        if(Objects.isNull(studentsMap.get(id))){
            return false;
        }
        else return true;
    }
}
