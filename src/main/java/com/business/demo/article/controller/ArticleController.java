package com.business.demo.article.controller;



import com.business.demo.article.jpa.form.PageRequestForm;
import com.business.demo.article.model.Article;
import com.business.demo.article.service.ArticleService;


import com.business.demo.article.service.impl.ArticleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * 文章 接口
 */

@RestController
public class ArticleController  {

    //Article自身独有的方法
    @Autowired
    ArticleServiceImp articleServiceImp;

    //Article公用方法，其中包括的大量封装好了的增删查改，和已经定义好的几个分页查询。可以articleBase.查看
    @Autowired
    ArticleBase articleBase;




/*
                                    Artical实体独有的方法，比如
                                    此处写的是在之前代码的GoodsCommentController中的getCommentByPage方法
                                    把 List<GoodsCommentAreaVo> 变成了List<Map<String,Object>>
                                    可以用postman测试。
 */

    @RequestMapping("/getComment")
    public Object etCommentByPage(@Param("type") Integer type, @Param("typeId") Long typeId,
                                                @Param("current") int current, @Param("count") int count) {
       return articleServiceImp.getComment(type,typeId,current,count);
    }




/*
                                几个公共基础类的应用场景，这部分用ArticleBase
 */

    /**
     * 分页查询 form中含有pageNum 和 pageSize
     * @param form
     * @return
     */
    @GetMapping("/listByPage")
    public Object listByPage(PageRequestForm form) {
        Page<Article> result = articleBase.find(form);
        return result;
    }

    /**
     * 获取列表
     * @param
     * @return 所有Article
     */
    @GetMapping("/listAll")
    public List<Article> listAll() {
        List<Article> result = articleBase.findAll();
        return result;
    }

    /**
     * 通过id获取article
     * @param
     * @return 所有Article
     */

    @RequestMapping ("/getById")
    public Article getById(int id) {
        Article result= articleBase.findById(id).orElse(null);
        return   result;
    }

    /**
     * 保存
     * @param  article
     * @return
     */
    @GetMapping("/add")
    public Object add(Article article) {
        articleBase.save(article);
        return "OK";
    }

    /**
     * 更新
     * @param article (id必须传入)
     * @return
     */
    @GetMapping("/update")
    public Object update(Article article) {
        articleBase.saveAndFlush(article);
        return "OK";
    }

    /**
     * 根据id删除对应Article
     * @param
     * @return
     */
    @GetMapping("/deleteById")
    public Object delete(int id) {
        articleBase.deleteById(id);
        return "OK";
    }

}
