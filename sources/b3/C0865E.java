package b3;

/* JADX INFO: renamed from: b3.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0865E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8385b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8386d;

    public C0865E(String str, int i, int i4, boolean z4) {
        this.f8384a = str;
        this.f8385b = i;
        this.c = i4;
        this.f8386d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0865E)) {
            return false;
        }
        C0865E c0865e = (C0865E) obj;
        return kotlin.jvm.internal.j.b(this.f8384a, c0865e.f8384a) && this.f8385b == c0865e.f8385b && this.c == c0865e.c && this.f8386d == c0865e.f8386d;
    }

    public final int hashCode() {
        return (((((this.f8384a.hashCode() * 31) + this.f8385b) * 31) + this.c) * 31) + (this.f8386d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.f8384a);
        sb2.append(", pid=");
        sb2.append(this.f8385b);
        sb2.append(", importance=");
        sb2.append(this.c);
        sb2.append(", isDefaultProcess=");
        return androidx.camera.core.impl.a.q(sb2, this.f8386d, ')');
    }
}
