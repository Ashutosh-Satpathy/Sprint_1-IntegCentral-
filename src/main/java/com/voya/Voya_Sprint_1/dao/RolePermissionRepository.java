package com.voya.Voya_Sprint_1.dao;

import com.voya.Voya_Sprint_1.entity.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RolePermissionRepository extends JpaRepository<RolePermission, Long> {
    List<RolePermission> findByRoleId(Long roleId);
    Optional<RolePermission> findByRoleIdAndPermissionId(Long roleId, Long permissionId);
}

