package v1;

import M8.A0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0[] f20454b;
    public int c;

    public d(A0... a0Arr) {
        this.f20454b = a0Arr;
        this.f20453a = a0Arr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f20454b, ((d) obj).f20454b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.f20454b);
        }
        return this.c;
    }
}
