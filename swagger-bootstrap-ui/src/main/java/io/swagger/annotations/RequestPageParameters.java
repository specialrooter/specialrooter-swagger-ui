/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */
package io.swagger.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestPageParameters {

    /***
     * dynamic Model name
     * @return 类名
     */
    String name() default "";
    DynamicParameters where() default @DynamicParameters;
    DynamicParameters sortKeys() default @DynamicParameters;
    DynamicParameters desenKeys() default @DynamicParameters;
    Class<?> whereClass() default Void.class;
    Class<?> sortKeysClass() default Void.class;
    Class<?> desenKeysClass() default Void.class;
}
