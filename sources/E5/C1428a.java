package e5;

import We.s;
import defpackage.AbstractC1414e;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: e5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1428a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("attrs")
    private final C1429b f16600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("status")
    private final String f16601b;

    @InterfaceC1498b("code")
    private final int c;

    public final C1429b a() {
        return this.f16600a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1428a)) {
            return false;
        }
        C1428a c1428a = (C1428a) obj;
        return j.b(this.f16600a, c1428a.f16600a) && j.b(this.f16601b, c1428a.f16601b) && this.c == c1428a.c;
    }

    public final int hashCode() {
        return AbstractC1414e.c(this.f16600a.hashCode() * 31, 31, this.f16601b) + this.c;
    }

    public final String toString() {
        C1429b c1429b = this.f16600a;
        String str = this.f16601b;
        int i = this.c;
        StringBuilder sb2 = new StringBuilder("UserTagResponse(attrs=");
        sb2.append(c1429b);
        sb2.append(", status=");
        sb2.append(str);
        sb2.append(", code=");
        return s.o(sb2, ")", i);
    }
}
