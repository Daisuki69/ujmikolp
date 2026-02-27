package j2;

import We.s;

/* JADX INFO: loaded from: classes2.dex */
public final class i {
    public static final i c = new i(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17684b;

    public i(int i, int i4) {
        this.f17683a = i;
        this.f17684b = i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f17683a);
        sb2.append(", length = ");
        return s.o(sb2, "]", this.f17684b);
    }
}
