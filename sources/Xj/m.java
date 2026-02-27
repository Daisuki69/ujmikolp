package xj;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public interface m extends KProperty, Function1 {
    Object get(Object obj);

    Object getDelegate(Object obj);

    /* JADX INFO: renamed from: getGetter */
    l mo256getGetter();
}
