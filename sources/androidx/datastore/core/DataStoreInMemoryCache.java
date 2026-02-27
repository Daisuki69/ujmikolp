package androidx.datastore.core;

import Ej.InterfaceC0230h;
import Ej.O;
import Ej.W;
import Ej.h0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreInMemoryCache<T> {
    private final O cachedValue;

    public DataStoreInMemoryCache() {
        UnInitialized unInitialized = UnInitialized.INSTANCE;
        j.e(unInitialized, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = W.b(unInitialized);
    }

    private static /* synthetic */ void getCachedValue$annotations() {
    }

    public final State<T> getCurrentState() {
        return (State) ((h0) this.cachedValue).getValue();
    }

    public final InterfaceC0230h getFlow() {
        return this.cachedValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.datastore.core.State<T> tryUpdate(androidx.datastore.core.State<T> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.j.g(r7, r0)
            Ej.O r0 = r6.cachedValue
        L7:
            r1 = r0
            Ej.h0 r1 = (Ej.h0) r1
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            androidx.datastore.core.State r3 = (androidx.datastore.core.State) r3
            boolean r4 = r3 instanceof androidx.datastore.core.ReadException
            if (r4 == 0) goto L17
            r4 = 1
            goto L1d
        L17:
            androidx.datastore.core.UnInitialized r4 = androidx.datastore.core.UnInitialized.INSTANCE
            boolean r4 = kotlin.jvm.internal.j.b(r3, r4)
        L1d:
            if (r4 == 0) goto L20
            goto L2e
        L20:
            boolean r4 = r3 instanceof androidx.datastore.core.Data
            if (r4 == 0) goto L30
            int r4 = r7.getVersion()
            int r5 = r3.getVersion()
            if (r4 <= r5) goto L34
        L2e:
            r3 = r7
            goto L34
        L30:
            boolean r4 = r3 instanceof androidx.datastore.core.Final
            if (r4 == 0) goto L44
        L34:
            Gj.t r4 = Fj.AbstractC0249b.f1644b
            if (r2 != 0) goto L39
            r2 = r4
        L39:
            if (r3 != 0) goto L3c
            goto L3d
        L3c:
            r4 = r3
        L3d:
            boolean r1 = r1.i(r2, r4)
            if (r1 == 0) goto L7
            return r3
        L44:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreInMemoryCache.tryUpdate(androidx.datastore.core.State):androidx.datastore.core.State");
    }
}
