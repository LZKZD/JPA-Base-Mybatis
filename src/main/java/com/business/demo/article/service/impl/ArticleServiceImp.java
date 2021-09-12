package com.business.demo.article.service.impl;

import com.business.demo.article.dao.ArticleDao;


import com.business.demo.article.service.ArticleService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 文章 服务层实现
 */

@Service
public class ArticleServiceImp  implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    //独有操作

    @Override
    public List<Map<String, Object>> getComment(Integer type, Long typeId, int current, int count) {
        return articleDao.getComment(type,typeId,current,count);
    }
}
