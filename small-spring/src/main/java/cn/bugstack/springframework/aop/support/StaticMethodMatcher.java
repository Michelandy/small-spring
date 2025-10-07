package cn.bugstack.springframework.aop.support;


import cn.bugstack.springframework.aop.MethodMatcher;

import java.lang.reflect.Method;


public abstract class StaticMethodMatcher implements MethodMatcher {

    @Override
    public boolean matches(Method method, Class<?> clazz) {
        throw new UnsupportedOperationException("Illegal MethodMatcher usage");
    }
}
