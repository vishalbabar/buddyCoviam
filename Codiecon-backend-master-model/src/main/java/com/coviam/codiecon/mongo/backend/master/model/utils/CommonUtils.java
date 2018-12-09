package com.coviam.codiecon.mongo.backend.master.model.utils;

import com.coviam.codiecon.mongo.backend.master.model.enums.Error;
import com.coviam.codiecon.mongo.backend.master.model.exceptions.BusinessException;

/**
 * Created by Vishal B on Oct, 2018
 */

public interface CommonUtils {

  static void checkError(boolean cond, Error error) {
    if (cond) {
      throw new BusinessException(error);
    }
  }
}
