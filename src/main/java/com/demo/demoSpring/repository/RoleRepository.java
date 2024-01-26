package com.demo.demoSpring.repository;

import com.demo.demoSpring.models.ERole;
import com.demo.demoSpring.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole role);
}
