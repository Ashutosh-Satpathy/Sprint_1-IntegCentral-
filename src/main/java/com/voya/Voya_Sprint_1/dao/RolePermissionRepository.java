package com.voya.Voya_Sprint_1.dao;

import com.voya.Voya_Sprint_1.entity.Permission;
import com.voya.Voya_Sprint_1.entity.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RolePermissionRepository extends JpaRepository<RolePermission, Long> {
    @Query("SELECT rp FROM RolePermission rp WHERE rp.role.id = :roleId")
    List<RolePermission> findByRoleId(@Param("roleId") Integer roleId);

    @Query("SELECT rp.permission FROM RolePermission rp WHERE rp.role.roleName = :roleName")
    List<Permission> findPermissionsByRoleName(@Param("roleName") String roleName);
}

