package com.coviam.codiecon.mongo.backend.master.model.constants;

/**
 * Created by Vishal B on Oct, 2018
 */

public interface ApiPath {

  /**
   * Base Api Paths
   */

  String API = "/api";
  String CURRENCY_MASTER = API + "/currency";
  String USER_MASTER = API + "/user";

  /**
   * Common Api Paths
   */
  String CREATE = "/create";
  String FIND_BY_ID = "/findById";
  String FIND_ALL = "/findAll";
  String FOLLOWERSLIST = "/followersList";
  String ADD_FOLLOWER = "/addFollower";
}
