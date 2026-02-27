package D;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes2.dex */
public final class T {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static T f866r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static String f867s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static String f868t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static String f869u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static String f870v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static String f871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static String f872x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f874b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f875d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f876g;
    public final String h;
    public final String i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f878l;
    public final String[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f881p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f882q;

    public T(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (Throwable unused) {
            bundle = null;
        }
        bundle = bundle == null ? new Bundle() : bundle;
        if (f867s == null) {
            f867s = a(bundle, numX49.tnTj78("PeT"));
        }
        if (f868t == null) {
            f868t = a(bundle, numX49.tnTj78("PeR"));
        }
        if (f869u == null) {
            f869u = a(bundle, numX49.tnTj78("Pep"));
        }
        if (f870v == null) {
            f870v = a(bundle, numX49.tnTj78("Pe0"));
        }
        if (f871w == null) {
            f871w = a(bundle, numX49.tnTj78("Peg"));
        }
        if (f872x == null) {
            f872x = a(bundle, numX49.tnTj78("Pef"));
        }
        this.c = a(bundle, numX49.tnTj78("Pe1"));
        String strA = a(bundle, numX49.tnTj78("Pen"));
        String strTnTj78 = numX49.tnTj78("Pex");
        this.f873a = strTnTj78.equals(strA);
        this.f874b = strTnTj78.equals(a(bundle, numX49.tnTj78("Pes")));
        this.f875d = a(bundle, numX49.tnTj78("Pe5"));
        this.e = strTnTj78.equals(a(bundle, numX49.tnTj78("PeJ")));
        this.f = strTnTj78.equals(a(bundle, numX49.tnTj78("PeI")));
        this.f876g = strTnTj78.equals(a(bundle, numX49.tnTj78("Peq")));
        String strA2 = a(bundle, numX49.tnTj78("Pez"));
        this.h = strA2 != null ? strA2.replace(numX49.tnTj78("Pel"), numX49.tnTj78("PeW")) : strA2;
        int i = 0;
        try {
            int i4 = Integer.parseInt(a(bundle, "CLEVERTAP_ENCRYPTION_LEVEL"));
            if (i4 < 0 || i4 > 1) {
                S.l("Supported encryption levels are only 0 and 1. Setting it to 0 by default");
            } else {
                i = i4;
            }
        } catch (Throwable th2) {
            S.o(numX49.tnTj78("PeP9"), th2.getCause());
        }
        this.f879n = i;
        this.i = a(bundle, numX49.tnTj78("PePP"));
        this.j = strTnTj78.equals(a(bundle, numX49.tnTj78("PePb")));
        this.f877k = a(bundle, numX49.tnTj78("PeP2"));
        this.f878l = a(bundle, numX49.tnTj78("PePL"));
        String strA3 = a(bundle, numX49.tnTj78("PePr"));
        this.m = !TextUtils.isEmpty(strA3) ? strA3.split(numX49.tnTj78("PePZ")) : InterfaceC0191y.f961g;
        this.f880o = a(bundle, numX49.tnTj78("PePk"));
        this.f881p = a(bundle, numX49.tnTj78("PePB"));
        this.f882q = a(bundle, numX49.tnTj78("PePu"));
    }

    public static String a(Bundle bundle, String str) {
        try {
            Object obj = bundle.get(str);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized T b(Context context) {
        try {
            if (f866r == null) {
                f866r = new T(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f866r;
    }
}
