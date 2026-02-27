package Ej;

import Bj.C0154m0;
import Fj.AbstractC0249b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Gj.t f1422a = new Gj.t("NO_VALUE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Gj.t f1423b = new Gj.t("NONE", 0);
    public static final Gj.t c = new Gj.t("PENDING", 0);

    public static final V a(int i, int i4, Dj.a aVar) {
        if (i < 0) {
            throw new IllegalArgumentException(We.s.f(i, "replay cannot be negative, but was ").toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(We.s.f(i4, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i <= 0 && i4 <= 0 && aVar != Dj.a.f1163a) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i6 = i4 + i;
        if (i6 < 0) {
            i6 = Integer.MAX_VALUE;
        }
        return new V(i, i6, aVar);
    }

    public static final h0 b(Object obj) {
        if (obj == null) {
            obj = AbstractC0249b.f1644b;
        }
        return new h0(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(Ej.j0 r4, qj.n r5, java.lang.Throwable r6, ij.AbstractC1609c r7) {
        /*
            boolean r0 = r7 instanceof Ej.C0236n
            if (r0 == 0) goto L13
            r0 = r7
            Ej.n r0 = (Ej.C0236n) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Ej.n r0 = new Ej.n
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1464b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f1463a
            bj.AbstractC1039j.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            bj.AbstractC1039j.b(r7)
            r0.f1463a = r6     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlin.Unit r4 = kotlin.Unit.f18162a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            bj.C1030a.a(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.W.c(Ej.j0, qj.n, java.lang.Throwable, ij.c):java.lang.Object");
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static InterfaceC0230h e(InterfaceC0230h interfaceC0230h, int i) {
        Dj.a aVar = Dj.a.f1163a;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(We.s.f(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1) {
            aVar = Dj.a.f1164b;
            i = 0;
        }
        int i4 = i;
        Dj.a aVar2 = aVar;
        return interfaceC0230h instanceof Fj.t ? AbstractC0249b.a((Fj.t) interfaceC0230h, null, i4, aVar2, 1) : new Fj.i(interfaceC0230h, null, i4, aVar2, 2);
    }

    public static final C0225c f(Function2 function2) {
        return new C0225c(function2, kotlin.coroutines.g.f18170a, -2, Dj.a.f1163a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable g(Ej.InterfaceC0230h r5, Ej.InterfaceC0231i r6, ij.AbstractC1609c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof Ej.C0242u
            if (r0 == 0) goto L13
            r0 = r7
            Ej.u r0 = (Ej.C0242u) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Ej.u r0 = new Ej.u
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1479b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.y r5 = r0.f1478a
            bj.AbstractC1039j.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r6 = move-exception
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            bj.AbstractC1039j.b(r7)
            kotlin.jvm.internal.y r7 = new kotlin.jvm.internal.y
            r7.<init>()
            Ej.w r2 = new Ej.w     // Catch: java.lang.Throwable -> L4e
            r4 = 0
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L4e
            r0.f1478a = r7     // Catch: java.lang.Throwable -> L4e
            r0.c = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = 0
            return r5
        L4e:
            r6 = move-exception
            r5 = r7
        L50:
            java.lang.Object r5 = r5.f18195a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L5c
            boolean r7 = r5.equals(r6)
            if (r7 != 0) goto L7e
        L5c:
            kotlin.coroutines.CoroutineContext r7 = r0.getContext()
            Bj.m0 r0 = Bj.C0154m0.f630a
            kotlin.coroutines.CoroutineContext$Element r7 = r7.get(r0)
            Bj.n0 r7 = (Bj.InterfaceC0156n0) r7
            if (r7 == 0) goto L7f
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L71
            goto L7f
        L71:
            java.util.concurrent.CancellationException r7 = r7.g()
            if (r7 == 0) goto L7f
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L7e
            goto L7f
        L7e:
            throw r6
        L7f:
            if (r5 != 0) goto L82
            return r6
        L82:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L8a
            bj.C1030a.a(r5, r6)
            throw r5
        L8a:
            bj.C1030a.a(r6, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.W.g(Ej.h, Ej.i, ij.c):java.io.Serializable");
    }

    public static final InterfaceC0230h h(InterfaceC0230h interfaceC0230h) {
        if (interfaceC0230h instanceof f0) {
            return interfaceC0230h;
        }
        if (!(interfaceC0230h instanceof C0229g)) {
            return new C0229g(interfaceC0230h);
        }
        ((C0229g) interfaceC0230h).getClass();
        return interfaceC0230h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [Dj.i, Dj.t] */
    /* JADX WARN: Type inference failed for: r8v1, types: [Dj.t] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2, types: [Dj.t] */
    /* JADX WARN: Type inference failed for: r8v3, types: [Dj.t] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(Ej.InterfaceC0231i r7, Dj.i r8, boolean r9, ij.AbstractC1609c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof Ej.C0234l
            if (r0 == 0) goto L13
            r0 = r10
            Ej.l r0 = (Ej.C0234l) r0
            int r1 = r0.f1460g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1460g = r1
            goto L18
        L13:
            Ej.l r0 = new Ej.l
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f1460g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            boolean r9 = r0.e
            Dj.b r7 = r0.c
            Dj.t r8 = r0.f1459b
            Ej.i r2 = r0.f1458a
            bj.AbstractC1039j.b(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L56
        L35:
            r7 = move-exception
            goto L90
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.e
            Dj.b r7 = r0.c
            Dj.t r8 = r0.f1459b
            Ej.i r2 = r0.f1458a
            bj.AbstractC1039j.b(r10)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L4b:
            bj.AbstractC1039j.b(r10)
            boolean r10 = r7 instanceof Ej.j0
            if (r10 != 0) goto La7
            Dj.b r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L56:
            r0.f1458a = r7     // Catch: java.lang.Throwable -> L35
            r0.f1459b = r8     // Catch: java.lang.Throwable -> L35
            r0.c = r10     // Catch: java.lang.Throwable -> L35
            r0.e = r9     // Catch: java.lang.Throwable -> L35
            r0.f1460g = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L67
            goto L87
        L67:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f1458a = r2     // Catch: java.lang.Throwable -> L35
            r0.f1459b = r8     // Catch: java.lang.Throwable -> L35
            r0.c = r7     // Catch: java.lang.Throwable -> L35
            r0.e = r9     // Catch: java.lang.Throwable -> L35
            r0.f1460g = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
        L87:
            return r1
        L88:
            if (r9 == 0) goto L8d
            r8.b(r3)
        L8d:
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto La6
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L9b:
            if (r3 != 0) goto La3
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r3 = Bj.H.a(r9, r7)
        La3:
            r8.b(r3)
        La6:
            throw r10
        La7:
            Ej.j0 r7 = (Ej.j0) r7
            java.lang.Throwable r7 = r7.f1455a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.W.i(Ej.i, Dj.i, boolean, ij.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(Ej.InterfaceC0230h r6, gj.InterfaceC1526a r7) {
        /*
            boolean r0 = r7 instanceof Ej.E
            if (r0 == 0) goto L13
            r0 = r7
            Ej.E r0 = (Ej.E) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Ej.E r0 = new Ej.E
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            Gj.t r3 = Fj.AbstractC0249b.f1644b
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            Ej.C r6 = r0.f1395b
            kotlin.jvm.internal.y r0 = r0.f1394a
            bj.AbstractC1039j.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L5e
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            bj.AbstractC1039j.b(r7)
            kotlin.jvm.internal.y r7 = new kotlin.jvm.internal.y
            r7.<init>()
            r7.f18195a = r3
            Ej.C r2 = new Ej.C
            r5 = 0
            r2.<init>(r7, r5)
            r0.f1394a = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.f1395b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.e = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            java.lang.Object r6 = r6.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            if (r6 != r1) goto L54
            return r1
        L54:
            r0 = r7
            goto L5e
        L56:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r2
        L5a:
            Ej.i r1 = r7.f18213a
            if (r1 != r6) goto L6b
        L5e:
            java.lang.Object r6 = r0.f18195a
            if (r6 == r3) goto L63
            return r6
        L63:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.W.j(Ej.h, gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(Fj.B r6, Ej.J r7, ij.AbstractC1609c r8) {
        /*
            boolean r0 = r8 instanceof Ej.F
            if (r0 == 0) goto L13
            r0 = r8
            Ej.F r0 = (Ej.F) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            Ej.F r0 = new Ej.F
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.e
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f
            Gj.t r3 = Fj.AbstractC0249b.f1644b
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            Ej.w r6 = r0.c
            kotlin.jvm.internal.y r7 = r0.f1397b
            kotlin.jvm.functions.Function2 r0 = r0.f1396a
            bj.AbstractC1039j.b(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2f
            goto L60
        L2f:
            r8 = move-exception
            goto L5c
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            bj.AbstractC1039j.b(r8)
            kotlin.jvm.internal.y r8 = new kotlin.jvm.internal.y
            r8.<init>()
            r8.f18195a = r3
            Ej.w r2 = new Ej.w
            r5 = 2
            r2.<init>(r7, r8, r5)
            r0.f1396a = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            r0.f1397b = r8     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            r0.c = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            r0.f = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            r6.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            return r1
        L55:
            r0 = r7
            r7 = r8
            r8 = r6
            r6 = r2
            goto L5c
        L5a:
            r6 = move-exception
            goto L55
        L5c:
            Ej.i r1 = r8.f18213a
            if (r1 != r6) goto L79
        L60:
            java.lang.Object r6 = r7.f18195a
            if (r6 == r3) goto L65
            return r6
        L65:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Expected at least one element matching the predicate "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L79:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.W.k(Fj.B, Ej.J, ij.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(Ej.InterfaceC0230h r5, gj.InterfaceC1526a r6) {
        /*
            boolean r0 = r6 instanceof Ej.H
            if (r0 == 0) goto L13
            r0 = r6
            Ej.H r0 = (Ej.H) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Ej.H r0 = new Ej.H
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Ej.C r5 = r0.f1401b
            kotlin.jvm.internal.y r0 = r0.f1400a
            bj.AbstractC1039j.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5a
        L2b:
            r6 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            bj.AbstractC1039j.b(r6)
            kotlin.jvm.internal.y r6 = new kotlin.jvm.internal.y
            r6.<init>()
            Ej.C r2 = new Ej.C
            r4 = 1
            r2.<init>(r6, r4)
            r0.f1400a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.f1401b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.e = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            if (r5 != r1) goto L50
            return r1
        L50:
            r0 = r6
            goto L5a
        L52:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L56:
            Ej.i r1 = r6.f18213a
            if (r1 != r5) goto L5d
        L5a:
            java.lang.Object r5 = r0.f18195a
            return r5
        L5d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.W.l(Ej.h, gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(Pg.b r5, Pg.d r6, ij.AbstractC1609c r7) {
        /*
            boolean r0 = r7 instanceof Ej.I
            if (r0 == 0) goto L13
            r0 = r7
            Ej.I r0 = (Ej.I) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Ej.I r0 = new Ej.I
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Ej.w r5 = r0.f1403b
            kotlin.jvm.internal.y r6 = r0.f1402a
            bj.AbstractC1039j.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5a
        L2b:
            r7 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            bj.AbstractC1039j.b(r7)
            kotlin.jvm.internal.y r7 = new kotlin.jvm.internal.y
            r7.<init>()
            Ej.w r2 = new Ej.w
            r4 = 3
            r2.<init>(r6, r7, r4)
            r0.f1402a = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.f1403b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.e = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            if (r5 != r1) goto L50
            return r1
        L50:
            r6 = r7
            goto L5a
        L52:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L56:
            Ej.i r0 = r7.f18213a
            if (r0 != r5) goto L5d
        L5a:
            java.lang.Object r5 = r6.f18195a
            return r5
        L5d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.W.m(Pg.b, Pg.d, ij.c):java.lang.Object");
    }

    public static final InterfaceC0230h n(InterfaceC0230h interfaceC0230h, Bj.A a8) {
        if (a8.get(C0154m0.f630a) == null) {
            return a8.equals(kotlin.coroutines.g.f18170a) ? interfaceC0230h : interfaceC0230h instanceof Fj.t ? AbstractC0249b.a((Fj.t) interfaceC0230h, a8, 0, null, 6) : new Fj.i(interfaceC0230h, a8, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + a8).toString());
    }

    public static final InterfaceC0230h o(S s9, CoroutineContext coroutineContext, int i, Dj.a aVar) {
        return ((i == 0 || i == -3) && aVar == Dj.a.f1163a) ? s9 : new Fj.i(i, aVar, s9, coroutineContext);
    }

    public static P p(C0225c c0225c, Bj.E e, e0 e0Var) {
        Z z4;
        Dj.i.f1191z.getClass();
        int i = Dj.h.f1190b;
        if (i <= 0) {
            i = 0;
        }
        InterfaceC0230h interfaceC0230hE = c0225c.e();
        if (interfaceC0230hE != null) {
            Dj.a aVar = c0225c.c;
            int i4 = c0225c.f1650b;
            if (i4 != -3 && i4 != -2 && i4 != 0) {
                i = i4;
            } else if (aVar != Dj.a.f1163a) {
                i = 1;
            } else if (i4 == 0) {
                i = 0;
            }
            z4 = new Z(i, aVar, interfaceC0230hE, c0225c.f1649a);
        } else {
            z4 = new Z(i, Dj.a.f1163a, c0225c, kotlin.coroutines.g.f18170a);
        }
        V vA = a(0, z4.f1430b, (Dj.a) z4.f1431d);
        Bj.H.v(e, (CoroutineContext) z4.e, e0Var.equals(a0.f1434a) ? Bj.F.f585a : Bj.F.f587d, new L(e0Var, (InterfaceC0230h) z4.c, vA, null));
        return new P(vA);
    }
}
