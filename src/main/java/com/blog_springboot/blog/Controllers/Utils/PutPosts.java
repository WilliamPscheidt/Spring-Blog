package com.blog_springboot.blog.Controllers.Utils;

public class PutPosts {
    private String oldTitle;
    private String title;
    private String description;
    private String text;
    private String author;

    public String getOldTitle() {
        return oldTitle;
    }
    
    public void setOldTitle(String oldTitle) {
        this.oldTitle = oldTitle;
    }
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
