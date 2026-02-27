package m4;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18369b;

    public p(int i, int i4) {
        this.f18368a = i;
        this.f18369b = i4;
    }

    public final p a(p pVar) {
        int i = pVar.f18369b;
        int i4 = this.f18368a;
        int i6 = i4 * i;
        int i10 = pVar.f18368a;
        int i11 = this.f18369b;
        return i6 <= i10 * i11 ? new p(i10, (i11 * i10) / i4) : new p((i4 * i) / i11, i);
    }

    public final p b(p pVar) {
        int i = pVar.f18369b;
        int i4 = this.f18368a;
        int i6 = i4 * i;
        int i10 = pVar.f18368a;
        int i11 = this.f18369b;
        return i6 >= i10 * i11 ? new p(i10, (i11 * i10) / i4) : new p((i4 * i) / i11, i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        int i = this.f18369b * this.f18368a;
        int i4 = pVar.f18369b * pVar.f18368a;
        if (i4 < i) {
            return 1;
        }
        return i4 > i ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f18368a == pVar.f18368a && this.f18369b == pVar.f18369b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18368a * 31) + this.f18369b;
    }

    public final String toString() {
        return this.f18368a + "x" + this.f18369b;
    }
}
