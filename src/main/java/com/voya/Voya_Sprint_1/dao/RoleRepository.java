package com.voya.Voya_Sprint_1.dao;

import com.voya.Voya_Sprint_1.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}

