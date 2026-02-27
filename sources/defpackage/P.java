package defpackage;

import cj.r;
import qk.i;

/* JADX INFO: loaded from: classes5.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f4896a;

    public P(Boolean bool) {
        this.f4896a = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i.t(r.c(this.f4896a), r.c(((P) obj).f4896a));
    }

    public final int hashCode() {
        return r.c(this.f4896a).hashCode();
    }

    public final String toString() {
        return "IsEnabledMessage(enabled=" + this.f4896a + ")";
    }
}
