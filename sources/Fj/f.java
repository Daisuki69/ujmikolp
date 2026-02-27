package Fj;

import Bj.H;
import Ej.InterfaceC0230h;
import Ej.InterfaceC0231i;
import cj.C1110A;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f1649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1650b;
    public final Dj.a c;

    public f(CoroutineContext coroutineContext, int i, Dj.a aVar) {
        this.f1649a = coroutineContext;
        this.f1650b = i;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // Fj.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Ej.InterfaceC0230h a(kotlin.coroutines.CoroutineContext r5, int r6, Dj.a r7) {
        /*
            r4 = this;
            kotlin.coroutines.CoroutineContext r0 = r4.f1649a
            kotlin.coroutines.CoroutineContext r5 = r5.plus(r0)
            Dj.a r1 = Dj.a.f1163a
            Dj.a r2 = r4.c
            int r3 = r4.f1650b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = kotlin.jvm.internal.j.b(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            Fj.f r5 = r4.d(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Fj.f.a(kotlin.coroutines.CoroutineContext, int, Dj.a):Ej.h");
    }

    public abstract Object c(Dj.r rVar, InterfaceC1526a interfaceC1526a);

    @Override // Ej.InterfaceC0230h
    public Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
        Object objL = H.l(new d(interfaceC0231i, this, null), interfaceC1526a);
        return objL == EnumC1578a.f17050a ? objL : Unit.f18162a;
    }

    public abstract f d(CoroutineContext coroutineContext, int i, Dj.a aVar);

    public InterfaceC0230h e() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f18170a;
        CoroutineContext coroutineContext = this.f1649a;
        if (coroutineContext != gVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i = this.f1650b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        Dj.a aVar = Dj.a.f1163a;
        Dj.a aVar2 = this.c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return androidx.camera.core.impl.a.n(sb2, C1110A.F(arrayList, ", ", null, null, null, 62), ']');
    }
}
