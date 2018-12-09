package com.coviam.codiecon.mongo.backend.web.model.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Vishal B on Oct, 2018
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse implements Serializable {

  private static final long serialVersionUID = -323845324096545062L;

  private int storeId;
  private String createdBy;
  private Date createdDate;
  private String updatedBy;
  private Date updatedDate;
  private boolean markForDelete;

}
