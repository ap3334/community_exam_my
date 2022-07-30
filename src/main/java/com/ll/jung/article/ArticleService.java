package com.ll.jung.article;

import com.ll.jung.article.dto.ArticleDto;

import java.util.List;

public class ArticleService {

    private ArticleRepository articleRepository = new ArticleRepository();

    public List<ArticleDto> findAll() {
        return articleRepository.findAll();
    }

    public long write(String title, String body) {

        return articleRepository.write(title, body);

    }
}
