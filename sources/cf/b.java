package Cf;

import yf.d;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Df.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f763a;

    public b(d dVar) {
        this.f763a = dVar;
    }

    @Override // Df.c
    public final yf.b c() {
        return this.f763a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f763a == this.f763a;
    }

    public final int hashCode() {
        return this.f763a.hashCode();
    }
}
