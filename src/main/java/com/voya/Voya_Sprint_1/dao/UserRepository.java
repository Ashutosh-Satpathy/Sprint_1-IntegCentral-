package com.voya.Voya_Sprint_1.dao;

import com.voya.Voya_Sprint_1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.role.roleName = :roleName")
    List<User> findUsersByRoleName(@Param("roleName") String roleName);

    @Query("SELECT u FROM User u WHERE u.status = 'ACTIVE'")
    List<User> findActiveUsers();

    @Query("SELECT u FROM User u WHERE LOWER(u.clientLegalName) LIKE LOWER(CONCAT('%', :namePart, '%'))")
    List<User> searchByClientLegalName(@Param("namePart") String namePart);

    @Query("SELECT u FROM User u WHERE u.planId = :planId")
    List<User> findByPlanId(@Param("planId") String planId);
}


