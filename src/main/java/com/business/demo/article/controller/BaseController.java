package com.business.demo.article.controller;

import com.business.demo.article.model.Article;
import org.springframework.stereotype.Repository;


/*
      这里是Article实体类公共方法，继承了泛型BaseRepository<T,V>，其中T是实体类，V是主键

     如果是其他类，比如Address就是：
     @Repository
   interface ArticleBase  extends com.framework.jpa.BaseRepository<Address,Integer> {}

 */
@Repository
   interface ArticleBase  extends com.framework.jpa.BaseRepository<Article,Integer> {}

//@Repository
//interface AddreseBase  extends com.framework.jpa.BaseRepository<Address,Integer> {}


public class BaseController{

}
