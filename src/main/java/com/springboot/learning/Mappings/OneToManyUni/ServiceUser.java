package com.springboot.learning.Mappings.OneToManyUni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser {

    @Autowired
    RepoUser repoUser;

    public User saveUser(User user) {
        return repoUser.save(user);
    }

    public User getUser(Long userId) {
        return repoUser.findById(userId).get();
    }

    public void deleteUser(Long userId) {
        repoUser.deleteById(userId);
    }

}
