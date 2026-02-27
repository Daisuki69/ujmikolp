package bg;

/* JADX INFO: renamed from: bg.U, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0981U extends AbstractC0982V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f8873a;

    public C0981U(StringBuilder sb2) {
        this.f8873a = sb2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0981U) && kotlin.jvm.internal.j.b(this.f8873a, ((C0981U) obj).f8873a);
        }
        return true;
    }

    public final int hashCode() {
        StringBuilder sb2 = this.f8873a;
        if (sb2 != null) {
            return sb2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "None(debugOutput=" + ((Object) this.f8873a) + ")";
    }
}
