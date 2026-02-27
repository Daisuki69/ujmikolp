package Ej;

import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;

/* JADX INFO: renamed from: Ej.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0238p implements InterfaceC0230h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 f1467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qj.n f1468b;

    public C0238p(DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$1, qj.n nVar) {
        this.f1467a = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
        this.f1468b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Ej.InterfaceC0230h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(Ej.InterfaceC0231i r9, gj.InterfaceC1526a r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof Ej.C0237o
            if (r0 == 0) goto L13
            r0 = r10
            Ej.o r0 = (Ej.C0237o) r0
            int r1 = r0.f1466b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1466b = r1
            goto L18
        L13:
            Ej.o r0 = new Ej.o
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f1465a
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f1466b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.e
            Fj.w r9 = (Fj.w) r9
            bj.AbstractC1039j.b(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.e
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            bj.AbstractC1039j.b(r10)
            goto La0
        L44:
            Ej.i r9 = r0.f
            java.lang.Object r2 = r0.e
            Ej.p r2 = (Ej.C0238p) r2
            bj.AbstractC1039j.b(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            bj.AbstractC1039j.b(r10)
            androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 r10 = r8.f1467a     // Catch: java.lang.Throwable -> L8a
            r0.e = r8     // Catch: java.lang.Throwable -> L8a
            r0.f = r9     // Catch: java.lang.Throwable -> L8a
            r0.f1466b = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r1) goto L62
            goto L9f
        L62:
            r2 = r8
        L63:
            Fj.w r10 = new Fj.w
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            r10.<init>(r9, r4)
            qj.n r9 = r2.f1468b     // Catch: java.lang.Throwable -> L82
            r0.e = r10     // Catch: java.lang.Throwable -> L82
            r0.f = r6     // Catch: java.lang.Throwable -> L82
            r0.f1466b = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r1) goto L7b
            goto L9f
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            kotlin.Unit r9 = kotlin.Unit.f18162a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            Ej.j0 r10 = new Ej.j0
            r10.<init>(r9)
            qj.n r2 = r2.f1468b
            r0.e = r9
            r0.f = r6
            r0.f1466b = r4
            java.lang.Object r10 = Ej.W.c(r10, r2, r9, r0)
            if (r10 != r1) goto La0
        L9f:
            return r1
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.C0238p.collect(Ej.i, gj.a):java.lang.Object");
    }
}
