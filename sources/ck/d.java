package ck;

import We.s;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f9401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f9402b;

    public d(float f, float f3) {
        this.f9401a = f;
        this.f9402b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f9401a, dVar.f9401a) == 0 && Float.compare(this.f9402b, dVar.f9402b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9402b) + (Float.floatToIntBits(this.f9401a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("bPzP"));
        sb2.append(this.f9401a);
        sb2.append(numX49.tnTj78("bPzb"));
        return s.n(sb2, numX49.tnTj78("bPz2"), this.f9402b);
    }
}
