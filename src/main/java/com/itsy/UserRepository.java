package com.itsy;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itsy.io.entity.NewUserEntity;

@Repository
public interface UserRepository extends CrudRepository<NewUserEntity, Long> {

}
