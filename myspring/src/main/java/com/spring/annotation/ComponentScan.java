package com.spring.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ComponentScan {

    String value() default "";
}
