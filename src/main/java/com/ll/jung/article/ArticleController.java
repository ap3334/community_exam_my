package com.ll.jung.article;

import com.ll.jung.Rq;
import com.ll.jung.article.dto.ArticleDto;

import java.util.List;

public class ArticleController {

    ArticleService articleService = new ArticleService();

    public void showList(Rq rq) {

        List<ArticleDto> articleDtoList = articleService.findAll();

        rq.setAttr("articles", articleDtoList);
        rq.view("usr/article/list");

    }

    public void showWrite(Rq rq) {

        rq.view("usr/article/write");

    }

    public void doWrite(Rq rq) {

        String title = rq.getParam("title", "");
        String body = rq.getParam("body", "");

        long id = articleService.write(title, body);

        rq.replace("/usr/article/list", "%d번 글이 생성되었습니다.".formatted(id));
    }
}
