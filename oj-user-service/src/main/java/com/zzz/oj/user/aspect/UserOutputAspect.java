package com.zzz.oj.user.aspect;

import com.zzz.oj.user.bean.entity.User;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhizhao.zhang on 2019/04/11 19:59.
 * Description: controller返回user对象时，不返回密码
 */
@Aspect
@Component
public class UserOutputAspect {

    @Pointcut("execution(public (com.zzz.util.jpa.entity.JpaEntity+ || java.util.List) com.zzz.util.jpa.controller.BaseController+.*(..))")
    public void pointCut() {
    }

    @AfterReturning(returning = "ret", pointcut = "pointCut()")
    public void afterReturning(Object ret) {
        if (ret instanceof List) {
            for (Object obj : (List) ret) {
                if (obj instanceof User) {
                    clearPwd((User) obj);
                }
            }
            return;
        }
        if (ret instanceof User) {
            clearPwd((User) ret);
        }
    }

    private static void clearPwd(User user) {
        if (user == null) {
            return;
        }
        user.setPassword(null);
    }

}
