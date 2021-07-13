package com.designpatterns.structural.flyweight;

import java.lang.annotation.*;

/**
 * @author gxing
 * @desc 注解
 * @date 2021/7/13
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface KeyAnnotation {

    String key() default "";
}
