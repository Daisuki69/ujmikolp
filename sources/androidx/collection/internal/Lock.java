package androidx.collection.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class Lock {
    public final <T> T synchronizedImpl(Function0<? extends T> block) {
        T t5;
        j.g(block, "block");
        synchronized (this) {
            t5 = (T) block.invoke();
        }
        return t5;
    }
}
