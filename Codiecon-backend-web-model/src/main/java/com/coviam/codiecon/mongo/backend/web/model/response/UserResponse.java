package com.coviam.codiecon.mongo.backend.web.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Vishal B
 * @since 07/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

  private String userId;

  private String userName;

  private String userEmail;

  private String userPassword;

  private int followersCount;

  private int followingCount;

  private String userDescription;

  private List<String> followersList;

  private List<String> followingList;

  private List<UserResponse> followingLists;
}
