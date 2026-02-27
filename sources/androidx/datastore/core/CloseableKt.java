package androidx.datastore.core;

import bj.C1030a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class CloseableKt {
    public static final <T extends Closeable, R> R use(T t5, Function1<? super T, ? extends R> block) throws Throwable {
        j.g(t5, "<this>");
        j.g(block, "block");
        try {
            R r9 = (R) block.invoke(t5);
            try {
                t5.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (th == null) {
                return r9;
            }
            throw th;
        } catch (Throwable th3) {
            try {
                t5.close();
            } catch (Throwable th4) {
                C1030a.a(th3, th4);
            }
            throw th3;
        }
    }
}
