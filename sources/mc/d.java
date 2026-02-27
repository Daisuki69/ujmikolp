package mc;

import com.paymaya.domain.model.Route;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Route f18400b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Route route) {
        super(1);
        j.g(route, "route");
        this.f18400b = route;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && j.b(this.f18400b, ((d) obj).f18400b);
    }

    public final int hashCode() {
        return this.f18400b.hashCode();
    }

    public final String toString() {
        return "RouteSelection(route=" + this.f18400b + ")";
    }
}
