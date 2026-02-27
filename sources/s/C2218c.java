package s;

import defpackage.AbstractC1414e;

/* JADX INFO: renamed from: s.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2218c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19966b;
    public final float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19967d;
    public final int e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f19968g;
    public final int h;
    public final int i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f19969k;

    public C2218c(String str, String str2, float f, int i, int i4, float f3, float f7, int i6, int i10, float f10, boolean z4) {
        this.f19965a = str;
        this.f19966b = str2;
        this.c = f;
        this.f19967d = i;
        this.e = i4;
        this.f = f3;
        this.f19968g = f7;
        this.h = i6;
        this.i = i10;
        this.j = f10;
        this.f19969k = z4;
    }

    public final int hashCode() {
        int iC = ((AbstractC2217b.c(this.f19967d) + (((int) (AbstractC1414e.c(this.f19965a.hashCode() * 31, 31, this.f19966b) + this.c)) * 31)) * 31) + this.e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((iC * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.h;
    }
}
