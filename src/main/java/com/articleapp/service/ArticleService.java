package com.articleapp.service;

import com.articleapp.article.Article;
import com.articleapp.article.ArticleRepo;

import java.util.List;

public class ArticleService {

    private ArticleRepo articleRepo;

    public ArticleService() {
        articleRepo = new ArticleRepo();
    }

    public void showArticles() {
        getArticles().forEach(System.out::println);
    }

    public void editArticleByTitle(String title, String data){
        Article article = getClonedArticleByTitle(title);
        articleRepo.insertData(article, data);
    }

    public Article getClonedArticleByTitle(String title) {
        return (Article) articleRepo.getArticleByTitle(title).clone();
    }

    public List<Article> getArticles() {
        return articleRepo.getArticles();
    }

    public void postArticle(Article article) {
        articleRepo.add(article);
    }

}
