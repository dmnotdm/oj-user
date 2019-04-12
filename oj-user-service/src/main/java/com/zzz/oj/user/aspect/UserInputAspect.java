package com.zzz.oj.user.aspect;

import com.zzz.oj.user.bean.entity.User;
import com.zzz.oj.user.utils.PasswordEncodeUtil;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by zhizhao.zhang on 2019/04/11 19:59.
 * Description: controller层入参有User对象时，对User加密
 */
@Aspect
@Component
public class UserInputAspect {

    @Pointcut("execution(public * com.zzz.util.jpa.controller.BaseController+.*(com.zzz.util.jpa.entity.JpaEntity+, ..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        for (Object arg : joinPoint.getArgs()) {
            if (arg instanceof User) {
                PasswordEncodeUtil.encodePwd((User) arg);
                continue;
            }
        }
    }

}
