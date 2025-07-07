package com.voya.Voya_Sprint_1.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "First name is required")
    private String firstName;

    @NotNull(message = "Last name is required")
    private String lastName;

    @NotNull(message = "Network ID is required")
    @Column(unique = true)
    private String lanId;

    @Email
    @NotNull(message = "Email is required")
    @Column(unique = true)
    private String email;

    @NotNull
    private Boolean isActive;

    // Relationship mapping to roles/permissions will be added in next entities
}

