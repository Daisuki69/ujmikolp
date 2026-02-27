package kotlin.reflect;

import androidx.webkit.ProxyConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.j;
import xj.q;
import xj.r;

/* JADX INFO: loaded from: classes4.dex */
public final class KTypeProjection {
    public static final a c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KTypeProjection f18203d = new KTypeProjection(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f18204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f18205b;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public KTypeProjection(r rVar, F f) {
        String str;
        this.f18204a = rVar;
        this.f18205b = f;
        if ((rVar == null) == (f == null)) {
            return;
        }
        if (rVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + rVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.f18204a == kTypeProjection.f18204a && j.b(this.f18205b, kTypeProjection.f18205b);
    }

    public final int hashCode() {
        r rVar = this.f18204a;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        F f = this.f18205b;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        r rVar = this.f18204a;
        int i = rVar == null ? -1 : q.f21012a[rVar.ordinal()];
        if (i == -1) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        F f = this.f18205b;
        if (i == 1) {
            return String.valueOf(f);
        }
        if (i == 2) {
            return "in " + f;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + f;
    }
}
