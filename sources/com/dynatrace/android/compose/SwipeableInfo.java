package com.dynatrace.android.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class SwipeableInfo {
    public static final int $stable = 8;
    private final Object fromStateObject;
    private final Object source;
    private final Object toStateObject;

    public SwipeableInfo(Object obj, Object obj2, Object source) {
        j.g(source, "source");
        this.fromStateObject = obj;
        this.toStateObject = obj2;
        this.source = source;
    }

    public final String getFromState() {
        return String.valueOf(this.fromStateObject);
    }

    public final String getSourceName() {
        return this.source.getClass().getName();
    }

    public final String getToState() {
        return String.valueOf(this.toStateObject);
    }

    public String toString() {
        return "SwipeableInfo{fromState=" + getFromState() + ", toState=" + getToState() + ", source=" + getSourceName() + '}';
    }
}
