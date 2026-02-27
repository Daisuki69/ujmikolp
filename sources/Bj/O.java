package Bj;

import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.time.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class O {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(ij.AbstractC1609c r4) {
        /*
            boolean r0 = r4 instanceof Bj.N
            if (r0 == 0) goto L13
            r0 = r4
            Bj.N r0 = (Bj.N) r0
            int r1 = r0.f599b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f599b = r1
            goto L18
        L13:
            Bj.N r0 = new Bj.N
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f598a
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f599b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            bj.AbstractC1039j.b(r4)
            goto L47
        L2f:
            bj.AbstractC1039j.b(r4)
            r0.f599b = r3
            Bj.l r4 = new Bj.l
            gj.a r0 = hj.h.b(r0)
            r4.<init>(r3, r0)
            r4.r()
            java.lang.Object r4 = r4.q()
            if (r4 != r1) goto L47
            return
        L47:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Bj.O.a(ij.c):void");
    }

    public static final Object b(long j, InterfaceC1526a interfaceC1526a) {
        if (j <= 0) {
            return Unit.f18162a;
        }
        C0151l c0151l = new C0151l(1, hj.h.b(interfaceC1526a));
        c0151l.r();
        if (j < Long.MAX_VALUE) {
            d(c0151l.e).m(j, c0151l);
        }
        Object objQ = c0151l.q();
        return objQ == EnumC1578a.f17050a ? objQ : Unit.f18162a;
    }

    public static final Object c(long j, AbstractC1616j abstractC1616j) {
        a.C0097a c0097a = kotlin.time.a.f18208b;
        long jD = 0;
        boolean z4 = j > 0;
        if (z4) {
            jD = kotlin.time.a.d(kotlin.time.a.f(j, kotlin.time.b.f(999999L, Aj.b.f330b)));
        } else if (z4) {
            throw new NoWhenBranchMatchedException();
        }
        Object objB = b(jD, abstractC1616j);
        return objB == EnumC1578a.f17050a ? objB : Unit.f18162a;
    }

    public static final M d(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.d.f18169N);
        M m = element instanceof M ? (M) element : null;
        return m == null ? J.f595a : m;
    }
}
