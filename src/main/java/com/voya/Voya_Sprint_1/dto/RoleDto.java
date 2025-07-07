package com.voya.Voya_Sprint_1.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleDto {

    private Long id;

    @NotNull(message = "Role name is required")
    private String name;

    private String description;

    private Boolean isSystemDefined;
}

