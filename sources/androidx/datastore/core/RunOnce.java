package androidx.datastore.core;

import Bj.H;
import Bj.InterfaceC0159q;
import Bj.r;
import Kj.a;
import Kj.e;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public abstract class RunOnce {
    private final a runMutex = e.a(1, false);
    private final InterfaceC0159q didRun = H.b();

    /* JADX INFO: renamed from: androidx.datastore.core.RunOnce$runIfNeeded$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
    public static final class AnonymousClass1 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RunOnce.this.runIfNeeded(this);
        }
    }

    public final Object awaitComplete(InterfaceC1526a<? super Unit> interfaceC1526a) throws Throwable {
        Object objA = ((r) this.didRun).A(interfaceC1526a);
        return objA == EnumC1578a.f17050a ? objA : Unit.f18162a;
    }

    public abstract Object doRun(InterfaceC1526a<? super Unit> interfaceC1526a);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runIfNeeded(gj.InterfaceC1526a<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.RunOnce.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = (androidx.datastore.core.RunOnce.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = new androidx.datastore.core.RunOnce$runIfNeeded$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r1 = r0.L$1
            Kj.a r1 = (Kj.a) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.RunOnce r0 = (androidx.datastore.core.RunOnce) r0
            bj.AbstractC1039j.b(r7)     // Catch: java.lang.Throwable -> L33
            goto L92
        L33:
            r7 = move-exception
            goto La1
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3e:
            java.lang.Object r2 = r0.L$1
            Kj.a r2 = (Kj.a) r2
            java.lang.Object r4 = r0.L$0
            androidx.datastore.core.RunOnce r4 = (androidx.datastore.core.RunOnce) r4
            bj.AbstractC1039j.b(r7)
            r7 = r2
            goto L6d
        L4b:
            bj.AbstractC1039j.b(r7)
            Bj.q r7 = r6.didRun
            Bj.u0 r7 = (Bj.u0) r7
            boolean r7 = r7.R()
            if (r7 == 0) goto L5b
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        L5b:
            Kj.a r7 = r6.runMutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            Kj.d r7 = (Kj.d) r7
            java.lang.Object r2 = r7.d(r0)
            if (r2 != r1) goto L6c
            goto L8f
        L6c:
            r4 = r6
        L6d:
            Bj.q r2 = r4.didRun     // Catch: java.lang.Throwable -> L7f
            Bj.u0 r2 = (Bj.u0) r2     // Catch: java.lang.Throwable -> L7f
            boolean r2 = r2.R()     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L83
            kotlin.Unit r0 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L7f
            Kj.d r7 = (Kj.d) r7
            r7.f(r5)
            return r0
        L7f:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto La1
        L83:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L7f
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L7f
            r0.label = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r4.doRun(r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 != r1) goto L90
        L8f:
            return r1
        L90:
            r1 = r7
            r0 = r4
        L92:
            Bj.q r7 = r0.didRun     // Catch: java.lang.Throwable -> L33
            kotlin.Unit r0 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L33
            Bj.r r7 = (Bj.r) r7     // Catch: java.lang.Throwable -> L33
            r7.T(r0)     // Catch: java.lang.Throwable -> L33
            Kj.d r1 = (Kj.d) r1
            r1.f(r5)
            return r0
        La1:
            Kj.d r1 = (Kj.d) r1
            r1.f(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.RunOnce.runIfNeeded(gj.a):java.lang.Object");
    }
}
