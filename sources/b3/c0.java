package b3;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f8440b;
    public final /* synthetic */ C0868H c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, C0868H c0868h, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f8440b = e0Var;
        this.c = c0868h;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new c0(this.f8440b, this.c, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r8.updateData(r1, r7) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (b3.e0.a(r5, r1.f8393a, r8, r7) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        return r0;
     */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r7.f8439a
            r2 = 0
            r3 = 2
            r4 = 1
            b3.e0 r5 = r7.f8440b
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            bj.AbstractC1039j.b(r8)
            goto L82
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            bj.AbstractC1039j.b(r8)     // Catch: java.lang.Exception -> L1f
            goto L82
        L1f:
            r8 = move-exception
            goto L34
        L21:
            bj.AbstractC1039j.b(r8)
            androidx.datastore.core.DataStore r8 = r5.e     // Catch: java.lang.Exception -> L1f
            b3.b0 r1 = new b3.b0     // Catch: java.lang.Exception -> L1f
            r1.<init>(r5, r2)     // Catch: java.lang.Exception -> L1f
            r7.f8439a = r4     // Catch: java.lang.Exception -> L1f
            java.lang.Object r8 = r8.updateData(r1, r7)     // Catch: java.lang.Exception -> L1f
            if (r8 != r0) goto L82
            goto L81
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "App foregrounded, failed to update data. Message: "
            r1.<init>(r4)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r1 = "FirebaseSessions"
            android.util.Log.d(r1, r8)
            b3.H r8 = r7.c
            boolean r1 = r5.d(r8)
            if (r1 == 0) goto L82
            b3.U r1 = r5.f8451b
            b3.L r4 = r8.f8389a
            b3.L r1 = r1.a(r4)
            r4 = 4
            b3.H r8 = b3.C0868H.a(r8, r1, r2, r2, r4)
            r5.h = r8
            b3.O r8 = r5.c
            b3.S r8 = (b3.C0878S) r8
            kotlin.coroutines.CoroutineContext r4 = r8.e
            Gj.c r4 = Bj.H.c(r4)
            b3.P r6 = new b3.P
            r6.<init>(r8, r1, r2)
            r8 = 3
            Bj.H.w(r4, r2, r2, r6, r8)
            b3.Y r8 = b3.Y.f8423b
            r7.f8439a = r3
            java.lang.String r1 = r1.f8393a
            java.lang.Object r8 = b3.e0.a(r5, r1, r8, r7)
            if (r8 != r0) goto L82
        L81:
            return r0
        L82:
            kotlin.Unit r8 = kotlin.Unit.f18162a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
