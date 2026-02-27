package v1;

import O1.P;
import O1.S;
import O1.t0;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: v1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2334a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f20423A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public S f20424B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f20425C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f20426D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f20427E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f20428F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f20429G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final SparseArray f20430H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final SparseBooleanArray f20431I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S f20432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20433b;
    public S c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20434d;
    public boolean e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20435g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f20436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20437l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f20438n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20439o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f20440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f20441q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20442r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f20444t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public S f20445u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20446v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20447w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20448x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f20449y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f20450z;

    /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2334a(android.content.Context r8) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.C2334a.<init>(android.content.Context):void");
    }

    public final DefaultTrackSelector$Parameters a() {
        return new DefaultTrackSelector$Parameters(this.f20435g, this.h, this.i, this.j, this.f20436k, this.f20437l, this.m, this.f20438n, this.f20439o, this.f20440p, this.f20441q, this.f20442r, this.f20443s, this.f20444t, this.f20445u, this.f20432a, this.f20433b, this.f20446v, this.f20447w, this.f20448x, this.f20449y, this.f20450z, this.f20423A, this.f20424B, this.c, this.f20434d, this.e, this.f, this.f20425C, this.f20426D, this.f20427E, this.f20428F, this.f20429G, this.f20430H, this.f20431I);
    }

    public final void b(int i) {
        SparseArray sparseArray = this.f20430H;
        Map map = (Map) sparseArray.get(i);
        if (map == null || map.isEmpty()) {
            return;
        }
        sparseArray.remove(i);
    }

    public final void c() {
        this.f20435g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.f20439o = true;
        this.f20440p = false;
        this.f20441q = true;
        this.f20442r = Integer.MAX_VALUE;
        this.f20443s = Integer.MAX_VALUE;
        this.f20444t = true;
        P p10 = S.f4555b;
        t0 t0Var = t0.e;
        this.f20445u = t0Var;
        this.f20446v = Integer.MAX_VALUE;
        this.f20447w = Integer.MAX_VALUE;
        this.f20448x = true;
        this.f20449y = false;
        this.f20450z = false;
        this.f20423A = false;
        this.f20424B = t0Var;
        this.f20425C = false;
        this.f20426D = false;
        this.f20427E = true;
        this.f20428F = false;
        this.f20429G = true;
    }

    public C2334a(boolean z4) {
        P p10 = S.f4555b;
        t0 t0Var = t0.e;
        this.f20432a = t0Var;
        this.f20433b = 0;
        this.c = t0Var;
        this.f20434d = 0;
        this.e = false;
        this.f = 0;
    }

    public C2334a(DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) {
        this.f20432a = defaultTrackSelector$Parameters.f9685a;
        this.f20433b = defaultTrackSelector$Parameters.f9686b;
        this.c = defaultTrackSelector$Parameters.c;
        this.f20434d = defaultTrackSelector$Parameters.f9687d;
        this.e = defaultTrackSelector$Parameters.e;
        this.f = defaultTrackSelector$Parameters.f;
        this.f20435g = defaultTrackSelector$Parameters.f9667g;
        this.h = defaultTrackSelector$Parameters.h;
        this.i = defaultTrackSelector$Parameters.i;
        this.j = defaultTrackSelector$Parameters.j;
        this.f20436k = defaultTrackSelector$Parameters.f9668k;
        this.f20437l = defaultTrackSelector$Parameters.f9669l;
        this.m = defaultTrackSelector$Parameters.m;
        this.f20438n = defaultTrackSelector$Parameters.f9670n;
        this.f20439o = defaultTrackSelector$Parameters.f9671o;
        this.f20440p = defaultTrackSelector$Parameters.f9672p;
        this.f20441q = defaultTrackSelector$Parameters.f9673q;
        this.f20442r = defaultTrackSelector$Parameters.f9674r;
        this.f20443s = defaultTrackSelector$Parameters.f9675s;
        this.f20444t = defaultTrackSelector$Parameters.f9676t;
        this.f20445u = defaultTrackSelector$Parameters.f9677u;
        this.f20446v = defaultTrackSelector$Parameters.f9678v;
        this.f20447w = defaultTrackSelector$Parameters.f9679w;
        this.f20448x = defaultTrackSelector$Parameters.f9680x;
        this.f20449y = defaultTrackSelector$Parameters.f9681y;
        this.f20450z = defaultTrackSelector$Parameters.f9657B;
        this.f20423A = defaultTrackSelector$Parameters.f9658K;
        this.f20424B = defaultTrackSelector$Parameters.f9659P;
        this.f20425C = defaultTrackSelector$Parameters.f9660Q;
        this.f20426D = defaultTrackSelector$Parameters.f9661R;
        this.f20427E = defaultTrackSelector$Parameters.f9662S;
        this.f20428F = defaultTrackSelector$Parameters.f9663T;
        this.f20429G = defaultTrackSelector$Parameters.f9664U;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = defaultTrackSelector$Parameters.f9665V;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.f20430H = sparseArray;
                this.f20431I = defaultTrackSelector$Parameters.f9666W.clone();
                return;
            }
        }
    }

    public C2334a() {
        this(false);
        c();
        this.f20430H = new SparseArray();
        this.f20431I = new SparseBooleanArray();
    }
}
