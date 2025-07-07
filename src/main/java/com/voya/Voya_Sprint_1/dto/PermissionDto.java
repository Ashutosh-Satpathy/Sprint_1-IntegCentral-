package com.voya.Voya_Sprint_1.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PermissionDto {

    private Long id;

    @NotNull(message = "Permission name is required")
    private String name;

    private String description;
}

