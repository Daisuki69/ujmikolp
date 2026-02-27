package bg;

import M8.C0376l;
import ag.AbstractC0693c;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import bj.C1034e;
import bj.InterfaceC1033d;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: bg.Q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0978Q extends AbstractC0693c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0960E f8847A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0960E f8848B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0960E f8849C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0960E f8850D;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0960E f8851g;
    public static final C0960E h;
    public static final C0960E i;
    public static final C0960E j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0960E f8852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0960E f8853l;
    public static final C0960E m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0960E f8854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0960E f8855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0960E f8856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0960E f8857q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0960E f8858r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0960E f8859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0960E f8860t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0960E f8861u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0960E f8862v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0960E f8863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0960E f8864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0960E f8865y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0960E f8866z;
    public final InterfaceC1033d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1033d f8867d;
    public final n0 e;
    public final C0965G0 f;

    static {
        List listC = cj.r.c("android.permission.ACCESS_NETWORK_STATE");
        List empty = Collections.EMPTY_LIST;
        kotlin.jvm.internal.j.c(empty, "empty");
        f8851g = new C0960E(1, empty, listC, 23, 0, 112);
        h = new C0960E(2, empty, listC, 28, 0, 112);
        i = new C0960E(3, empty, listC, 23, 0, 112);
        j = new C0960E(4, empty, listC, 23, 0, 112);
        f8852k = new C0960E(5, empty, listC, 28, 0, 112);
        f8853l = new C0960E(6, empty, listC, 28, 0, 112);
        m = new C0960E(7, empty, listC, 23, 0, 112);
        f8854n = new C0960E(8, empty, listC, 23, 0, 112);
        f8855o = new C0960E(9, empty, listC, 30, 0, 112);
        f8856p = new C0960E(10, empty, listC, 23, 0, 112);
        f8857q = new C0960E(11, empty, listC, 23, 0, 112);
        f8858r = new C0960E(12, empty, listC, 23, 0, 112);
        f8859s = new C0960E(13, empty, listC, 23, 0, 112);
        f8860t = new C0960E(14, empty, listC, 0, 0, 120);
        f8861u = new C0960E(15, empty, listC, 0, 0, 120);
        f8862v = new C0960E(16, empty, listC, 0, 0, 120);
        f8863w = new C0960E(17, empty, listC, 27, 0, 112);
        f8864x = new C0960E(18, empty, listC, 0, 0, 120);
        f8865y = new C0960E(19, empty, listC, 0, 0, 120);
        f8866z = new C0960E(20, empty, listC, 23, 0, 112);
        f8847A = new C0960E(21, empty, listC, 23, 0, 112);
        f8848B = new C0960E(22, empty, listC, 29, 0, 112);
        f8849C = new C0960E(23, empty, listC, 0, 0, 120);
        f8850D = new C0960E(24, empty, listC, 23, 0, 112);
    }

    public C0978Q(Context context, n0 n0Var, C0965G0 c0965g0) {
        super(context, 1);
        this.e = n0Var;
        this.f = c0965g0;
        this.c = C1034e.b(new C1007k(context, 12));
        this.f8867d = C1034e.b(new C0376l(this, 18));
    }

    public static final ConnectivityManager i(C0978Q c0978q) {
        return (ConnectivityManager) c0978q.c.getValue();
    }

    public static final String j(C0978Q c0978q, int i4) {
        NetworkCapabilities networkCapabilitiesH = c0978q.h();
        Boolean boolValueOf = networkCapabilitiesH != null ? Boolean.valueOf(networkCapabilitiesH.hasCapability(i4)) : null;
        return String.valueOf(boolValueOf != null ? Integer.valueOf(boolValueOf.booleanValue() ? 1 : 0) : null);
    }

    public static final String k(C0978Q c0978q, int i4) {
        NetworkCapabilities networkCapabilitiesH = c0978q.h();
        Boolean boolValueOf = networkCapabilitiesH != null ? Boolean.valueOf(networkCapabilitiesH.hasTransport(i4)) : null;
        return String.valueOf(boolValueOf != null ? Integer.valueOf(boolValueOf.booleanValue() ? 1 : 0) : null);
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C0993d(this.e, this.f7197a, this.f, 1);
    }

    public final NetworkCapabilities h() {
        return (NetworkCapabilities) this.f8867d.getValue();
    }
}
