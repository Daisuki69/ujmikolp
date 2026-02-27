package oi;

import dOYHB6.tiZVw8.numX49;
import java.util.Objects;

/* JADX INFO: renamed from: oi.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1987e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18899b;

    public C1987e(String str, long j) {
        Objects.requireNonNull(str);
        this.f18898a = str;
        this.f18899b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1987e.class == obj.getClass()) {
            C1987e c1987e = (C1987e) obj;
            if (this.f18898a.equals(c1987e.f18898a) && this.f18899b == c1987e.f18899b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return String.format(numX49.tnTj78("bQj1"), this.f18898a, Long.valueOf(this.f18899b)).hashCode();
    }
}
