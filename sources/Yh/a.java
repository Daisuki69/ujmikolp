package Yh;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6788a;

    public a(String str) {
        this.f6788a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && this.f6788a.equals(((a) obj).f6788a);
    }

    public final int hashCode() {
        return (this.f6788a.hashCode() ^ 17000051) * 1000003;
    }

    public final String toString() {
        return this.f6788a.concat(", null");
    }
}
