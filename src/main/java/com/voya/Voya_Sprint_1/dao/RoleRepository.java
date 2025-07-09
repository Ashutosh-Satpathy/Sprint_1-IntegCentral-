package com.voya.Voya_Sprint_1.dao;

import com.voya.Voya_Sprint_1.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query("SELECT r FROM Role r WHERE LOWER(r.roleName) = LOWER(:roleName)")
    Optional<Role> findByRoleNameIgnoreCase(@Param("roleName") String roleName);

    @Query("SELECT r FROM Role r JOIN r.users u WHERE u.email = :email")
    List<Role> findRolesByUserEmail(@Param("email") String email);
}


