package Ej;

import ij.AbstractC1616j;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ej.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0225c extends C0226d {
    public final AbstractC1616j e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0225c(Function2 function2, CoroutineContext coroutineContext, int i, Dj.a aVar) {
        super(function2, coroutineContext, i, aVar);
        this.e = (AbstractC1616j) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Ej.C0226d, Fj.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(Dj.r r5, gj.InterfaceC1526a r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Ej.C0224b
            if (r0 == 0) goto L13
            r0 = r6
            Ej.b r0 = (Ej.C0224b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            Ej.b r0 = new Ej.b
            ij.c r6 = (ij.AbstractC1609c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f1437b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Dj.r r5 = r0.f1436a
            bj.AbstractC1039j.b(r6)
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            bj.AbstractC1039j.b(r6)
            r0.f1436a = r5
            r0.e = r3
            java.lang.Object r6 = super.c(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            Dj.q r5 = (Dj.q) r5
            Dj.e r5 = r5.f1200d
            boolean r5 = r5.x()
            if (r5 == 0) goto L4e
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        L4e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.C0225c.c(Dj.r, gj.a):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ij.j, kotlin.jvm.functions.Function2] */
    @Override // Ej.C0226d, Fj.f
    public final Fj.f d(CoroutineContext coroutineContext, int i, Dj.a aVar) {
        return new C0225c(this.e, coroutineContext, i, aVar);
    }
}
