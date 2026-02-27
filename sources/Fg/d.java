package Fg;

import Bj.H;
import Bj.o0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(d.class, "requestLogged");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1598g = AtomicIntegerFieldUpdater.newUpdater(d.class, "responseLogged");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f1599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f1600b = new StringBuilder();
    public final StringBuilder c = new StringBuilder();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f1601d = H.d(1);
    public final o0 e = H.d(1);
    private volatile /* synthetic */ int requestLogged = 0;
    private volatile /* synthetic */ int responseLogged = 0;

    public d(g gVar) {
        this.f1599a = gVar;
    }

    public final void a() {
        o0 o0Var = this.f1601d;
        if (f.compareAndSet(this, 0, 1)) {
            try {
                String string = C2576A.b0(this.f1600b).toString();
                if (string.length() > 0) {
                    this.f1599a.log(string);
                }
            } finally {
                o0Var.h0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ij.AbstractC1609c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Fg.a
            if (r0 == 0) goto L13
            r0 = r5
            Fg.a r0 = (Fg.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Fg.a r0 = new Fg.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1593b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Fg.d r0 = r0.f1592a
            bj.AbstractC1039j.b(r5)
            goto L4e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            bj.AbstractC1039j.b(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = Fg.d.f1598g
            r2 = 0
            boolean r5 = r5.compareAndSet(r4, r2, r3)
            if (r5 != 0) goto L40
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        L40:
            Bj.o0 r5 = r4.f1601d
            r0.f1592a = r4
            r0.e = r3
            java.lang.Object r5 = r5.z(r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            java.lang.StringBuilder r5 = r0.c
            java.lang.CharSequence r5 = zj.C2576A.b0(r5)
            java.lang.String r5 = r5.toString()
            int r1 = r5.length()
            if (r1 <= 0) goto L63
            Fg.g r0 = r0.f1599a
            r0.log(r5)
        L63:
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Fg.d.b(ij.c):java.lang.Object");
    }

    public final void c(String str) {
        String string = C2576A.b0(str).toString();
        StringBuilder sb2 = this.f1600b;
        sb2.append(string);
        sb2.append('\n');
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, ij.AbstractC1609c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Fg.b
            if (r0 == 0) goto L13
            r0 = r6
            Fg.b r0 = (Fg.b) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            Fg.b r0 = new Fg.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.f1595b
            Fg.d r0 = r0.f1594a
            bj.AbstractC1039j.b(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            bj.AbstractC1039j.b(r6)
            Bj.o0 r6 = r4.e
            r0.f1594a = r4
            r0.f1595b = r5
            r0.f = r3
            java.lang.Object r6 = r6.z(r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            java.lang.StringBuilder r6 = r0.c
            r6.append(r5)
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Fg.d.d(java.lang.String, ij.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, ij.AbstractC1609c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Fg.c
            if (r0 == 0) goto L13
            r0 = r6
            Fg.c r0 = (Fg.c) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            Fg.c r0 = new Fg.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.f1597b
            Fg.d r0 = r0.f1596a
            bj.AbstractC1039j.b(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            bj.AbstractC1039j.b(r6)
            Bj.o0 r6 = r4.f1601d
            r0.f1596a = r4
            r0.f1597b = r5
            r0.f = r3
            java.lang.Object r6 = r6.z(r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            Fg.g r6 = r0.f1599a
            java.lang.CharSequence r5 = zj.C2576A.b0(r5)
            java.lang.String r5 = r5.toString()
            r6.log(r5)
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Fg.d.e(java.lang.String, ij.c):java.lang.Object");
    }

    public final void f(String str) {
        String string = C2576A.b0(str).toString();
        StringBuilder sb2 = this.c;
        sb2.append(string);
        sb2.append('\n');
        this.e.h0();
    }
}
