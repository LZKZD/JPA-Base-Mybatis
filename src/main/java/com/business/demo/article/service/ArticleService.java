package com.business.demo.article.service;

import com.business.demo.article.model.Article;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public interface ArticleService  {

    List<Map<String,Object>> getComment(Integer type, Long typeId, int current, int count);//独有操作



}
