package com.coviam.codiecon.mongo.backend.repository;

import com.coviam.codiecon.mongo.backend.entity.UserMaster;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Vishal B
 * @since 07/12/18
 */
public interface UserRepository extends MongoRepository<UserMaster, String> {

    UserMaster findByUserName(String userName);
}
