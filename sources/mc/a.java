package Mc;

import We.s;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3400b;
    public final String c;

    public a(String name, int i, String label) {
        j.g(name, "name");
        j.g(label, "label");
        this.f3399a = name;
        this.f3400b = i;
        this.c = label;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.b(this.f3399a, aVar.f3399a) && this.f3400b == aVar.f3400b && j.b(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f3399a.hashCode() * 31) + this.f3400b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Tier(name=");
        sb2.append(this.f3399a);
        sb2.append(", threshold=");
        sb2.append(this.f3400b);
        sb2.append(", label=");
        return s.p(sb2, this.c, ")");
    }
}
