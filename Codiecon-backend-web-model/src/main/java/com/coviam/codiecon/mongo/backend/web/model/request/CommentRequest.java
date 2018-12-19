package com.coviam.codiecon.mongo.backend.web.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vishal B
 * @since 19/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentRequest {

    private String answerId;
    private String questionId;
    private String comment;
    private String userId;
    private String attachment;
}
