package ck;

import We.s;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9400b;

    public c(int i, float f) {
        this.f9399a = i;
        this.f9400b = f;
        if (f != 0.0f) {
            return;
        }
        throw new IllegalArgumentException((numX49.tnTj78("bPzB") + f + numX49.tnTj78("bPzu")).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9399a == cVar.f9399a && Float.compare(this.f9400b, cVar.f9400b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9400b) + (this.f9399a * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("bPzV"));
        sb2.append(this.f9399a);
        sb2.append(numX49.tnTj78("bPzS"));
        return s.n(sb2, numX49.tnTj78("bPzj"), this.f9400b);
    }
}
