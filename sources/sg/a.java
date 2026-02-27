package Sg;

import cj.M;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
import z2.d;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private volatile /* synthetic */ Object current = M.e();

    static {
        AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "current");
    }

    public final Object a(d key) {
        j.g(key, "key");
        return ((Map) this.current).get(key);
    }
}
