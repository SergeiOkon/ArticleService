package com.articleapp.article;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepo {
    private List<Article> articles;

    public ArticleRepo() {
        articles = new ArrayList<>();
    }

    public void add(Article article){
        articles.add(article);
    }

    public void insertData(Article article, String data){
        getArticleByTitle(article.getArticleData().getTitle()).getArticleData().setData(data);
    }

    public Article getArticleByTitle(String title){
        return articles.stream().filter(article -> article.getArticleData().getTitle().equals(title))
                .findAny()
                .orElse(null);
    }

    public List<Article> getArticles() {
        return articles;
    }
}
