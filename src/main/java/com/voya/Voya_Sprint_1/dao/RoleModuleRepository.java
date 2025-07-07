package com.voya.Voya_Sprint_1.dao;

import com.voya.Voya_Sprint_1.entity.RoleModule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoleModuleRepository extends JpaRepository<RoleModule, Long> {
    List<RoleModule> findByRoleId(Long roleId);
    Optional<RoleModule> findByRoleIdAndModuleId(Long roleId, Long moduleId);
}

