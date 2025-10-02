package com.thoisana.student_management_system.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private Long id;
    @NotEmpty(message = "First Name Can't Be Blank!")
    private String firstName;
    @NotEmpty(message = "Last Name Can't Be Blank!")
    private String lastName;
    @NotEmpty(message = "Email can't Be Blank & Must Be Unique!")
    @Email
    private String email;

}
