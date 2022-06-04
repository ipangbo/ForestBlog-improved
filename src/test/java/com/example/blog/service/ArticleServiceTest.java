package com.example.blog.service;

import com.example.blog.BaseTest;
import com.example.blog.entity.Article;
import com.example.blog.enums.ArticleStatus;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author 言曌
 * @date 2020/10/10 2:36 下午
 */

public class ArticleServiceTest extends BaseTest {

    @Autowired
    private ArticleService articleService;

    @Test
    public void countArticle() {
        int count = articleService.countArticle(ArticleStatus.PUBLISH.getValue());
        System.out.println(count);
        Assert.state(count > 0, "已发布文章数量为0");
    }

    @Test
    public void listRecentArticle() {
        List<Article> articleList = articleService.listRecentArticle(null, 5);
        Assert.notEmpty(articleList, "文章数量为0");
    }
}
