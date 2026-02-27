package l5;

import b5.C0909a;

/* JADX INFO: renamed from: l5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1801c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0909a f18233b;

    public C1801c(String adUnitId, C0909a c0909a) {
        kotlin.jvm.internal.j.g(adUnitId, "adUnitId");
        this.f18232a = adUnitId;
        this.f18233b = c0909a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1801c)) {
            return false;
        }
        C1801c c1801c = (C1801c) obj;
        return kotlin.jvm.internal.j.b(this.f18232a, c1801c.f18232a) && kotlin.jvm.internal.j.b(this.f18233b, c1801c.f18233b);
    }

    public final int hashCode() {
        return this.f18233b.hashCode() + (this.f18232a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoadFailed(adUnitId=" + this.f18232a + ", adKitError=" + this.f18233b + ")";
    }
}
