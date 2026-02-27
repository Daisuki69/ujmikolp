package Rg;

import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Wg.a f5523b;

    public a(String str, Wg.a aVar) {
        this.f5522a = str;
        this.f5523b = aVar;
        if (C2576A.H(str)) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.j.b(this.f5522a, aVar.f5522a) && kotlin.jvm.internal.j.b(this.f5523b, aVar.f5523b);
    }

    public final int hashCode() {
        return this.f5523b.hashCode() + (this.f5522a.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: " + this.f5522a;
    }
}
