package com.springboot.learning.ORM.Service;

import com.springboot.learning.ORM.Repo.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceOwn {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    public Users save(Users user){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.find(Users.class, 1L);
        Users userOutput = entityManager.find(Users.class, 1L);
        System.out.println("Entity Manager 1 output" + userOutput.toString());
        entityManager.getTransaction().commit();
        entityManager.close();

        EntityManager entityManager2 = entityManagerFactory.createEntityManager();
        entityManager2.getTransaction().begin();
        entityManager2.find(Users.class, 1L);
        Users userOutput2 = entityManager2.find(Users.class, 1L);
        System.out.println("Entity Manager 1 output" + userOutput2.toString());
        entityManager2.getTransaction().commit();
        entityManager2.close();
        return userOutput2;
    }

}
