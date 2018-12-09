package com.coviam.codiecon.mongo.backend.web.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Vishal B
 * @since 07/12/18
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserWebRequest implements Serializable {
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userDescription;
}
