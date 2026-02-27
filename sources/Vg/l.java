package Vg;

import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.D;
import qj.n;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6118b;
    public final k c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6119d;
    public final InterfaceC1526a[] e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6120g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Object initial, Object context, List blocks) {
        super(context);
        kotlin.jvm.internal.j.g(initial, "initial");
        kotlin.jvm.internal.j.g(context, "context");
        kotlin.jvm.internal.j.g(blocks, "blocks");
        this.f6118b = blocks;
        this.c = new k(this);
        this.f6119d = initial;
        this.e = new InterfaceC1526a[blocks.size()];
        this.f = -1;
    }

    @Override // Vg.e
    public final Object a(Object obj, AbstractC1609c abstractC1609c) {
        this.f6120g = 0;
        if (this.f6118b.size() == 0) {
            return obj;
        }
        kotlin.jvm.internal.j.g(obj, "<set-?>");
        this.f6119d = obj;
        if (this.f < 0) {
            return c(abstractC1609c);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // Vg.e
    public final Object b() {
        return this.f6119d;
    }

    @Override // Vg.e
    public final Object c(InterfaceC1526a frame) {
        Object obj;
        if (this.f6120g == this.f6118b.size()) {
            obj = this.f6119d;
        } else {
            InterfaceC1526a interfaceC1526aB = hj.h.b(frame);
            int i = this.f + 1;
            this.f = i;
            InterfaceC1526a[] interfaceC1526aArr = this.e;
            interfaceC1526aArr[i] = interfaceC1526aB;
            if (e(true)) {
                int i4 = this.f;
                if (i4 < 0) {
                    throw new IllegalStateException("No more continuations to resume");
                }
                this.f = i4 - 1;
                interfaceC1526aArr[i4] = null;
                obj = this.f6119d;
            } else {
                obj = EnumC1578a.f17050a;
            }
        }
        if (obj == EnumC1578a.f17050a) {
            kotlin.jvm.internal.j.g(frame, "frame");
        }
        return obj;
    }

    @Override // Vg.e
    public final Object d(InterfaceC1526a interfaceC1526a, Object obj) {
        kotlin.jvm.internal.j.g(obj, "<set-?>");
        this.f6119d = obj;
        return c(interfaceC1526a);
    }

    public final boolean e(boolean z4) {
        n interceptor;
        Object subject;
        k continuation;
        do {
            int i = this.f6120g;
            List list = this.f6118b;
            if (i == list.size()) {
                if (z4) {
                    return true;
                }
                C1037h.a aVar = C1037h.f9166b;
                f(this.f6119d);
                return false;
            }
            this.f6120g = i + 1;
            interceptor = (n) list.get(i);
            try {
                subject = this.f6119d;
                continuation = this.c;
                kotlin.jvm.internal.j.g(interceptor, "interceptor");
                kotlin.jvm.internal.j.g(subject, "subject");
                kotlin.jvm.internal.j.g(continuation, "continuation");
                D.d(3, interceptor);
            } catch (Throwable th2) {
                C1037h.a aVar2 = C1037h.f9166b;
                f(AbstractC1039j.a(th2));
                return false;
            }
        } while (interceptor.invoke(this, subject, continuation) != EnumC1578a.f17050a);
        return false;
    }

    public final void f(Object obj) {
        int i = this.f;
        if (i < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        InterfaceC1526a[] interfaceC1526aArr = this.e;
        InterfaceC1526a interfaceC1526a = interfaceC1526aArr[i];
        kotlin.jvm.internal.j.d(interfaceC1526a);
        int i4 = this.f;
        this.f = i4 - 1;
        interfaceC1526aArr[i4] = null;
        C1037h.a aVar = C1037h.f9166b;
        if (!(obj instanceof C1038i)) {
            interfaceC1526a.resumeWith(obj);
            return;
        }
        Throwable thA = C1037h.a(obj);
        kotlin.jvm.internal.j.d(thA);
        try {
            thA.getCause();
        } catch (Throwable unused) {
        }
        C1037h.a aVar2 = C1037h.f9166b;
        interfaceC1526a.resumeWith(AbstractC1039j.a(thA));
    }

    @Override // Bj.E
    public final CoroutineContext getCoroutineContext() {
        return this.c.getContext();
    }
}
