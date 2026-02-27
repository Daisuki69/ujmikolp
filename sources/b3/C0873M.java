package b3;

/* JADX INFO: renamed from: b3.M, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0873M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f8396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0881b f8397b;

    public C0873M(V v7, C0881b c0881b) {
        EnumC0892m enumC0892m = EnumC0892m.f8484b;
        this.f8396a = v7;
        this.f8397b = c0881b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0873M)) {
            return false;
        }
        C0873M c0873m = (C0873M) obj;
        c0873m.getClass();
        EnumC0892m enumC0892m = EnumC0892m.f8484b;
        return this.f8396a.equals(c0873m.f8396a) && this.f8397b.equals(c0873m.f8397b);
    }

    public final int hashCode() {
        return this.f8397b.hashCode() + ((this.f8396a.hashCode() + (EnumC0892m.f8484b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC0892m.f8484b + ", sessionData=" + this.f8396a + ", applicationInfo=" + this.f8397b + ')';
    }
}
