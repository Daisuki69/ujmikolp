package bg;

import ag.AbstractC0693c;
import android.content.Context;
import cj.C1112C;

/* JADX INFO: renamed from: bg.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1016t extends AbstractC0693c {
    public static final C0960E i;
    public static final C0960E j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0960E f9117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0960E f9118l;
    public static final C0960E m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0960E f9119n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0960E f9120o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0960E f9121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0960E f9122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0960E f9123r;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9124d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f9125g;
    public final Xf.b h;

    static {
        C1112C c1112c = C1112C.f9377a;
        i = new C0960E(1, c1112c, c1112c, 0, 0, 120);
        j = new C0960E(2, c1112c, c1112c, 0, 0, 120);
        f9117k = new C0960E(3, c1112c, c1112c, 0, 0, 120);
        f9118l = new C0960E(4, c1112c, c1112c, 0, 0, 120);
        m = new C0960E(5, c1112c, c1112c, 0, 0, 120);
        f9119n = new C0960E(6, c1112c, c1112c, 0, 0, 120);
        f9120o = new C0960E(7, c1112c, c1112c, 0, 0, 120);
        f9121p = new C0960E(8, c1112c, c1112c, 0, 0, 120);
        f9122q = new C0960E(9, c1112c, c1112c, 0, 0, 120);
        f9123r = new C0960E(10, c1112c, c1112c, 0, 0, 120);
    }

    public C1016t(Context context, long j6, long j7, String str, Xf.b bVar) {
        super(context, 1);
        this.e = j6;
        this.f = j7;
        this.f9125g = str;
        this.h = bVar;
        this.c = String.valueOf(9);
        this.f9124d = String.valueOf(0);
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C1017u(this.f7197a, this.h);
    }
}
