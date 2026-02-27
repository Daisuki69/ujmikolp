package b3;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: b3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0894o extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0895p f8488b;
    public final /* synthetic */ W c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0894o(C0895p c0895p, W w6, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f8488b = c0895p;
        this.c = w6;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C0894o(this.f8488b, this.c, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0894o) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r7.b(r6) == r0) goto L25;
     */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r6.f8487a
            r2 = 1
            java.lang.String r3 = "FirebaseSessions"
            r4 = 2
            b3.p r5 = r6.f8488b
            if (r1 == 0) goto L20
            if (r1 == r2) goto L1c
            if (r1 != r4) goto L14
            bj.AbstractC1039j.b(r7)
            goto L67
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            bj.AbstractC1039j.b(r7)
            goto L2e
        L20:
            bj.AbstractC1039j.b(r7)
            c3.c r7 = c3.C1071c.f9280a
            r6.f8487a = r2
            java.lang.Object r7 = r7.b(r6)
            if (r7 != r0) goto L2e
            goto L66
        L2e:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r1 = r7 instanceof java.util.Collection
            if (r1 == 0) goto L44
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L44
            goto La7
        L44:
            java.util.Iterator r7 = r7.iterator()
        L48:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La7
            java.lang.Object r1 = r7.next()
            h2.i r1 = (h2.i) r1
            h2.t r1 = r1.f16868a
            boolean r1 = r1.a()
            if (r1 == 0) goto L48
            e3.m r7 = r5.f8490b
            r6.f8487a = r4
            java.lang.Object r7 = r7.b(r6)
            if (r7 != r0) goto L67
        L66:
            return r0
        L67:
            e3.m r7 = r5.f8490b
            e3.t r0 = r7.f16580a
            java.lang.Boolean r0 = r0.a()
            if (r0 == 0) goto L76
            boolean r2 = r0.booleanValue()
            goto L82
        L76:
            e3.t r7 = r7.f16581b
            java.lang.Boolean r7 = r7.a()
            if (r7 == 0) goto L82
            boolean r2 = r7.booleanValue()
        L82:
            if (r2 != 0) goto L90
            java.lang.String r7 = "Sessions SDK disabled. Not listening to lifecycle events."
            int r7 = android.util.Log.d(r3, r7)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            goto Lb2
        L90:
            b3.n r7 = new b3.n
            b3.W r0 = r6.c
            r7.<init>(r0)
            U1.g r0 = r5.f8489a
            r0.a()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.j
            r0.add(r7)
            kotlin.Unit r7 = kotlin.Unit.f18162a
            goto Lb2
        La7:
            java.lang.String r7 = "No Sessions subscribers. Not listening to lifecycle events."
            int r7 = android.util.Log.d(r3, r7)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
        Lb2:
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0894o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
