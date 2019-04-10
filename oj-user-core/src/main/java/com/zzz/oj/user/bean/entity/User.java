package com.zzz.oj.user.bean.entity;

import com.zzz.oj.core.entity.OJEntity;
import com.zzz.oj.user.bean.enums.UserStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
@EqualsAndHashCode(callSuper = false)
public class User extends OJEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String nikName;
    private String password;
    private String accessKey;
    private String secretKey;
    @Enumerated(EnumType.STRING)
    private UserStatus status;
    private String email;

    @Override
    public boolean isInvalid() {
        return false;
    }
}
