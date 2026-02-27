package E;

import dOYHB6.tiZVw8.numX49;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1217b;
    public final boolean c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1218d = true;
    public final Map e;

    public g(int i, int i4, Map map) {
        this.f1216a = i;
        this.f1217b = i4;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1216a == gVar.f1216a && this.f1217b == gVar.f1217b && this.c == gVar.c && this.f1218d == gVar.f1218d && j.b(this.e, gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (((((((this.f1216a * 31) + this.f1217b) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.f1218d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return numX49.tnTj78("P4w") + this.f1216a + numX49.tnTj78("P4c") + this.f1217b + numX49.tnTj78("P4m") + this.c + numX49.tnTj78("P4D") + this.f1218d + numX49.tnTj78("P4h") + this.e + ')';
    }
}
