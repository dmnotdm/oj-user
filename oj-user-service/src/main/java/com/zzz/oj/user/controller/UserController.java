package com.zzz.cmdtalk.user.controller;

import com.zzz.cmdtalk.user.bean.entity.User;
import com.zzz.util.jpa.controller.BaseController;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhizhao.zhang on 2019/03/01 11:30.
 * Description:
 */
@RestController
public class UserController extends BaseController<Long, User> {
}