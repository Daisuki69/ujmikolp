package defpackage;

import cj.r;
import qk.i;

/* JADX INFO: loaded from: classes5.dex */
public final class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f334a;

    public B0(Boolean bool) {
        this.f334a = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i.t(r.c(this.f334a), r.c(((B0) obj).f334a));
    }

    public final int hashCode() {
        return r.c(this.f334a).hashCode();
    }

    public final String toString() {
        return "ToggleMessage(enable=" + this.f334a + ")";
    }
}
