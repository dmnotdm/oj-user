package com.zzz.cmdtalk.user.repository;

import com.zzz.cmdtalk.user.bean.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhizhao.zhang on 2019/03/01 11:25.
 * Description:
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
