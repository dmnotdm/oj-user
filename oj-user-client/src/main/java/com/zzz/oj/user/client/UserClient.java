package com.zzz.oj.user.client;

import com.zzz.oj.user.bean.entity.User;
import com.zzz.util.jpa.client.BaseClient;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by zhizhao.zhang on 2019/03/02 16:51.
 * Description:
 */
@FeignClient(name = "user-service", path = "/user")
public interface UserClient extends BaseClient<Long, User> {
}
