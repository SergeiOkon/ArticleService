package com.articleapp.article;

public class Article implements Cloneable {

    private ArticleData articleData;

    public Article(String title, String author, String data) {
        this.articleData = new ArticleData(title, author, data);
    }

    private Article(Article article) {
        this.articleData = (ArticleData) article.articleData.clone();
    }

    ArticleData getArticleData() {
        return articleData;
    }

    @Override
    public Object clone() {
        return new Article(this);
    }

    @Override
    public String toString() {
        return articleData.toString();
    }
}
