package com.zzz.oj.user.service;

import static com.zzz.oj.user.bean.enums.UserStatus.ENABLE;

import com.zzz.oj.user.bean.entity.User;
import com.zzz.oj.user.repository.UserRepository;
import com.zzz.util.jpa.service.JpaService;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by zhizhao.zhang on 2019/03/01 11:27.
 * Description:
 */
@Service
public class UserService extends JpaService<Long, User> {

    @Override
    public User createNew(User user) {
        Long now = System.currentTimeMillis();
        user.setUpdateTime(now);
        user.setCreateTime(now);
        user.setStatus(ENABLE);
        if (StringUtils.isEmpty(user.getNikName())) {
            user.setNikName(user.getUsername());
        }
        return repository.save(user);
    }

    public User findByAccessKey(String accessKey) {
        return ((UserRepository) repository).findTopByAccessKey(accessKey);
    }

}
