package b3;

/* JADX INFO: renamed from: b3.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0862B {
    public static final C0861A Companion = new C0861A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8378b;

    public /* synthetic */ C0862B(int i, int i4, String str) {
        if (3 != (i & 3)) {
            Tj.m.d(i, 3, C0905z.f8505a.d());
            throw null;
        }
        this.f8377a = i4;
        this.f8378b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0862B)) {
            return false;
        }
        C0862B c0862b = (C0862B) obj;
        return this.f8377a == c0862b.f8377a && kotlin.jvm.internal.j.b(this.f8378b, c0862b.f8378b);
    }

    public final int hashCode() {
        return this.f8378b.hashCode() + (this.f8377a * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessData(pid=");
        sb2.append(this.f8377a);
        sb2.append(", uuid=");
        return androidx.camera.core.impl.a.n(sb2, this.f8378b, ')');
    }

    public C0862B(int i, String uuid) {
        kotlin.jvm.internal.j.g(uuid, "uuid");
        this.f8377a = i;
        this.f8378b = uuid;
    }
}
