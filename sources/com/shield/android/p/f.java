package com.shield.android.p;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface f {
    j dV();

    int ea() default 0;

    h eb() default h.AUTOMATIC;

    i ec() default i.NORMAL;

    int ed() default -1;

    boolean ee() default false;

    j ef() default j.ANY;
}
