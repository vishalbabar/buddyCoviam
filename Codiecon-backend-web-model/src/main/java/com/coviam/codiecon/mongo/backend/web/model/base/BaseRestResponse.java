package com.coviam.codiecon.mongo.backend.web.model.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor

/**
 * Created by Vishal B on Oct, 2018
 */

public class BaseRestResponse<T> {

  private String errorMessage;

  private String errorCode;

  private boolean success;

  private T data;

  public BaseRestResponse(boolean success) {
    this.success = success;
  }

  public BaseRestResponse(boolean success, T data) {
    this.success = success;
    this.data = data;
  }

  public BaseRestResponse(boolean success, String errorCode, String errorMessage, T data) {
    this.success = success;
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
    this.data = data;
  }
}
