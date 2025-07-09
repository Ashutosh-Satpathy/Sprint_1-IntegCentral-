package com.voya.Voya_Sprint_1.dao;

import com.voya.Voya_Sprint_1.entity.Role;
import com.voya.Voya_Sprint_1.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    @Query("SELECT ur FROM UserRole ur WHERE ur.user.id = :userId")
    List<UserRole> findByUserId(@Param("userId") Integer userId);

    @Query("SELECT ur.role FROM UserRole ur WHERE ur.user.id = :userId")
    List<Role> findRolesByUserId(@Param("userId") Integer userId);
}

