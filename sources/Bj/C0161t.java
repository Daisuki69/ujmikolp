package Bj;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Bj.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0161t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0145i f637b;
    public final qj.n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f638d;
    public final Throwable e;

    public C0161t(Object obj, InterfaceC0145i interfaceC0145i, qj.n nVar, Object obj2, Throwable th2) {
        this.f636a = obj;
        this.f637b = interfaceC0145i;
        this.c = nVar;
        this.f638d = obj2;
        this.e = th2;
    }

    public static C0161t a(C0161t c0161t, InterfaceC0145i interfaceC0145i, CancellationException cancellationException, int i) {
        Object obj = c0161t.f636a;
        if ((i & 2) != 0) {
            interfaceC0145i = c0161t.f637b;
        }
        InterfaceC0145i interfaceC0145i2 = interfaceC0145i;
        qj.n nVar = c0161t.c;
        Object obj2 = c0161t.f638d;
        Throwable th2 = cancellationException;
        if ((i & 16) != 0) {
            th2 = c0161t.e;
        }
        c0161t.getClass();
        return new C0161t(obj, interfaceC0145i2, nVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0161t)) {
            return false;
        }
        C0161t c0161t = (C0161t) obj;
        return kotlin.jvm.internal.j.b(this.f636a, c0161t.f636a) && kotlin.jvm.internal.j.b(this.f637b, c0161t.f637b) && kotlin.jvm.internal.j.b(this.c, c0161t.c) && kotlin.jvm.internal.j.b(this.f638d, c0161t.f638d) && kotlin.jvm.internal.j.b(this.e, c0161t.e);
    }

    public final int hashCode() {
        Object obj = this.f636a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0145i interfaceC0145i = this.f637b;
        int iHashCode2 = (iHashCode + (interfaceC0145i == null ? 0 : interfaceC0145i.hashCode())) * 31;
        qj.n nVar = this.c;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Object obj2 = this.f638d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f636a + ", cancelHandler=" + this.f637b + ", onCancellation=" + this.c + ", idempotentResume=" + this.f638d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ C0161t(Object obj, InterfaceC0145i interfaceC0145i, qj.n nVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC0145i, (i & 4) != 0 ? null : nVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
