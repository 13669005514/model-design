package com.supermap.model.controller;



import com.supermap.model.pojo.request.PageInfo;
import com.supermap.model.service.ElasticsearchSerevice;
import com.supermap.model.utils.R;
import com.supermap.model.validated.GroupPage;
import com.supermap.model.validated.ListPage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;

/**
 * @author : zhangfx 2020/1/14 17:21
 * @version : 1.0
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {


    @Autowired
    private ElasticsearchSerevice elasticsearchSerevice;


    @GetMapping("/hello")
    public R sayHello2()  {
        return R.ok().message("查询成功");
    }

    @PostMapping("/hello3")
    public R sayHello3(@Validated(ListPage.class)@RequestBody  PageInfo pageInfo) {
        return R.ok().message("ES全文检索分页查询结果");
    }

    @PostMapping("/hello4")
    public R sayHello4(@Validated(GroupPage.class)@RequestBody  PageInfo pageInfo)  {
        return R.ok().message("ES全文检索分组查询结果");
    }

}
