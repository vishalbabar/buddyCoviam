package com.coviam.codiecon.mongo.backend.web.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vishal B
 * @since 19/12/18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnswerRequest {
    private String answer;
    private String questionId;
    private String userId;
    private String attachment;
}
