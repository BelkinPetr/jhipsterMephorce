package ru.kaf82.mephi.mephorce.repository;

import ru.kaf82.mephi.mephorce.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
