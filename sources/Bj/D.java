package Bj;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0154m0 f583b = new C0154m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f584a;

    public D(String str) {
        super(f583b);
        this.f584a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D) && kotlin.jvm.internal.j.b(this.f584a, ((D) obj).f584a);
    }

    public final int hashCode() {
        return this.f584a.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.a.n(new StringBuilder("CoroutineName("), this.f584a, ')');
    }
}
