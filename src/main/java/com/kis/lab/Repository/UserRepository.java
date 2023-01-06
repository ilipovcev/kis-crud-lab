package com.kis.lab.Repository;

import com.kis.lab.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}