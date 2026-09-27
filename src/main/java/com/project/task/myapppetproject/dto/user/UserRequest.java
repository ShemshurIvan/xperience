package com.project.task.myapppetproject.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest(@NotBlank @Size(max = 50) String firstName,
                          @NotBlank @Size(max = 50) String lastName,
                          @NotBlank @Email String email,
                          @NotBlank @Size(min = 8, max = 72) String password) {
}
