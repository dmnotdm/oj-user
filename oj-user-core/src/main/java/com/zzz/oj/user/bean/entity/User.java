package com.zzz.oj.user.bean.entity;

import com.zzz.oj.user.bean.enums.UserStatus;
import com.zzz.util.jpa.entity.JpaEntity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by zhizhao.zhang on 2019/02/04 23:54.
 * Description: 用户基础对象
 */
@Data
@Entity
public class User implements JpaEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String nik;
    private String password;
    private String accessKey;
    private String secretKey;
    @Enumerated(EnumType.STRING)
    private UserStatus status;
    private Long createTime;
    private Long updateTime;

    @Override
    public Long primaryKey() {
        return id;
    }
}
