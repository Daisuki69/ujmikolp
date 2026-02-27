package n5;

import b5.C0909a;
import b5.C0916h;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: n5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1925b extends AbstractC1926c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0909a f18618b;
    public final C0916h c;

    public C1925b(String str, C0909a c0909a, C0916h c0916h) {
        this.f18617a = str;
        this.f18618b = c0909a;
        this.c = c0916h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1925b)) {
            return false;
        }
        C1925b c1925b = (C1925b) obj;
        return j.b(this.f18617a, c1925b.f18617a) && j.b(this.f18618b, c1925b.f18618b) && j.b(this.c, c1925b.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.f18618b.hashCode() + (this.f18617a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Error(adUnitId=" + this.f18617a + ", error=" + this.f18618b + ", variables=" + this.c + ")";
    }
}
