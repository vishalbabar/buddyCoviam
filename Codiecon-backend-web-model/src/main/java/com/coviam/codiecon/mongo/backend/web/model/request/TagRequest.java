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
public class TagRequest {
    private String tagName;
}
