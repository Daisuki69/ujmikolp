package io.ktor.utils.io;

/* JADX INFO: renamed from: io.ktor.utils.io.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1646a implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f17519b;

    public C1646a(Throwable th2) {
        this.f17519b = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1646a) && kotlin.jvm.internal.j.b(this.f17519b, ((C1646a) obj).f17519b);
    }

    public final int hashCode() {
        Throwable th2 = this.f17519b;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    public final String toString() {
        return "Closed(cause=" + this.f17519b + ')';
    }
}
