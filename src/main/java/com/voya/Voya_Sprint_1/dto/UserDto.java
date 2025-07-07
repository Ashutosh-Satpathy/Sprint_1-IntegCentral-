package com.voya.Voya_Sprint_1.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private Long id;

    @NotNull(message = "First name is required")
    private String firstName;

    @NotNull(message = "Last name is required")
    private String lastName;

    @NotNull(message = "Network ID is required")
    private String lanId;

    @Email
    @NotNull(message = "Email is required")
    private String email;

    @NotNull
    private Boolean isActive;
}

