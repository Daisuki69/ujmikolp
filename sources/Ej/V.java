package Ej;

import Bj.C0143h;
import Bj.C0151l;
import Fj.AbstractC0248a;
import Fj.AbstractC0249b;
import Fj.AbstractC0250c;
import bj.C1037h;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public class V extends AbstractC0248a implements N, InterfaceC0230h, Fj.t {
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Dj.a f1419g;
    public Object[] h;
    public long i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1421l;

    public V(int i, int i4, Dj.a aVar) {
        this.e = i;
        this.f = i4;
        this.f1419g = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:52)|(2:10|(1:(1:(7:14|15|16|31|58|(4:32|(9:56|(2:41|42)|43|(1:60)|16|31|58|32|(0)(1:34))(0)|48|49)|45)(2:19|20))(5:21|22|58|(4:32|(0)(0)|48|49)|45))(4:24|54|25|26))(1:29)|50|30|31|58|(4:32|(0)(0)|48|49)|45) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [Ej.i] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [Fj.a] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [Ej.V] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Ej.i] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [Fj.c] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [Ej.X] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [Ej.X] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ae -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(Ej.V r8, Ej.InterfaceC0231i r9, gj.InterfaceC1526a r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof Ej.U
            if (r0 == 0) goto L13
            r0 = r10
            Ej.U r0 = (Ej.U) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            Ej.U r0 = new Ej.U
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.h
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            Bj.n0 r8 = r0.e
            Ej.X r9 = r0.c
            Ej.i r2 = r0.f1417b
            Ej.V r5 = r0.f1416a
            bj.AbstractC1039j.b(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb4
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            Bj.n0 r8 = r0.e
            Ej.X r9 = r0.c
            Ej.i r2 = r0.f1417b
            Ej.V r5 = r0.f1416a
            bj.AbstractC1039j.b(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            Ej.X r9 = r0.c
            Ej.i r8 = r0.f1417b
            Ej.V r2 = r0.f1416a
            bj.AbstractC1039j.b(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb4
        L5e:
            bj.AbstractC1039j.b(r10)
            Fj.c r10 = r8.c()
            Ej.X r10 = (Ej.X) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            Bj.m0 r5 = Bj.C0154m0.f630a     // Catch: java.lang.Throwable -> Lb1
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lb1
            Bj.n0 r2 = (Bj.InterfaceC0156n0) r2     // Catch: java.lang.Throwable -> Lb1
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.r(r9)     // Catch: java.lang.Throwable -> L38
            Gj.t r6 = Ej.W.f1422a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.f1416a = r5     // Catch: java.lang.Throwable -> L38
            r0.f1417b = r2     // Catch: java.lang.Throwable -> L38
            r0.c = r9     // Catch: java.lang.Throwable -> L38
            r0.e = r8     // Catch: java.lang.Throwable -> L38
            r0.h = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.h(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            goto Lb0
        L92:
            if (r8 == 0) goto La0
            boolean r6 = r8.isActive()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.g()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La0:
            r0.f1416a = r5     // Catch: java.lang.Throwable -> L38
            r0.f1417b = r2     // Catch: java.lang.Throwable -> L38
            r0.c = r9     // Catch: java.lang.Throwable -> L38
            r0.e = r8     // Catch: java.lang.Throwable -> L38
            r0.h = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        Lb0:
            return
        Lb1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb4:
            r5.f(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.V.j(Ej.V, Ej.i, gj.a):void");
    }

    @Override // Fj.t
    public final InterfaceC0230h a(CoroutineContext coroutineContext, int i, Dj.a aVar) {
        return W.o(this, coroutineContext, i, aVar);
    }

    @Override // Ej.N
    public final boolean b(Object obj) {
        int i;
        boolean z4;
        InterfaceC1526a[] interfaceC1526aArrM = AbstractC0249b.f1643a;
        synchronized (this) {
            if (p(obj)) {
                interfaceC1526aArrM = m(interfaceC1526aArrM);
                z4 = true;
            } else {
                z4 = false;
            }
        }
        for (InterfaceC1526a interfaceC1526a : interfaceC1526aArrM) {
            if (interfaceC1526a != null) {
                C1037h.a aVar = C1037h.f9166b;
                interfaceC1526a.resumeWith(Unit.f18162a);
            }
        }
        return z4;
    }

    @Override // Ej.InterfaceC0230h
    public final Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
        j(this, interfaceC0231i, interfaceC1526a);
        return EnumC1578a.f17050a;
    }

    @Override // Fj.AbstractC0248a
    public final AbstractC0250c d() {
        X x6 = new X();
        x6.f1424a = -1L;
        return x6;
    }

    @Override // Fj.AbstractC0248a
    public final AbstractC0250c[] e() {
        return new X[2];
    }

    @Override // Ej.N, Ej.InterfaceC0231i
    public final Object emit(Object obj, InterfaceC1526a interfaceC1526a) throws Throwable {
        Throwable th2;
        InterfaceC1526a[] interfaceC1526aArrM;
        T t5;
        if (b(obj)) {
            return Unit.f18162a;
        }
        C0151l c0151l = new C0151l(1, hj.h.b(interfaceC1526a));
        c0151l.r();
        InterfaceC1526a[] interfaceC1526aArrM2 = AbstractC0249b.f1643a;
        synchronized (this) {
            try {
                if (p(obj)) {
                    try {
                        C1037h.a aVar = C1037h.f9166b;
                        c0151l.resumeWith(Unit.f18162a);
                        interfaceC1526aArrM = m(interfaceC1526aArrM2);
                        t5 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        T t10 = new T(this, n() + ((long) (this.f1420k + this.f1421l)), obj, c0151l);
                        l(t10);
                        this.f1421l++;
                        if (this.f == 0) {
                            interfaceC1526aArrM2 = m(interfaceC1526aArrM2);
                        }
                        interfaceC1526aArrM = interfaceC1526aArrM2;
                        t5 = t10;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (t5 != null) {
                    c0151l.v(new C0143h(t5, 2));
                }
                for (InterfaceC1526a interfaceC1526a2 : interfaceC1526aArrM) {
                    if (interfaceC1526a2 != null) {
                        C1037h.a aVar2 = C1037h.f9166b;
                        interfaceC1526a2.resumeWith(Unit.f18162a);
                    }
                }
                Object objQ = c0151l.q();
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                if (objQ != enumC1578a) {
                    objQ = Unit.f18162a;
                }
                return objQ == enumC1578a ? objQ : Unit.f18162a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final Object h(X x6, U u3) {
        C0151l c0151l = new C0151l(1, hj.h.b(u3));
        c0151l.r();
        synchronized (this) {
            if (q(x6) < 0) {
                x6.f1425b = c0151l;
            } else {
                C1037h.a aVar = C1037h.f9166b;
                c0151l.resumeWith(Unit.f18162a);
            }
            Unit unit = Unit.f18162a;
        }
        Object objQ = c0151l.q();
        return objQ == EnumC1578a.f17050a ? objQ : Unit.f18162a;
    }

    public final void i() {
        if (this.f != 0 || this.f1421l > 1) {
            Object[] objArr = this.h;
            kotlin.jvm.internal.j.d(objArr);
            while (this.f1421l > 0) {
                long jN = n();
                int i = this.f1420k;
                int i4 = this.f1421l;
                if (objArr[((int) ((jN + ((long) (i + i4))) - 1)) & (objArr.length - 1)] != W.f1422a) {
                    return;
                }
                this.f1421l = i4 - 1;
                W.d(objArr, n() + ((long) (this.f1420k + this.f1421l)), null);
            }
        }
    }

    public final void k() {
        AbstractC0250c[] abstractC0250cArr;
        Object[] objArr = this.h;
        kotlin.jvm.internal.j.d(objArr);
        W.d(objArr, n(), null);
        this.f1420k--;
        long jN = n() + 1;
        if (this.i < jN) {
            this.i = jN;
        }
        if (this.j < jN) {
            if (this.f1641b != 0 && (abstractC0250cArr = this.f1640a) != null) {
                for (AbstractC0250c abstractC0250c : abstractC0250cArr) {
                    if (abstractC0250c != null) {
                        X x6 = (X) abstractC0250c;
                        long j = x6.f1424a;
                        if (j >= 0 && j < jN) {
                            x6.f1424a = jN;
                        }
                    }
                }
            }
            this.j = jN;
        }
    }

    public final void l(Object obj) {
        int i = this.f1420k + this.f1421l;
        Object[] objArrO = this.h;
        if (objArrO == null) {
            objArrO = o(0, 2, null);
        } else if (i >= objArrO.length) {
            objArrO = o(i, objArrO.length * 2, objArrO);
        }
        W.d(objArrO, n() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [gj.a[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final InterfaceC1526a[] m(InterfaceC1526a[] interfaceC1526aArr) {
        AbstractC0250c[] abstractC0250cArr;
        X x6;
        C0151l c0151l;
        int length = interfaceC1526aArr.length;
        if (this.f1641b != 0 && (abstractC0250cArr = this.f1640a) != null) {
            int length2 = abstractC0250cArr.length;
            int i = 0;
            interfaceC1526aArr = interfaceC1526aArr;
            while (i < length2) {
                AbstractC0250c abstractC0250c = abstractC0250cArr[i];
                if (abstractC0250c != null && (c0151l = (x6 = (X) abstractC0250c).f1425b) != null && q(x6) >= 0) {
                    int length3 = interfaceC1526aArr.length;
                    interfaceC1526aArr = interfaceC1526aArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) interfaceC1526aArr, Math.max(2, interfaceC1526aArr.length * 2));
                        kotlin.jvm.internal.j.f(objArrCopyOf, "copyOf(...)");
                        interfaceC1526aArr = objArrCopyOf;
                    }
                    ((InterfaceC1526a[]) interfaceC1526aArr)[length] = c0151l;
                    x6.f1425b = null;
                    length++;
                }
                i++;
                interfaceC1526aArr = interfaceC1526aArr;
            }
        }
        return (InterfaceC1526a[]) interfaceC1526aArr;
    }

    public final long n() {
        return Math.min(this.j, this.i);
    }

    public final Object[] o(int i, int i4, Object[] objArr) {
        if (i4 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i4];
        this.h = objArr2;
        if (objArr != null) {
            long jN = n();
            for (int i6 = 0; i6 < i; i6++) {
                long j = ((long) i6) + jN;
                W.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f1641b
            int r2 = r12.e
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7f
        Lb:
            r12.l(r13)
            int r1 = r12.f1420k
            int r1 = r1 + r9
            r12.f1420k = r1
            if (r1 <= r2) goto L18
            r12.k()
        L18:
            long r1 = r12.n()
            int r3 = r12.f1420k
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.j = r1
            return r9
        L23:
            int r1 = r12.f1420k
            int r3 = r12.f
            if (r1 < r3) goto L47
            long r4 = r12.j
            long r6 = r12.i
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L47
            Dj.a r1 = r12.f1419g
            int r1 = r1.ordinal()
            if (r1 == 0) goto L45
            if (r1 == r9) goto L47
            r2 = 2
            if (r1 != r2) goto L3f
            goto L7f
        L3f:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L45:
            r1 = 0
            return r1
        L47:
            r12.l(r13)
            int r1 = r12.f1420k
            int r1 = r1 + r9
            r12.f1420k = r1
            if (r1 <= r3) goto L54
            r12.k()
        L54:
            long r3 = r12.n()
            int r1 = r12.f1420k
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.i
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7f
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.j
            long r5 = r12.n()
            int r7 = r12.f1420k
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.n()
            int r10 = r12.f1420k
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f1421l
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.s(r1, r3, r5, r7)
        L7f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.V.p(java.lang.Object):boolean");
    }

    public final long q(X x6) {
        long j = x6.f1424a;
        if (j < n() + ((long) this.f1420k)) {
            return j;
        }
        if (this.f <= 0 && j <= n() && this.f1421l != 0) {
            return j;
        }
        return -1L;
    }

    public final Object r(X x6) {
        Object obj;
        InterfaceC1526a[] interfaceC1526aArrT = AbstractC0249b.f1643a;
        synchronized (this) {
            try {
                long jQ = q(x6);
                if (jQ < 0) {
                    obj = W.f1422a;
                } else {
                    long j = x6.f1424a;
                    Object[] objArr = this.h;
                    kotlin.jvm.internal.j.d(objArr);
                    Object obj2 = objArr[((int) jQ) & (objArr.length - 1)];
                    if (obj2 instanceof T) {
                        obj2 = ((T) obj2).c;
                    }
                    x6.f1424a = jQ + 1;
                    Object obj3 = obj2;
                    interfaceC1526aArrT = t(j);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (InterfaceC1526a interfaceC1526a : interfaceC1526aArrT) {
            if (interfaceC1526a != null) {
                C1037h.a aVar = C1037h.f9166b;
                interfaceC1526a.resumeWith(Unit.f18162a);
            }
        }
        return obj;
    }

    public final void s(long j, long j6, long j7, long j9) {
        long jMin = Math.min(j6, j);
        for (long jN = n(); jN < jMin; jN++) {
            Object[] objArr = this.h;
            kotlin.jvm.internal.j.d(objArr);
            W.d(objArr, jN, null);
        }
        this.i = j;
        this.j = j6;
        this.f1420k = (int) (j7 - jMin);
        this.f1421l = (int) (j9 - j7);
    }

    public final InterfaceC1526a[] t(long j) {
        long j6;
        long j7;
        long j9;
        int i;
        InterfaceC1526a[] interfaceC1526aArr;
        AbstractC0250c[] abstractC0250cArr;
        long j10 = this.j;
        InterfaceC1526a[] interfaceC1526aArr2 = AbstractC0249b.f1643a;
        if (j <= j10) {
            long jN = n();
            long j11 = ((long) this.f1420k) + jN;
            int i4 = this.f;
            if (i4 == 0 && this.f1421l > 0) {
                j11++;
            }
            int i6 = 0;
            if (this.f1641b != 0 && (abstractC0250cArr = this.f1640a) != null) {
                for (AbstractC0250c abstractC0250c : abstractC0250cArr) {
                    if (abstractC0250c != null) {
                        long j12 = ((X) abstractC0250c).f1424a;
                        if (j12 >= 0 && j12 < j11) {
                            j11 = j12;
                        }
                    }
                }
            }
            if (j11 > this.j) {
                long jN2 = n() + ((long) this.f1420k);
                int iMin = this.f1641b > 0 ? Math.min(this.f1421l, i4 - ((int) (jN2 - j11))) : this.f1421l;
                long j13 = ((long) this.f1421l) + jN2;
                Gj.t tVar = W.f1422a;
                if (iMin > 0) {
                    InterfaceC1526a[] interfaceC1526aArr3 = new InterfaceC1526a[iMin];
                    j9 = 1;
                    Object[] objArr = this.h;
                    kotlin.jvm.internal.j.d(objArr);
                    i = i4;
                    long j14 = jN2;
                    while (true) {
                        if (jN2 >= j13) {
                            j6 = jN;
                            j7 = j11;
                            break;
                        }
                        j6 = jN;
                        Object obj = objArr[((int) jN2) & (objArr.length - 1)];
                        if (obj != tVar) {
                            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            T t5 = (T) obj;
                            int i10 = i6 + 1;
                            j7 = j11;
                            interfaceC1526aArr3[i6] = t5.f1415d;
                            W.d(objArr, jN2, tVar);
                            W.d(objArr, j14, t5.c);
                            j14++;
                            if (i10 >= iMin) {
                                break;
                            }
                            i6 = i10;
                        } else {
                            j7 = j11;
                        }
                        jN2++;
                        jN = j6;
                        j11 = j7;
                    }
                    jN2 = j14;
                    interfaceC1526aArr = interfaceC1526aArr3;
                } else {
                    j6 = jN;
                    j7 = j11;
                    j9 = 1;
                    i = i4;
                    interfaceC1526aArr = interfaceC1526aArr2;
                }
                int i11 = (int) (jN2 - j6);
                long j15 = this.f1641b == 0 ? jN2 : j7;
                long jMax = Math.max(this.i, jN2 - ((long) Math.min(this.e, i11)));
                if (i == 0 && jMax < j13) {
                    Object[] objArr2 = this.h;
                    kotlin.jvm.internal.j.d(objArr2);
                    if (kotlin.jvm.internal.j.b(objArr2[((int) jMax) & (objArr2.length - 1)], tVar)) {
                        jN2 += j9;
                        jMax += j9;
                    }
                }
                s(jMax, j15, jN2, j13);
                i();
                return interfaceC1526aArr.length == 0 ? interfaceC1526aArr : m(interfaceC1526aArr);
            }
        }
        return interfaceC1526aArr2;
    }
}
