package com.springboot.learning.OneToOne.Repository;

import com.springboot.learning.OneToOne.entity.SinglePK.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressRepo extends JpaRepository<UserAddress, Long> {
}
