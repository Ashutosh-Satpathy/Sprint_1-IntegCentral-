package com.voya.Voya_Sprint_1.dao;

import com.voya.Voya_Sprint_1.entity.RoleModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RoleModuleRepository extends JpaRepository<RoleModule, Long> {
    @Query("SELECT rm FROM RoleModule rm WHERE rm.role.id = :roleId")
    List<RoleModule> findByRoleId(@Param("roleId") Integer roleId);

    @Query("SELECT rm.module FROM RoleModule rm WHERE rm.role.roleName = :roleName")
    List<Module> findModulesByRoleName(@Param("roleName") String roleName);
}

