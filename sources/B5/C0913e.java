package b5;

/* JADX INFO: renamed from: b5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0913e extends AbstractC0915g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0909a f8522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0911c f8523b;

    public C0913e(C0909a c0909a, AbstractC0911c abstractC0911c) {
        this.f8522a = c0909a;
        this.f8523b = abstractC0911c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0913e)) {
            return false;
        }
        C0913e c0913e = (C0913e) obj;
        return kotlin.jvm.internal.j.b(this.f8522a, c0913e.f8522a) && kotlin.jvm.internal.j.b(this.f8523b, c0913e.f8523b);
    }

    public final int hashCode() {
        return this.f8523b.hashCode() + (this.f8522a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(error=" + this.f8522a + ", variables=" + this.f8523b + ")";
    }
}
