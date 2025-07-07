package com.voya.Voya_Sprint_1.dao;

import com.voya.Voya_Sprint_1.entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ModuleRepository extends JpaRepository<Module, Long> {
    Optional<Module> findByName(String name);
}

