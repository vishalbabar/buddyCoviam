package com.coviam.codiecon.mongo.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import java.util.Date;
import java.util.List;

/**
 * @author Vishal B
 * @since 19/12/18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentEntity extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "QUESTION_SEQ")
  @SequenceGenerator(name = "QUESTION_SEQ", sequenceName = "QUESTION_SEQ", allocationSize = 1)
  private String commentId;
  private String answerId;
  private String comment;
  private String userId;
  private Date commentTime;
  private String attachment;
  private List<String> userIdUpvoted;
  private int upvotesCount;

}
