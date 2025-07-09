package com.voya.Voya_Sprint_1.dao;

import com.voya.Voya_Sprint_1.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
    @Query("SELECT p FROM Permission p JOIN RolePermission rp ON p.id = rp.permission.id WHERE rp.role.id = :roleId")
    List<Permission> findPermissionsByRoleId(@Param("roleId") Integer roleId);

    @Query("SELECT p FROM Permission p WHERE LOWER(p.permissionName) = LOWER(:permissionName)")
    Optional<Permission> findByPermissionNameIgnoreCase(@Param("permissionName") String permissionName);
}


