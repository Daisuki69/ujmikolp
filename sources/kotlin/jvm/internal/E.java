package kotlin.jvm.internal;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements xj.p {
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1790e f18176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile List f18177b;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public E(C1790e c1790e) {
        xj.r rVar = xj.r.f21013a;
        this.f18176a = c1790e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E) {
            return this.f18176a.equals(((E) obj).f18176a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18176a.hashCode() * 31) + 749883007;
    }

    public final String toString() {
        c.getClass();
        StringBuilder sb2 = new StringBuilder();
        xj.r rVar = xj.r.f21013a;
        Unit unit = Unit.f18162a;
        sb2.append("PluginConfigT");
        return sb2.toString();
    }
}
