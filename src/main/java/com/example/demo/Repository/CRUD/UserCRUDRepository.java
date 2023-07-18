package com.example.demo.Repository.CRUD;

import com.example.demo.Model.User;
import org.springframework.data.repository.CrudRepository;


import java.util.Optional;

public interface UserCRUDRepository extends CrudRepository<User, Integer> {
    public Optional<User> findByEmail(String email);

    public Optional<User> findByEmailAndPassword(String email, String password);
}
