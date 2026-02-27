package Gj;

import Bj.C;
import bj.C1030a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f2003a = new t("CLOSED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f2004b = new t("UNDEFINED", 0);
    public static final t c = new t("REUSABLE_CLAIMED", 0);

    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(We.s.f(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(r rVar, long j, Function2 function2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (rVar.c >= j && !rVar.d()) {
                return rVar;
            }
            Object obj = b.f2005a.get(rVar);
            t tVar = f2003a;
            if (obj == tVar) {
                return tVar;
            }
            r rVar2 = (r) ((b) obj);
            if (rVar2 == null) {
                rVar2 = (r) function2.invoke(Long.valueOf(rVar.c + 1), rVar);
                do {
                    atomicReferenceFieldUpdater = b.f2005a;
                    if (atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                        if (rVar.d()) {
                            rVar.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(rVar) == null);
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f2003a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(CoroutineContext coroutineContext, Throwable th2) {
        Throwable runtimeException;
        Iterator it = d.f2008a.iterator();
        while (it.hasNext()) {
            try {
                ((C) it.next()).handleException(coroutineContext, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    C1030a.a(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            C1030a.a(th2, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    public static final boolean e(Object obj) {
        return obj == f2003a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #1 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008f, B:23:0x006b, B:25:0x0079, B:30:0x0086, B:32:0x008c, B:38:0x009c, B:41:0x00a5, B:40:0x00a2, B:28:0x007f), top: B:52:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(gj.InterfaceC1526a r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof Gj.e
            if (r0 == 0) goto Lb0
            Gj.e r9 = (Gj.e) r9
            java.lang.Throwable r0 = bj.C1037h.a(r10)
            if (r0 != 0) goto Le
            r1 = r10
            goto L14
        Le:
            Bj.u r1 = new Bj.u
            r2 = 0
            r1.<init>(r0, r2)
        L14:
            Bj.A r0 = r9.f2009d
            gj.a r2 = r9.e
            kotlin.coroutines.CoroutineContext r3 = r2.getContext()
            boolean r3 = r0.isDispatchNeeded(r3)
            r4 = 1
            if (r3 == 0) goto L2f
            r9.f = r1
            r9.c = r4
            kotlin.coroutines.CoroutineContext r10 = r2.getContext()
            r0.dispatch(r10, r9)
            return
        L2f:
            Bj.e0 r0 = Bj.F0.a()
            long r5 = r0.f617a
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            r9.f = r1
            r9.c = r4
            r0.B(r9)
            goto Laa
        L46:
            r0.D(r4)
            kotlin.coroutines.CoroutineContext r1 = r2.getContext()     // Catch: java.lang.Throwable -> L69
            Bj.m0 r3 = Bj.C0154m0.f630a     // Catch: java.lang.Throwable -> L69
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L69
            Bj.n0 r1 = (Bj.InterfaceC0156n0) r1     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L6b
            boolean r3 = r1.isActive()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r10 = r1.g()     // Catch: java.lang.Throwable -> L69
            bj.i r10 = bj.AbstractC1039j.a(r10)     // Catch: java.lang.Throwable -> L69
            r9.resumeWith(r10)     // Catch: java.lang.Throwable -> L69
            goto L8f
        L69:
            r10 = move-exception
            goto La6
        L6b:
            java.lang.Object r1 = r9.f2010g     // Catch: java.lang.Throwable -> L69
            kotlin.coroutines.CoroutineContext r3 = r2.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = Gj.v.c(r3, r1)     // Catch: java.lang.Throwable -> L69
            Gj.t r5 = Gj.v.f2034a     // Catch: java.lang.Throwable -> L69
            if (r1 == r5) goto L7e
            Bj.K0 r5 = Bj.AbstractC0166y.c(r2, r3, r1)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r2.resumeWith(r10)     // Catch: java.lang.Throwable -> L99
            kotlin.Unit r10 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L99
            if (r5 == 0) goto L8c
            boolean r10 = r5.k0()     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L8f
        L8c:
            Gj.v.a(r3, r1)     // Catch: java.lang.Throwable -> L69
        L8f:
            boolean r10 = r0.F()     // Catch: java.lang.Throwable -> L69
            if (r10 != 0) goto L8f
        L95:
            r0.t(r4)
            goto Laa
        L99:
            r10 = move-exception
            if (r5 == 0) goto La2
            boolean r2 = r5.k0()     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto La5
        La2:
            Gj.v.a(r3, r1)     // Catch: java.lang.Throwable -> L69
        La5:
            throw r10     // Catch: java.lang.Throwable -> L69
        La6:
            r9.h(r10)     // Catch: java.lang.Throwable -> Lab
            goto L95
        Laa:
            return
        Lab:
            r9 = move-exception
            r0.t(r4)
            throw r9
        Lb0:
            r9.resumeWith(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Gj.a.g(gj.a, java.lang.Object):void");
    }

    public static final long h(long j, long j6, long j7, String str) {
        String property;
        int i = u.f2033a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lG = zj.y.g(property);
        if (lG == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lG.longValue();
        if (j6 <= jLongValue && jLongValue <= j7) {
            return jLongValue;
        }
        StringBuilder sb2 = new StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' should be in range ");
        sb2.append(j6);
        androidx.media3.datasource.cache.c.z(sb2, "..", j7, ", but is '");
        sb2.append(jLongValue);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static int i(int i, int i4, String str) {
        return (int) h(i, 1, (i4 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }
}
