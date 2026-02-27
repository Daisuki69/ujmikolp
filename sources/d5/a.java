package d5;

import We.s;
import defpackage.AbstractC1414e;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("attrs")
    private final b f16275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("status")
    private final String f16276b;

    @InterfaceC1498b("code")
    private final int c;

    public final b a() {
        return this.f16275a;
    }

    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.b(this.f16275a, aVar.f16275a) && j.b(this.f16276b, aVar.f16276b) && this.c == aVar.c;
    }

    public final int hashCode() {
        return AbstractC1414e.c(this.f16275a.hashCode() * 31, 31, this.f16276b) + this.c;
    }

    public final String toString() {
        b bVar = this.f16275a;
        String str = this.f16276b;
        int i = this.c;
        StringBuilder sb2 = new StringBuilder("ApiErrorResponse(attrs=");
        sb2.append(bVar);
        sb2.append(", status=");
        sb2.append(str);
        sb2.append(", code=");
        return s.o(sb2, ")", i);
    }
}
