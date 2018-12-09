package com.coviam.codiecon.mongo.backend.service.api;


import com.coviam.codiecon.mongo.backend.entity.UserMaster;

/**
 * @author Vishal B
 * @since 07/12/18
 */
public interface UserService {

  UserMaster createUser(UserMaster userMaster);

  UserMaster findByUserName(String userName);

  UserMaster addFollower(String userName,UserMaster userMaster);
}
