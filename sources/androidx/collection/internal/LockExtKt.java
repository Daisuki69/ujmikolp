package androidx.collection.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class LockExtKt {
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <T> T m72synchronized(Lock lock, Function0<? extends T> block) {
        T t5;
        j.g(lock, "<this>");
        j.g(block, "block");
        synchronized (lock) {
            t5 = (T) block.invoke();
        }
        return t5;
    }
}
