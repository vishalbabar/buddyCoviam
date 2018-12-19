package com.coviam.codiecon.mongo.backend.web.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Vishal B
 * @since 19/12/18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionRequest {

    private String title;
    private String questionDesc;
    private String userId;
    private List<String> tagsList;
    private List<String> toWhom;
    private String attachment; //attachment
}
