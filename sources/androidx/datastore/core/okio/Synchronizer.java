package androidx.datastore.core.okio;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class Synchronizer {
    public final <T> T withLock(Function0<? extends T> block) {
        T t5;
        j.g(block, "block");
        synchronized (this) {
            t5 = (T) block.invoke();
        }
        return t5;
    }
}
