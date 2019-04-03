package com.zzz.oj.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhizhao.zhang on 2019/02/13 15:46.
 * Description:
 */
@RestController
public class PingController {

    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }

}
