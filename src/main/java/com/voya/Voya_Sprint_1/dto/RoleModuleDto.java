package com.voya.Voya_Sprint_1.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleModuleDto {

    private Long id;

    @NotNull(message = "Role ID is required")
    private Long roleId;

    @NotNull(message = "Module ID is required")
    private Long moduleId;
}

