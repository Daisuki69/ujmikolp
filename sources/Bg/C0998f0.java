package bg;

import ag.AbstractC0693c;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1112C;
import cj.C1132s;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: bg.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0998f0 extends AbstractC0693c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0960E f8947A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0960E f8948B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0960E f8949C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0960E f8950D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0960E f8951E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C0960E f8952F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final C0960E f8953G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final C0960E f8954H;
    public static final C0960E i;
    public static final C0960E j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0960E f8955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0960E f8956l;
    public static final C0960E m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0960E f8957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0960E f8958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0960E f8959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0960E f8960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0960E f8961r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0960E f8962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0960E f8963t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0960E f8964u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0960E f8965v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0960E f8966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0960E f8967x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0960E f8968y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0960E f8969z;
    public final InterfaceC1033d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Configuration f8970d;
    public final InterfaceC1033d e;
    public final InterfaceC1033d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n0 f8971g;
    public final C0965G0 h;

    static {
        cj.r.c("android.permission.READ_PHONE_STATE");
        List permissions = C1132s.g("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
        C1112C permissions2 = C1112C.f9377a;
        i = new C0960E(1, permissions2, null, 0, 0, 124);
        j = new C0960E(2, permissions2, null, 0, 0, 124);
        f8955k = new C0960E(3, permissions2, null, 0, 0, 124);
        f8956l = new C0960E(4, permissions2, null, 0, 0, 124);
        m = new C0960E(5, permissions2, null, 0, 0, 124);
        f8957n = new C0960E(6, permissions2, null, 0, 0, 124);
        f8958o = new C0960E(7, permissions2, null, 0, 0, 124);
        f8959p = new C0960E(8, permissions2, null, 0, 0, 124);
        f8960q = new C0960E(9, permissions2, null, 0, 0, 124);
        f8961r = new C0960E(10, permissions2, null, 0, 0, 124);
        f8962s = new C0960E(11, permissions2, null, 0, 0, 124);
        f8963t = new C0960E(12, permissions2, null, 0, 0, 124);
        kotlin.jvm.internal.j.h(permissions2, "permissions");
        kotlin.jvm.internal.j.h(permissions2, "permissions");
        kotlin.jvm.internal.j.h(permissions2, "permissions");
        kotlin.jvm.internal.j.h(permissions2, "permissions");
        kotlin.jvm.internal.j.h(permissions2, "permissions");
        kotlin.jvm.internal.j.h(permissions2, "permissions");
        kotlin.jvm.internal.j.h(permissions2, "permissions");
        kotlin.jvm.internal.j.h(permissions2, "permissions");
        kotlin.jvm.internal.j.h(permissions2, "permissions");
        kotlin.jvm.internal.j.h(permissions2, "permissions");
        kotlin.jvm.internal.j.h(permissions2, "permissions");
        kotlin.jvm.internal.j.h(permissions, "permissions");
        f8964u = new C0960E(33, permissions2, permissions2, 0, 0, 120);
        f8965v = new C0960E(34, permissions2, permissions2, 25, 0, 112);
        f8966w = new C0960E(35, permissions2, permissions2, 23, 0, 112);
        f8967x = new C0960E(36, permissions2, permissions2, 24, 0, 112);
        f8968y = new C0960E(37, permissions2, null, 0, 0, 124);
        f8969z = new C0960E(38, permissions2, permissions2, 23, 0, 112);
        f8947A = new C0960E(39, permissions2, permissions2, 0, 0, 120);
        f8948B = new C0960E(40, permissions2, permissions2, 0, 0, 120);
        f8949C = new C0960E(41, permissions2, permissions2, 0, 0, 120);
        f8950D = new C0960E(42, permissions2, permissions2, 0, 0, 120);
        f8951E = new C0960E(43, permissions2, permissions2, 23, 0, 112);
        f8952F = new C0960E(44, permissions2, permissions2, 28, 0, 112);
        f8953G = new C0960E(45, permissions2, null, 0, 0, 124);
        f8954H = new C0960E(46, permissions2, null, 0, 0, 124);
    }

    public C0998f0(Context context, n0 n0Var, x0 x0Var, C0965G0 c0965g0) {
        super(context, 1);
        this.f8971g = n0Var;
        this.h = c0965g0;
        this.c = C1034e.b(new C1007k(context, 14));
        Resources system = Resources.getSystem();
        kotlin.jvm.internal.j.c(system, "Resources.getSystem()");
        this.f8970d = system.getConfiguration();
        this.e = C1034e.b(new C1007k(context, 15));
        this.f = C1034e.b(new C1007k(context, 16));
    }

    public static final TelephonyManager h(C0998f0 c0998f0) {
        return (TelephonyManager) c0998f0.c.getValue();
    }

    public static boolean i(String str) {
        String[] strArr = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache", "/data", "/dev"};
        boolean z4 = false;
        for (int i4 = 0; i4 < 14; i4++) {
            try {
                if (new File(strArr[i4], str).exists()) {
                    z4 = true;
                }
            } catch (Exception unused) {
            }
        }
        return z4;
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C0993d(this.f8971g, this.f7197a, this.h, 2);
    }
}
