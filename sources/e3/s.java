package e3;

import Bj.H;
import androidx.datastore.core.DataStore;
import b3.i0;
import b3.j0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f16590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f16591b;
    public final DataStore c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f16592d;

    public s(CoroutineContext backgroundDispatcher, i0 timeProvider, DataStore sessionConfigsDataStore) {
        kotlin.jvm.internal.j.g(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.j.g(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.g(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f16590a = backgroundDispatcher;
        this.f16591b = timeProvider;
        this.c = sessionConfigsDataStore;
        this.f16592d = new AtomicReference();
        H.w(H.c(backgroundDispatcher), null, null, new o(this, null), 3);
    }

    public final j a() throws Throwable {
        AtomicReference atomicReference = this.f16592d;
        if (atomicReference.get() == null) {
            Object objX = H.x(kotlin.coroutines.g.f18170a, new p(this, null));
            while (!atomicReference.compareAndSet(null, objX) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        kotlin.jvm.internal.j.f(obj, "get(...)");
        return (j) obj;
    }

    public final boolean b() throws Throwable {
        Integer num;
        j jVarA = a();
        j jVarA2 = a();
        Long l6 = jVarA.e;
        if (l6 == null || (num = jVarA2.f16575d) == null) {
            return true;
        }
        return ((j0) this.f16591b).a().c - l6.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(e3.j r6, ij.AbstractC1609c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof e3.q
            if (r0 == 0) goto L13
            r0 = r7
            e3.q r0 = (e3.q) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            e3.q r0 = new e3.q
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f16587a
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            bj.AbstractC1039j.b(r7)     // Catch: java.io.IOException -> L27
            goto L58
        L27:
            r6 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            bj.AbstractC1039j.b(r7)
            androidx.datastore.core.DataStore r7 = r5.c     // Catch: java.io.IOException -> L27
            e3.r r2 = new e3.r     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.io.IOException -> L27
            r0.c = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = r7.updateData(r2, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L58
            return r1
        L45:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to update config values: "
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "FirebaseSessions"
            android.util.Log.w(r7, r6)
        L58:
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.s.c(e3.j, ij.c):java.lang.Object");
    }
}
