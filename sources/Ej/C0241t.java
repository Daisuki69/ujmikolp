package Ej;

import ij.AbstractC1616j;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ej.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0241t implements InterfaceC0230h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0230h f1477b;
    public final /* synthetic */ AbstractC1616j c;

    /* JADX WARN: Multi-variable type inference failed */
    public C0241t(InterfaceC0230h interfaceC0230h, Function2 function2, int i) {
        this.f1476a = i;
        switch (i) {
            case 2:
                this.f1477b = interfaceC0230h;
                this.c = (AbstractC1616j) function2;
                break;
            default:
                this.f1477b = interfaceC0230h;
                this.c = (AbstractC1616j) function2;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Type inference failed for: r1v5, types: [ij.j, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ij.j, qj.n] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ij.j, kotlin.jvm.functions.Function2] */
    @Override // Ej.InterfaceC0230h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(Ej.InterfaceC0231i r6, gj.InterfaceC1526a r7) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.f1476a
            switch(r0) {
                case 0: goto L34;
                case 1: goto L1a;
                default: goto L5;
            }
        L5:
            Ej.w r0 = new Ej.w
            ij.j r1 = r5.c
            r0.<init>(r6, r1)
            Ej.h r6 = r5.f1477b
            java.lang.Object r6 = r6.collect(r0, r7)
            hj.a r7 = hj.EnumC1578a.f17050a
            if (r6 != r7) goto L17
            goto L19
        L17:
            kotlin.Unit r6 = kotlin.Unit.f18162a
        L19:
            return r6
        L1a:
            kotlin.jvm.internal.u r0 = new kotlin.jvm.internal.u
            r0.<init>()
            Ej.f r1 = new Ej.f
            ij.j r2 = r5.c
            r1.<init>(r0, r6, r2)
            Ej.h r6 = r5.f1477b
            java.lang.Object r6 = r6.collect(r1, r7)
            hj.a r7 = hj.EnumC1578a.f17050a
            if (r6 != r7) goto L31
            goto L33
        L31:
            kotlin.Unit r6 = kotlin.Unit.f18162a
        L33:
            return r6
        L34:
            boolean r0 = r7 instanceof Ej.C0240s
            if (r0 == 0) goto L47
            r0 = r7
            Ej.s r0 = (Ej.C0240s) r0
            int r1 = r0.f1475b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L47
            int r1 = r1 - r2
            r0.f1475b = r1
            goto L4c
        L47:
            Ej.s r0 = new Ej.s
            r0.<init>(r5, r7)
        L4c:
            java.lang.Object r7 = r0.f1474a
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f1475b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L6e
            if (r2 == r4) goto L66
            if (r2 != r3) goto L5e
            bj.AbstractC1039j.b(r7)
            goto L95
        L5e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L66:
            Ej.i r6 = r0.f
            Ej.t r2 = r0.e
            bj.AbstractC1039j.b(r7)
            goto L81
        L6e:
            bj.AbstractC1039j.b(r7)
            r0.e = r5
            r0.f = r6
            r0.f1475b = r4
            Ej.h r7 = r5.f1477b
            java.io.Serializable r7 = Ej.W.g(r7, r6, r0)
            if (r7 != r1) goto L80
            goto L97
        L80:
            r2 = r5
        L81:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L95
            ij.j r2 = r2.c
            r4 = 0
            r0.e = r4
            r0.f = r4
            r0.f1475b = r3
            java.lang.Object r6 = r2.invoke(r6, r7, r0)
            if (r6 != r1) goto L95
            goto L97
        L95:
            kotlin.Unit r1 = kotlin.Unit.f18162a
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.C0241t.collect(Ej.i, gj.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0241t(InterfaceC0230h interfaceC0230h, qj.n nVar) {
        this.f1476a = 0;
        this.f1477b = interfaceC0230h;
        this.c = (AbstractC1616j) nVar;
    }
}
