package com.voya.Voya_Sprint_1.dao;

import com.voya.Voya_Sprint_1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByLanId(String lanId);
    Optional<User> findByEmail(String email);
}

