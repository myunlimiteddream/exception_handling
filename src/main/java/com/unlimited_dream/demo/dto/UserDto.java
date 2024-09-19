package com.unlimited_dream.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UserDto {

    @Email
    private String email;

    @Length(min = 6, max = 20)
    private String fullName;

    @NotBlank
    private String address;
}
