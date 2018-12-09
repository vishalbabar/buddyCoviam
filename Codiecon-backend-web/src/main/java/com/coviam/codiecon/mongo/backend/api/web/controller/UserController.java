package com.coviam.codiecon.mongo.backend.api.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coviam.codiecon.mongo.backend.api.web.helper.api.WebModelConverterService;
import com.coviam.codiecon.mongo.backend.entity.UserMaster;
import com.coviam.codiecon.mongo.backend.master.model.constants.ApiPath;
import com.coviam.codiecon.mongo.backend.master.model.enums.Error;
import com.coviam.codiecon.mongo.backend.master.model.exceptions.BusinessException;
import com.coviam.codiecon.mongo.backend.service.api.UserService;
import com.coviam.codiecon.mongo.backend.web.model.base.BaseRestResponse;
import com.coviam.codiecon.mongo.backend.web.model.request.UserWebRequest;
import com.coviam.codiecon.mongo.backend.web.model.response.UserResponse;

/**
 * @author Vishal B
 * @since 07/12/18
 */
@RestController
@RequestMapping(value = "/userController")
public class UserController {

  @Autowired
  private UserService userService;

  @Autowired
  private WebModelConverterService webModelConverterService;

  @PostMapping(value = ApiPath.CREATE)
  public BaseRestResponse<UserResponse> createUser(@RequestParam int storeId,
      @RequestBody UserWebRequest userWebRequest) {
    UserResponse userResponse;
    try {
      UserMaster userMaster = userService
          .createUser(this.webModelConverterService.convert1(userWebRequest, UserMaster.class));
      userResponse = this.webModelConverterService.convert1(userMaster, UserResponse.class);
    } catch (BusinessException e) {
      return new BaseRestResponse<>(e.getErrorCode(), e.getMessage(), false, null);
    } catch (Exception e) {
      return new BaseRestResponse<>(Error.SYSTEM_ERROR.getMessage(), Error.SYSTEM_ERROR.getCode(),
          false, null);
    }
    return new BaseRestResponse<>(true, userResponse);
  }

  @GetMapping(value = ApiPath.FIND_BY_ID)
  public BaseRestResponse<UserResponse> findById(@RequestParam int storeId,
      @RequestParam String userName) {
    UserResponse userResponse;
    try {
      userResponse = this.webModelConverterService
          .convert1(this.userService.findByUserName(userName), UserResponse.class);
    } catch (BusinessException e) {
      return new BaseRestResponse<>(e.getErrorCode(), e.getMessage(), false, null);
    } catch (Exception e) {
      return new BaseRestResponse<>(Error.SYSTEM_ERROR.getMessage(), Error.SYSTEM_ERROR.getCode(),
          false, null);
    }
    return new BaseRestResponse<>(true, userResponse);
  }

  @PostMapping(value = ApiPath.ADD_FOLLOWER)
  public BaseRestResponse<UserResponse> addFollower(@RequestParam int storeId,
      @RequestParam String userName, @RequestBody UserWebRequest userWebRequest) {
    UserResponse userResponse;
    try {
      UserMaster userMaster = userService
          .addFollower(userName,this.webModelConverterService.convert1(userWebRequest, UserMaster.class));
      userResponse = this.webModelConverterService.convert1(userMaster, UserResponse.class);
    } catch (BusinessException e) {
      return new BaseRestResponse<>(e.getErrorCode(), e.getMessage(), false, null);
    } catch (Exception e) {
      return new BaseRestResponse<>(Error.SYSTEM_ERROR.getMessage(), Error.SYSTEM_ERROR.getCode(),
          false, null);
    }
    return new BaseRestResponse<>(true, userResponse);
  }
}
