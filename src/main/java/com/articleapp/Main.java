package com.articleapp;

import com.articleapp.article.Article;
import com.articleapp.service.ArticleService;

public class Main {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        ArticleService articleService = new ArticleService();

        Article article = new Article("Kiev", "Sergei Okon", "Kiev is the capital and most populous city of Ukraine. It is located in the north-central part of the country along the Dnieper River. The population in July 2015 was 2,887,974 (though higher estimated numbers have been cited in the press), making Kiev the 7th most populous city in Europe.");


        articleService.postArticle(article);
        articleService.showArticles();
        articleService.editArticleByTitle("Kiev", "Cleaned");
        articleService.showArticles();
    }
}
