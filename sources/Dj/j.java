package Dj;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f1192a;

    public j(Throwable th2) {
        this.f1192a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return kotlin.jvm.internal.j.b(this.f1192a, ((j) obj).f1192a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f1192a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // Dj.k
    public final String toString() {
        return "Closed(" + this.f1192a + ')';
    }
}
