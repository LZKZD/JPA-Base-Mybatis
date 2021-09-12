package com.business.demo.article.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

import static com.business.demo.article.model.Article.TABLE_NAME;

@Data
@Entity
@Table(name = TABLE_NAME)

public class Article implements Serializable {

    public static final String TABLE_NAME = "Article";


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Id
    private int id ;

    @Column(length = 250)
    private String title;

    @Column(length = 250)
    private String content;

}
