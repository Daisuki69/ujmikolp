package A;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import dOYHB6.tiZVw8.numX49;
import n.C1880g;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1880g f3a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f5d;
    public final Interpolator e;
    public final Interpolator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f6g;
    public Float h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f9n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f10o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f11p;

    public a(C1880g c1880g, Object obj, Object obj2, Interpolator interpolator, float f, Float f3) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.f7k = 784923401;
        this.f8l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f9n = Float.MIN_VALUE;
        this.f10o = null;
        this.f11p = null;
        this.f3a = c1880g;
        this.f4b = obj;
        this.c = obj2;
        this.f5d = interpolator;
        this.e = null;
        this.f = null;
        this.f6g = f;
        this.h = f3;
    }

    public final float a() {
        C1880g c1880g = this.f3a;
        if (c1880g == null) {
            return 1.0f;
        }
        if (this.f9n == Float.MIN_VALUE) {
            if (this.h == null) {
                this.f9n = 1.0f;
            } else {
                this.f9n = ((this.h.floatValue() - this.f6g) / (c1880g.f18464l - c1880g.f18463k)) + b();
            }
        }
        return this.f9n;
    }

    public final float b() {
        C1880g c1880g = this.f3a;
        if (c1880g == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            float f = c1880g.f18463k;
            this.m = (this.f6g - f) / (c1880g.f18464l - f);
        }
        return this.m;
    }

    public final boolean c() {
        return this.f5d == null && this.e == null && this.f == null;
    }

    public final String toString() {
        return numX49.tnTj78("PBP") + this.f4b + numX49.tnTj78("PBb") + this.c + numX49.tnTj78("PB2") + this.f6g + numX49.tnTj78("PBL") + this.h + numX49.tnTj78("PBr") + this.f5d + '}';
    }

    public a(C1880g c1880g, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.f7k = 784923401;
        this.f8l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f9n = Float.MIN_VALUE;
        this.f10o = null;
        this.f11p = null;
        this.f3a = c1880g;
        this.f4b = obj;
        this.c = obj2;
        this.f5d = null;
        this.e = interpolator;
        this.f = interpolator2;
        this.f6g = f;
        this.h = null;
    }

    public a(C1880g c1880g, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f3) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.f7k = 784923401;
        this.f8l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f9n = Float.MIN_VALUE;
        this.f10o = null;
        this.f11p = null;
        this.f3a = c1880g;
        this.f4b = obj;
        this.c = obj2;
        this.f5d = interpolator;
        this.e = interpolator2;
        this.f = interpolator3;
        this.f6g = f;
        this.h = f3;
    }

    public a(Object obj) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.f7k = 784923401;
        this.f8l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f9n = Float.MIN_VALUE;
        this.f10o = null;
        this.f11p = null;
        this.f3a = null;
        this.f4b = obj;
        this.c = obj;
        this.f5d = null;
        this.e = null;
        this.f = null;
        this.f6g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }
}
