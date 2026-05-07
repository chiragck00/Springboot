package com.springboot.learning.Mappings.OneToManyUni;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoUser extends JpaRepository<User, Long> {
}
