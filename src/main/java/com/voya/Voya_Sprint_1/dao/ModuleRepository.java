package com.voya.Voya_Sprint_1.dao;

import com.voya.Voya_Sprint_1.entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ModuleRepository extends JpaRepository<Module, Long> {
    @Query("SELECT m FROM Module m JOIN RoleModule rm ON m.id = rm.module.id WHERE rm.role.id = :roleId")
    List<Module> findModulesByRoleId(@Param("roleId") Integer roleId);

    @Query("SELECT m FROM Module m WHERE LOWER(m.moduleName) = LOWER(:moduleName)")
    Optional<Module> findByModuleNameIgnoreCase(@Param("moduleName") String moduleName);
}


