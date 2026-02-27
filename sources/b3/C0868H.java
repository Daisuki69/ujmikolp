package b3;

import java.util.Map;

/* JADX INFO: renamed from: b3.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0868H {
    public static final C0867G Companion = new C0867G();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pj.a[] f8388d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0872L f8389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f8390b;
    public final Map c;

    static {
        Tj.r rVar = Tj.r.f5886a;
        f8388d = new Pj.a[]{null, null, new Tj.g(C0905z.f8505a)};
    }

    public /* synthetic */ C0868H(int i, C0872L c0872l, h0 h0Var, Map map) {
        if (1 != (i & 1)) {
            Tj.m.d(i, 1, C0866F.f8387a.d());
            throw null;
        }
        this.f8389a = c0872l;
        if ((i & 2) == 0) {
            this.f8390b = null;
        } else {
            this.f8390b = h0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static C0868H a(C0868H c0868h, C0872L sessionDetails, h0 h0Var, Map map, int i) {
        if ((i & 1) != 0) {
            sessionDetails = c0868h.f8389a;
        }
        if ((i & 2) != 0) {
            h0Var = c0868h.f8390b;
        }
        if ((i & 4) != 0) {
            map = c0868h.c;
        }
        c0868h.getClass();
        kotlin.jvm.internal.j.g(sessionDetails, "sessionDetails");
        return new C0868H(sessionDetails, h0Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0868H)) {
            return false;
        }
        C0868H c0868h = (C0868H) obj;
        return kotlin.jvm.internal.j.b(this.f8389a, c0868h.f8389a) && kotlin.jvm.internal.j.b(this.f8390b, c0868h.f8390b) && kotlin.jvm.internal.j.b(this.c, c0868h.c);
    }

    public final int hashCode() {
        int iHashCode = this.f8389a.hashCode() * 31;
        h0 h0Var = this.f8390b;
        int iHashCode2 = (iHashCode + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        Map map = this.c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f8389a + ", backgroundTime=" + this.f8390b + ", processDataMap=" + this.c + ')';
    }

    public C0868H(C0872L sessionDetails, h0 h0Var, Map map) {
        kotlin.jvm.internal.j.g(sessionDetails, "sessionDetails");
        this.f8389a = sessionDetails;
        this.f8390b = h0Var;
        this.c = map;
    }
}
