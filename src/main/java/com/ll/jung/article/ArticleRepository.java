package com.ll.jung.article;

import com.ll.jung.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArticleRepository {

    private static List<ArticleDto> articleDtoList;

    private static long id;

    static {
        articleDtoList = new ArrayList<>();
        id = 0;
        makeTestData();
    }

    private static void makeTestData() {
        IntStream.rangeClosed(1, 10).forEach(id -> {
            String title = "제목%d".formatted(id);
            String body = "내용%d".formatted(id);
            write(title, body);
        } );
    }

    private static long write(String title, String body) {

        id++;

        ArticleDto articleDto = new ArticleDto(id, title, body);

        articleDtoList.add(articleDto);

        return id;
    }

    public List<ArticleDto> findAll() {

        return articleDtoList;
    }
}
