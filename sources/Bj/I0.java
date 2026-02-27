package Bj;

import defpackage.AbstractC1414e;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class I0 {
    public static final Object a(G0 g02, Function2 function2) throws Throwable {
        Object c0162u;
        Object objU;
        H.s(g02, true, new X(O.d(g02.f2028d.getContext()).r(g02.e, g02, g02.c), 0));
        try {
            if (AbstractC1414e.u(function2)) {
                kotlin.jvm.internal.D.d(2, function2);
                c0162u = function2.invoke(g02, g02);
            } else {
                c0162u = hj.h.c(function2, g02, g02);
            }
        } catch (Throwable th2) {
            c0162u = new C0162u(th2, false);
        }
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        if (c0162u == enumC1578a || (objU = g02.U(c0162u)) == H.e) {
            return enumC1578a;
        }
        if (objU instanceof C0162u) {
            Throwable th3 = ((C0162u) objU).f642a;
            if (!(th3 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th3).f18212a != g02) {
                throw th3;
            }
            if (c0162u instanceof C0162u) {
                throw ((C0162u) c0162u).f642a;
            }
        } else {
            c0162u = H.B(objU);
        }
        return c0162u;
    }

    public static final Object b(long j, Function2 function2, AbstractC1609c abstractC1609c) throws Throwable {
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object objA = a(new G0(j, abstractC1609c), function2);
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r6, kotlin.jvm.functions.Function2 r8, ij.AbstractC1609c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof Bj.H0
            if (r0 == 0) goto L13
            r0 = r9
            Bj.H0 r0 = (Bj.H0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Bj.H0 r0 = new Bj.H0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.y r6 = r0.f594b
            bj.AbstractC1039j.b(r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L29
            return r9
        L29:
            r7 = move-exception
            goto L59
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            bj.AbstractC1039j.b(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3d
            goto L5f
        L3d:
            kotlin.jvm.internal.y r9 = new kotlin.jvm.internal.y
            r9.<init>()
            r0.f593a = r8     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L57
            r0.f594b = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L57
            r0.e = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L57
            Bj.G0 r2 = new Bj.G0     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L57
            r2.<init>(r6, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L57
            r9.f18195a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L57
            java.lang.Object r6 = a(r2, r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L57
            if (r6 != r1) goto L56
            return r1
        L56:
            return r6
        L57:
            r7 = move-exception
            r6 = r9
        L59:
            Bj.G0 r8 = r7.f18212a
            java.lang.Object r6 = r6.f18195a
            if (r8 != r6) goto L61
        L5f:
            r6 = 0
            return r6
        L61:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Bj.I0.c(long, kotlin.jvm.functions.Function2, ij.c):java.lang.Object");
    }
}
