package com.zzz.oj.user.controller;

import com.zzz.oj.user.bean.entity.User;
import com.zzz.oj.user.service.UserService;
import com.zzz.util.jpa.controller.BaseController;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhizhao.zhang on 2019/03/01 11:30.
 * Description:
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController<Long, User> {

    @RequestMapping("find-by-access-key")
    public User findByAccessKey(String accessKey) {
        if (StringUtils.isBlank(accessKey)) {
            return null;
        }
        return ((UserService) service).findByAccessKey(accessKey);
    }

}
