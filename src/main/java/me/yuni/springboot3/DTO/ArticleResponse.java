package me.yuni.springboot3.DTO;

import lombok.Getter;
import me.yuni.springboot3.domain.Article;

@Getter
public class ArticleResponse {
    private final String title;
    private final String content;

    public ArticleResponse(Article article){
        this.title=article.getTitle();
        this.content=article.getContent();
    }
}
