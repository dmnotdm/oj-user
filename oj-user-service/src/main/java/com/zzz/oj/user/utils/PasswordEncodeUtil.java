package com.zzz.oj.user.utils;

import com.zzz.oj.user.bean.entity.User;

import lombok.SneakyThrows;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Created by zhizhao.zhang on 2019/04/10 14:50.
 * Description:
 */
public class PasswordEncodeUtil {

    @SneakyThrows
    public static void EncodePwd(User user) {
        String password = user.getPassword();
        byte[] bytes = MessageDigest.getInstance("SHA1").digest(password.getBytes());
        user.setPassword(new BigInteger(bytes).toString(16));
    }

}
