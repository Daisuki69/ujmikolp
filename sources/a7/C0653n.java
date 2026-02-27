package a7;

import android.graphics.drawable.Drawable;
import defpackage.AbstractC1414e;

/* JADX INFO: renamed from: a7.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0653n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7033b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7034d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7035g;
    public final String h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f7036k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7037l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f7039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Drawable f7040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f7041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f7045u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f7046v;

    public C0653n(String str, int i, int i4, int i6, int i10, int i11, int i12, String str2, int i13, int i14, int i15, int i16, int i17, int i18, Drawable drawable, Drawable drawable2, int i19, int i20, int i21, int i22, int i23, int i24) {
        this.f7032a = str;
        this.f7033b = i;
        this.c = i4;
        this.f7034d = i6;
        this.e = i10;
        this.f = i11;
        this.f7035g = i12;
        this.h = str2;
        this.i = i13;
        this.j = i14;
        this.f7036k = i15;
        this.f7037l = i16;
        this.m = i17;
        this.f7038n = i18;
        this.f7039o = drawable;
        this.f7040p = drawable2;
        this.f7041q = i19;
        this.f7042r = i20;
        this.f7043s = i21;
        this.f7044t = i22;
        this.f7045u = i23;
        this.f7046v = i24;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0653n)) {
            return false;
        }
        C0653n c0653n = (C0653n) obj;
        return kotlin.jvm.internal.j.b(this.f7032a, c0653n.f7032a) && this.f7033b == c0653n.f7033b && this.c == c0653n.c && this.f7034d == c0653n.f7034d && this.e == c0653n.e && this.f == c0653n.f && this.f7035g == c0653n.f7035g && kotlin.jvm.internal.j.b(this.h, c0653n.h) && this.i == c0653n.i && this.j == c0653n.j && this.f7036k == c0653n.f7036k && this.f7037l == c0653n.f7037l && this.m == c0653n.m && this.f7038n == c0653n.f7038n && kotlin.jvm.internal.j.b(this.f7039o, c0653n.f7039o) && kotlin.jvm.internal.j.b(this.f7040p, c0653n.f7040p) && this.f7041q == c0653n.f7041q && this.f7042r == c0653n.f7042r && this.f7043s == c0653n.f7043s && this.f7044t == c0653n.f7044t && this.f7045u == c0653n.f7045u && this.f7046v == c0653n.f7046v;
    }

    public final int hashCode() {
        int iC = (((((((((((AbstractC1414e.c(((((((((((((this.f7032a.hashCode() * 31) + this.f7033b) * 31) + this.c) * 31) + this.f7034d) * 31) + this.e) * 31) + this.f) * 31) + this.f7035g) * 31, 31, this.h) + this.i) * 31) + this.j) * 31) + this.f7036k) * 31) + this.f7037l) * 31) + this.m) * 31) + this.f7038n) * 31;
        Drawable drawable = this.f7039o;
        int iHashCode = (iC + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f7040p;
        return ((((((((((((iHashCode + (drawable2 != null ? drawable2.hashCode() : 0)) * 31) + this.f7041q) * 31) + this.f7042r) * 31) + this.f7043s) * 31) + this.f7044t) * 31) + this.f7045u) * 31) + this.f7046v;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExpandableContainerViewAttrs(titleText=");
        sb2.append(this.f7032a);
        sb2.append(", titlePadding=");
        sb2.append(this.f7033b);
        sb2.append(", titlePaddingStart=");
        sb2.append(this.c);
        sb2.append(", titlePaddingEnd=");
        sb2.append(this.f7034d);
        sb2.append(", titlePaddingTop=");
        sb2.append(this.e);
        sb2.append(", titlePaddingBottom=");
        sb2.append(this.f);
        sb2.append(", titleTextAppearance=");
        sb2.append(this.f7035g);
        sb2.append(", titleTwoText=");
        sb2.append(this.h);
        sb2.append(", titleTwoPadding=");
        sb2.append(this.i);
        sb2.append(", titleTwoPaddingStart=");
        sb2.append(this.j);
        sb2.append(", titleTwoPaddingEnd=");
        sb2.append(this.f7036k);
        sb2.append(", titleTwoPaddingTop=");
        sb2.append(this.f7037l);
        sb2.append(", titleTwoPaddingBottom=");
        sb2.append(this.m);
        sb2.append(", titleTwoTextAppearance=");
        sb2.append(this.f7038n);
        sb2.append(", collapsedIcon=");
        sb2.append(this.f7039o);
        sb2.append(", expandedIcon=");
        sb2.append(this.f7040p);
        sb2.append(", iconPadding=");
        sb2.append(this.f7041q);
        sb2.append(", iconPaddingStart=");
        sb2.append(this.f7042r);
        sb2.append(", iconPaddingEnd=");
        sb2.append(this.f7043s);
        sb2.append(", iconPaddingTop=");
        sb2.append(this.f7044t);
        sb2.append(", iconPaddingBottom=");
        sb2.append(this.f7045u);
        sb2.append(", contentLayout=");
        return We.s.o(sb2, ")", this.f7046v);
    }
}
