package O4;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4646a;

    public g(Object obj) {
        this.f4646a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.j.b(this.f4646a, ((g) obj).f4646a);
    }

    public final int hashCode() {
        Object obj = this.f4646a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(body=" + this.f4646a + ')';
    }
}
