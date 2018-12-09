package com.coviam.codiecon.mongo.backend.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coviam.codiecon.mongo.backend.entity.UserMaster;
import com.coviam.codiecon.mongo.backend.master.model.enums.Error;
import com.coviam.codiecon.mongo.backend.master.model.exceptions.BusinessException;
import com.coviam.codiecon.mongo.backend.master.model.utils.CommonUtils;
import com.coviam.codiecon.mongo.backend.repository.UserRepository;
import com.coviam.codiecon.mongo.backend.service.api.UserService;

/**
 * @author Vishal B
 * @since 07/12/18
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserRepository userRepository;

  @Override
  public UserMaster createUser(UserMaster userMaster) {
    UserMaster existingUser = this.userRepository.findByUserName(userMaster.getUserName());
    CommonUtils.checkError(existingUser != null, Error.USER_EXISTS);
    UserMaster userMaster1 = new UserMaster();
    userMaster1.setUserName(userMaster.getUserName());
    userMaster1.setUserDescription(userMaster.getUserDescription());
    userMaster1.setUserEmail(userMaster.getUserEmail());
    userMaster.setUserPassword(userMaster.getUserPassword());
    return this.userRepository.save(userMaster);
  }

  @Override
  public UserMaster findByUserName(String userName) {
    return this.userRepository.findByUserName(userName);
  }

  @Override
  public UserMaster addFollower(String userName, UserMaster userMaster) {
    UserMaster existingUser = this.userRepository.findByUserName(userName);
    CommonUtils.checkError(existingUser == null, Error.USER_NOT_FOUND);
    List<UserMaster> userMaster12 = existingUser.getFollowingLists();
    UserMaster follow = this.userRepository.findByUserName(userMaster.getUserName());
    CommonUtils.checkError(existingUser == null, Error.USER_NOT_FOUND);
    if (existingUser.getFollowingLists() != null) {
      for (int i = 0; i < existingUser.getFollowingLists().size(); i++) {
        if (existingUser.getFollowingLists().get(i).getUserName().equals(userMaster.getUserName())) {
          throw new BusinessException(Error.FOLLOWERS_EXISTS);
        }
      }
    }
    if (userMaster12 == null) {
      userMaster12 = new ArrayList<>();
    }
    userMaster12.add(follow);
    existingUser.setFollowingLists(userMaster12);
    return this.userRepository.save(existingUser);
  }
}
