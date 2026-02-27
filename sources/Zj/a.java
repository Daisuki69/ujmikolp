package Zj;

import android.content.res.Resources;
import android.graphics.Paint;
import ck.d;
import kotlin.jvm.internal.j;
import uj.AbstractC2324c;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6960b;
    public final Paint c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f6961d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f6962g;
    public int h;
    public final d i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ck.b f6963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6964l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f6965n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f6966o;

    public a(d dVar, int i, ck.c size, ck.b shape, long j, boolean z4, d dVar2, float f) {
        d dVar3 = new d(0.0f, 0.0f);
        j.g(size, "size");
        j.g(shape, "shape");
        this.i = dVar;
        this.j = i;
        this.f6963k = shape;
        this.f6964l = j;
        this.m = z4;
        this.f6965n = dVar3;
        this.f6966o = dVar2;
        this.f6959a = size.f9400b;
        float f3 = size.f9399a;
        Resources system = Resources.getSystem();
        j.f(system, "Resources.getSystem()");
        float f7 = f3 * system.getDisplayMetrics().density;
        this.f6960b = f7;
        Paint paint = new Paint();
        this.c = paint;
        this.f = f7;
        this.f6962g = 60.0f;
        this.h = 255;
        Resources system2 = Resources.getSystem();
        j.f(system2, "Resources.getSystem()");
        float f10 = system2.getDisplayMetrics().density * 0.29f;
        AbstractC2324c.f20347a.getClass();
        this.f6961d = ((AbstractC2324c.f20348b.b() * 3 * f10) + f10) * f;
        paint.setColor(i);
    }
}
