package com.coviam.codiecon.mongo.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.util.List;

/**
 * @author Vishal B
 * @since 07/12/18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user_master")
public class UserMaster implements Serializable {

  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="LICENSE_SEQ")
  @SequenceGenerator(name="LICENSE_SEQ",sequenceName="LICENSE_SEQ",allocationSize=1)
  private String userId;

  private String userName;

  private String userEmail;

  private String userPassword;

  private int followersCount;

  private int followingCount;

  private String userDescription;

  private String userImageName;

  private List<String> followersList;

  private List<String> followingList;

  private List<UserMaster> followingLists;
}
