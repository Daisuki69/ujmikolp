package androidx.datastore.core;

import Kj.a;
import Kj.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class MutexUtilsKt {
    public static final <R> R withTryLock(a aVar, Object obj, Function1<? super Boolean, ? extends R> block) {
        j.g(aVar, "<this>");
        j.g(block, "block");
        d dVar = (d) aVar;
        boolean zE = dVar.e(obj);
        try {
            return (R) block.invoke(Boolean.valueOf(zE));
        } finally {
            if (zE) {
                dVar.f(obj);
            }
        }
    }

    public static /* synthetic */ Object withTryLock$default(a aVar, Object obj, Function1 block, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        j.g(aVar, "<this>");
        j.g(block, "block");
        d dVar = (d) aVar;
        boolean zE = dVar.e(obj);
        try {
            return block.invoke(Boolean.valueOf(zE));
        } finally {
            if (zE) {
                dVar.f(obj);
            }
        }
    }
}
