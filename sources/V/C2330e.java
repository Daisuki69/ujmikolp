package v;

import com.google.firebase.messaging.r;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import java.util.Locale;
import n.C1880g;
import t.C2264a;
import t.C2265b;

/* JADX INFO: renamed from: v.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2330e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1880g f20379b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20380d;
    public final int e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20381g;
    public final List h;
    public final t.d i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f20382k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20383l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f20384n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f20385o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f20386p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2264a f20387q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f20388r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C2265b f20389s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f20390t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f20391u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f20392v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p8.a f20393w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Ci.b f20394x;

    public C2330e(List list, C1880g c1880g, String str, long j, int i, long j6, String str2, List list2, t.d dVar, int i4, int i6, int i10, float f, float f3, int i11, int i12, C2264a c2264a, r rVar, List list3, int i13, C2265b c2265b, boolean z4, p8.a aVar, Ci.b bVar) {
        this.f20378a = list;
        this.f20379b = c1880g;
        this.c = str;
        this.f20380d = j;
        this.e = i;
        this.f = j6;
        this.f20381g = str2;
        this.h = list2;
        this.i = dVar;
        this.j = i4;
        this.f20382k = i6;
        this.f20383l = i10;
        this.m = f;
        this.f20384n = f3;
        this.f20385o = i11;
        this.f20386p = i12;
        this.f20387q = c2264a;
        this.f20388r = rVar;
        this.f20390t = list3;
        this.f20391u = i13;
        this.f20389s = c2265b;
        this.f20392v = z4;
        this.f20393w = aVar;
        this.f20394x = bVar;
    }

    public final String a(String str) {
        int i;
        StringBuilder sbW = androidx.camera.core.impl.a.w(str);
        sbW.append(this.c);
        String strTnTj78 = numX49.tnTj78("bL9e");
        sbW.append(strTnTj78);
        C1880g c1880g = this.f20379b;
        C2330e c2330e = (C2330e) c1880g.h.get(this.f);
        if (c2330e != null) {
            sbW.append(numX49.tnTj78("bL98"));
            sbW.append(c2330e.c);
            for (C2330e c2330e2 = (C2330e) c1880g.h.get(c2330e.f); c2330e2 != null; c2330e2 = (C2330e) c1880g.h.get(c2330e2.f)) {
                sbW.append(numX49.tnTj78("bL9C"));
                sbW.append(c2330e2.c);
            }
            sbW.append(str);
            sbW.append(strTnTj78);
        }
        List list = this.h;
        if (!list.isEmpty()) {
            sbW.append(str);
            sbW.append(numX49.tnTj78("bL94"));
            sbW.append(list.size());
            sbW.append(strTnTj78);
        }
        int i4 = this.j;
        if (i4 != 0 && (i = this.f20382k) != 0) {
            sbW.append(str);
            sbW.append(numX49.tnTj78("bL9o"));
            sbW.append(String.format(Locale.US, numX49.tnTj78("bL9K"), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(this.f20383l)));
        }
        List list2 = this.f20378a;
        if (!list2.isEmpty()) {
            sbW.append(str);
            sbW.append(numX49.tnTj78("bL9w"));
            for (Object obj : list2) {
                sbW.append(str);
                sbW.append(numX49.tnTj78("bL9c"));
                sbW.append(obj);
                sbW.append(strTnTj78);
            }
        }
        return sbW.toString();
    }

    public final String toString() {
        return a(numX49.tnTj78("bL9m"));
    }
}
