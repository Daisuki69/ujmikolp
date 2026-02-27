package ri;

import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ri.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2209a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("keys")
    private final List<b> f19957a;

    public C2209a(ArrayList arrayList) {
        this.f19957a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f19957a.equals(((C2209a) obj).f19957a);
    }

    public final int hashCode() {
        return this.f19957a.hashCode();
    }

    public C2209a() {
        this(new ArrayList());
    }
}
