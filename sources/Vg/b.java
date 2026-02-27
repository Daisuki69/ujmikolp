package Vg;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6105b;
    public final CoroutineContext c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6106d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object context, List interceptors, Object subject, CoroutineContext coroutineContext) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        kotlin.jvm.internal.j.g(interceptors, "interceptors");
        kotlin.jvm.internal.j.g(subject, "subject");
        this.f6105b = interceptors;
        this.c = coroutineContext;
        this.f6106d = subject;
    }

    @Override // Vg.e
    public final Object a(Object obj, AbstractC1609c abstractC1609c) {
        this.e = 0;
        kotlin.jvm.internal.j.g(obj, "<set-?>");
        this.f6106d = obj;
        return c(abstractC1609c);
    }

    @Override // Vg.e
    public final Object b() {
        return this.f6106d;
    }

    @Override // Vg.e
    public final Object c(InterfaceC1526a interfaceC1526a) {
        int i = this.e;
        if (i < 0) {
            return this.f6106d;
        }
        if (i < this.f6105b.size()) {
            return e(interfaceC1526a);
        }
        this.e = -1;
        return this.f6106d;
    }

    @Override // Vg.e
    public final Object d(InterfaceC1526a interfaceC1526a, Object obj) {
        kotlin.jvm.internal.j.g(obj, "<set-?>");
        this.f6106d = obj;
        return c(interfaceC1526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gj.InterfaceC1526a r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof Vg.a
            if (r0 == 0) goto L13
            r0 = r8
            Vg.a r0 = (Vg.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Vg.a r0 = new Vg.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f6104b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Vg.b r2 = r0.f6103a
            bj.AbstractC1039j.b(r8)
            goto L35
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            bj.AbstractC1039j.b(r8)
            r2 = r7
        L35:
            int r8 = r2.e
            r4 = -1
            if (r8 != r4) goto L3b
            goto L45
        L3b:
            java.util.List r5 = r2.f6105b
            int r6 = r5.size()
            if (r8 < r6) goto L48
            r2.e = r4
        L45:
            java.lang.Object r8 = r2.f6106d
            return r8
        L48:
            java.lang.Object r4 = r5.get(r8)
            qj.n r4 = (qj.n) r4
            int r8 = r8 + 1
            r2.e = r8
            java.lang.Object r8 = r2.f6106d
            r0.f6103a = r2
            r0.e = r3
            java.lang.Object r8 = r4.invoke(r2, r8, r0)
            if (r8 != r1) goto L35
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Vg.b.e(gj.a):java.lang.Object");
    }

    @Override // Bj.E
    public final CoroutineContext getCoroutineContext() {
        return this.c;
    }
}
