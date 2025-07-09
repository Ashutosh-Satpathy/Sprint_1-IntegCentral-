package com.voya.Voya_Sprint_1.dao;

import com.voya.Voya_Sprint_1.entity.Permission;
import com.voya.Voya_Sprint_1.entity.UserPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserPermissionRepository extends JpaRepository<UserPermission, Long> {
    @Query("SELECT up FROM UserPermission up WHERE up.user.id = :userId")
    List<UserPermission> findByUserId(@Param("userId") Integer userId);

    @Query("SELECT up.permission FROM UserPermission up WHERE up.user.id = :userId")
    List<Permission> findPermissionsByUserId(@Param("userId") Integer userId);
}


