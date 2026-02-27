package O4;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f4645a;

    public e(Exception exc) {
        this.f4645a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f4645a.equals(((e) obj).f4645a);
    }

    public final int hashCode() {
        return this.f4645a.hashCode();
    }

    public final String toString() {
        return "UnknownError(throwable=" + this.f4645a + ')';
    }
}
