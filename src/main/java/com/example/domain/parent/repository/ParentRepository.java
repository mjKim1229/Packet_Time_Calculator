package com.example.domain.parent.repository;

import com.example.domain.parent.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParentRepository extends JpaRepository<Parent,Long> {
    Optional<Parent> findByEmail(String email);
}
