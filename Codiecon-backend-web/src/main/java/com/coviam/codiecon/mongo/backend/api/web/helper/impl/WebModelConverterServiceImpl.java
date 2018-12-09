package com.coviam.codiecon.mongo.backend.api.web.helper.impl;

import com.coviam.codiecon.mongo.backend.api.web.helper.api.WebModelConverterService;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WebModelConverterServiceImpl implements WebModelConverterService {

  @Autowired
  private Mapper mapper;

  @Override
  public <M, T> T convert1(M entity, Class<T> clasz) throws Exception {
    T response = this.mapper.map(entity, clasz);
    return response;
  }

  @Override
  public <M, T> List<T> convert2(List<M> entities, Class<T> clasz) throws Exception {
    List<T> responseList = new ArrayList<>();
    for (M entity : entities) {
      T response = this.mapper.map(entity, clasz);
      responseList.add(response);
    }
    return responseList;
  }
}
