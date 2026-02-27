package bj;

import java.io.Serializable;

/* JADX INFO: renamed from: bj.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1042m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9175b;
    public final Object c;

    public C1042m(Object obj, Object obj2, Object obj3) {
        this.f9174a = obj;
        this.f9175b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1042m)) {
            return false;
        }
        C1042m c1042m = (C1042m) obj;
        return kotlin.jvm.internal.j.b(this.f9174a, c1042m.f9174a) && kotlin.jvm.internal.j.b(this.f9175b, c1042m.f9175b) && kotlin.jvm.internal.j.b(this.c, c1042m.c);
    }

    public final int hashCode() {
        Object obj = this.f9174a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f9175b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f9174a + ", " + this.f9175b + ", " + this.c + ')';
    }
}
