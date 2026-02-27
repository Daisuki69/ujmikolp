package b1;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f8332a;

    public s(r rVar) {
        this.f8332a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F) {
            return this.f8332a.equals(((s) ((F) obj)).f8332a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8332a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f8332a + "}";
    }
}
