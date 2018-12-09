package com.coviam.codiecon.mongo.backend.api.web.helper.api;

import java.util.List;

public interface WebModelConverterService {

  <M, T> T convert1(M entity, Class<T> clasz) throws Exception;

  <M,T>List<T> convert2(List<M> entities, Class<T> clasz) throws Exception;

}
