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
public class AnswerEntity extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ANSWER_SEQ")
  @SequenceGenerator(name = "ANSWER_SEQ", sequenceName = "ANSWER_SEQ", allocationSize = 1)
  private String answerId;
  private String answer;
  private String questionId;
  private String userId;
  private String attachment;
  private Date answerTime;
  private int upvotesCount;
  private List<String> userIdUpvoted;
  private List<CommentEntity> commentClassList;
}
