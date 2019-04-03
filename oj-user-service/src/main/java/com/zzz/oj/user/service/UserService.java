package com.zzz.cmdtalk.user.service;

import static com.zzz.cmdtalk.user.bean.enums.UserStatus.ENABLE;

import com.zzz.cmdtalk.user.bean.entity.User;
import com.zzz.util.jpa.service.JpaService;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by zhizhao.zhang on 2019/03/01 11:27.
 * Description:
 */
@Service
public class UserService extends JpaService<Long, User> {
    @Override
    public User createNew(User user) {
        Date now = new Date();
        user.setUpdateTime(now);
        user.setCreateTime(now);
        user.setStatus(ENABLE);
        return repository.save(user);
    }
}
