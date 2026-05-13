package com.springboot.learning.associations.OneToOne.Bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiUserRepo extends JpaRepository<BiUser, Long> {
}
