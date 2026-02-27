package bg;

/* JADX INFO: renamed from: bg.T, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0980T extends AbstractC0982V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0968I f8871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f8872b;

    public C0980T(C0968I c0968i, StringBuilder sb2) {
        this.f8871a = c0968i;
        this.f8872b = sb2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0980T)) {
            return false;
        }
        C0980T c0980t = (C0980T) obj;
        return kotlin.jvm.internal.j.b(this.f8871a, c0980t.f8871a) && kotlin.jvm.internal.j.b(this.f8872b, c0980t.f8872b);
    }

    public final int hashCode() {
        C0968I c0968i = this.f8871a;
        int iHashCode = (c0968i != null ? c0968i.hashCode() : 0) * 31;
        StringBuilder sb2 = this.f8872b;
        return iHashCode + (sb2 != null ? sb2.hashCode() : 0);
    }

    public final String toString() {
        return "Detected(emulator=" + this.f8871a + ", debugOutput=" + ((Object) this.f8872b) + ")";
    }
}
