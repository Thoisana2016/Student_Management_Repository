package com.thoisana.student_management_system.mapper;

import com.thoisana.student_management_system.dto.StudentDto;
import com.thoisana.student_management_system.entity.Student;

public class StudentMapper {

    //studentdto to student entity, mapping
    public static StudentDto mapToStudentDto (Student student){
        StudentDto studentDto = new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );
        return studentDto;
    }

    //student jpa entity
    public static Student mapToStudent(StudentDto studentDto){
        Student student = new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getEmail()
        );
        return student;
    }
}
