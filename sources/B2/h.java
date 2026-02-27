package b2;

import We.s;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f8362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8363b;
    public final int c;

    public h(int i, int i4, Class cls) {
        this(n.a(cls), i, i4);
    }

    public static h a(Class cls) {
        return new h(0, 1, cls);
    }

    public static h b(n nVar) {
        return new h(nVar, 1, 0);
    }

    public static h c(Class cls) {
        return new h(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f8362a.equals(hVar.f8362a) && this.f8363b == hVar.f8363b && this.c == hVar.c;
    }

    public final int hashCode() {
        return ((((this.f8362a.hashCode() ^ 1000003) * 1000003) ^ this.f8363b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f8362a);
        sb2.append(", type=");
        int i = this.f8363b;
        sb2.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i4 = this.c;
        if (i4 == 0) {
            str = DevicePublicKeyStringDef.DIRECT;
        } else if (i4 == 1) {
            str = "provider";
        } else {
            if (i4 != 2) {
                throw new AssertionError(s.f(i4, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return s.p(sb2, str, "}");
    }

    public h(n nVar, int i, int i4) {
        E1.c.d(nVar, "Null dependency anInterface.");
        this.f8362a = nVar;
        this.f8363b = i;
        this.c = i4;
    }
}
