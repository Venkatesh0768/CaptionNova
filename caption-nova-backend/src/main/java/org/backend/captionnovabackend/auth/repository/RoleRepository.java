package org.backend.captionnovabackend.auth.repository;

import org.backend.captionnovabackend.auth.model.Role;
import org.backend.captionnovabackend.auth.model.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleType name);
}