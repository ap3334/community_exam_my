package com.ll.jung.article;

import com.ll.jung.Rq;
import com.ll.jung.article.dto.ArticleDto;

import java.util.List;

public class ArticleController {

    ArticleService articleService = new ArticleService();

    public void showList(Rq rq) {

        List<ArticleDto> articleDtoList = articleService.findAll();

        rq.setAttr("articles", articleDtoList);
        rq.view("/usr/article/list");

    }
}
