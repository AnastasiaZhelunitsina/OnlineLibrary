package ru.inno.library.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserForm {
    @Size(min = 2, max = 20)
    private String firstName;

    @NotNull
    @NotBlank
    private String lastName;

    @Email
    private String email;
    private String password;

    private Integer age;
}