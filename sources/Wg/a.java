package Wg;

import kotlin.jvm.internal.C1790e;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1790e f6433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f6434b;

    public a(C1790e c1790e, F f) {
        this.f6433a = c1790e;
        this.f6434b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        F f = this.f6434b;
        if (f == null) {
            a aVar = (a) obj;
            if (aVar.f6434b == null) {
                return this.f6433a.equals(aVar.f6433a);
            }
        }
        return j.b(f, ((a) obj).f6434b);
    }

    public final int hashCode() {
        F f = this.f6434b;
        return f != null ? f.hashCode() : this.f6433a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypeInfo(");
        Object obj = this.f6434b;
        if (obj == null) {
            obj = this.f6433a;
        }
        sb2.append(obj);
        sb2.append(')');
        return sb2.toString();
    }
}
