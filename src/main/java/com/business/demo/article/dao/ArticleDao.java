package com.business.demo.article.dao;



import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface ArticleDao {



@Select("SELECT c.id, u.name, u.portrait, c.content, c.create_date" +
        "        FROM goods_comment AS c" +
        "        LEFT JOIN user AS u ON u.id = c.user_id" +
        "        WHERE c.type = #{type} AND c.type_id = #{typeId}" +
        "        ORDER BY c.create_date DESC LIMIT #{current}, #{count}")
    List<Map<String,Object>> getComment(@Param("type") Integer type, @Param("typeId") Long typeId,
                                        @Param("current") int current, @Param("count") int count);


}
