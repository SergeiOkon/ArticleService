package com.articleapp.article;

public class ArticleData implements Cloneable {

    private String title;
    private String author;
    private String data;

    ArticleData(String title, String author, String data) {
        this.title = title;
        this.author = author;
        this.data = data;
    }

    String getTitle() {
        return title;
    }

    void setData(String data) {
        this.data = data;
    }

    @Override
    public Object clone() {
        return new ArticleData(title, author, data);
    }

    @Override
    public String toString() {
        return "'" + title + '\'' +
                "\n" + data + "" +
                "\nAuthor:'" + author + '\'';
    }
}
