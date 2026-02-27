package U3;

import C3.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f5931b;
    public final l[] c;

    public c(int i, int[] iArr, int i4, int i6, int i10) {
        this.f5930a = i;
        this.f5931b = iArr;
        float f = i4;
        float f3 = i10;
        this.c = new l[]{new l(f, f3), new l(i6, f3)};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && this.f5930a == ((c) obj).f5930a;
    }

    public final int hashCode() {
        return this.f5930a;
    }
}
