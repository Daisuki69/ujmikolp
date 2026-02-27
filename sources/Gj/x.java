package Gj;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements kotlin.coroutines.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f2039a;

    public x(ThreadLocal threadLocal) {
        this.f2039a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && kotlin.jvm.internal.j.b(this.f2039a, ((x) obj).f2039a);
    }

    public final int hashCode() {
        return this.f2039a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f2039a + ')';
    }
}
