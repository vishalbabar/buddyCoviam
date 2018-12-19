package com.coviam.codiecon.mongo.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
@Document(collection = "question")
public class QuestionEntity extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "QUESTION_SEQ")
  @SequenceGenerator(name = "QUESTION_SEQ", sequenceName = "QUESTION_SEQ", allocationSize = 1)
  private String questionId;
  private String title;
  private String questionDesc;
  private String userId;
  private Boolean active;
  private List<TagsEntity> tagsList;
  private List<String> toWhom;
  private String attachment; //attachment
  private Date questionTime;
  private List<AnswerEntity> answerEntityList;
}
