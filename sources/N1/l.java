package N1;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3498a;

    public l(Object obj) {
        this.f3498a = obj;
    }

    @Override // N1.i
    public final Object a() {
        return this.f3498a;
    }

    @Override // N1.i
    public final boolean b() {
        return true;
    }

    @Override // N1.i
    public final Object c(Enum r1) {
        return this.f3498a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f3498a.equals(((l) obj).f3498a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3498a.hashCode() + 1502476572;
    }

    public final String toString() {
        return androidx.camera.core.impl.a.m(new StringBuilder("Optional.of("), this.f3498a, ")");
    }
}
