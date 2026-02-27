package p;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import androidx.camera.video.AudioStats;
import bg.C1006j0;
import java.util.ArrayList;
import java.util.List;
import n.v;
import q.InterfaceC2157a;
import s.AbstractC2217b;
import s.C2221f;
import v.AbstractC2327b;
import z.AbstractC2543e;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements m, InterfaceC2157a, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18988b;
    public final n.s c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18989d;
    public final boolean e;
    public final q.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q.e f18990g;
    public final q.i h;
    public final q.i i;
    public final q.i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q.i f18991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q.i f18992l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18993n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f18987a = new Path();
    public final C1006j0 m = new C1006j0();

    public n(n.s sVar, AbstractC2327b abstractC2327b, u.h hVar) {
        this.c = sVar;
        this.f18988b = hVar.f20231a;
        int i = hVar.f20232b;
        this.f18989d = i;
        this.e = hVar.j;
        q.e eVarF = hVar.c.f();
        this.f = (q.i) eVarF;
        q.e eVarF2 = hVar.f20233d.f();
        this.f18990g = eVarF2;
        q.e eVarF3 = hVar.e.f();
        this.h = (q.i) eVarF3;
        q.e eVarF4 = hVar.f20234g.f();
        this.j = (q.i) eVarF4;
        q.e eVarF5 = hVar.i.f();
        this.f18992l = (q.i) eVarF5;
        if (i == 1) {
            this.i = (q.i) hVar.f.f();
            this.f18991k = (q.i) hVar.h.f();
        } else {
            this.i = null;
            this.f18991k = null;
        }
        abstractC2327b.f(eVarF);
        abstractC2327b.f(eVarF2);
        abstractC2327b.f(eVarF3);
        abstractC2327b.f(eVarF4);
        abstractC2327b.f(eVarF5);
        if (i == 1) {
            abstractC2327b.f(this.i);
            abstractC2327b.f(this.f18991k);
        }
        eVarF.a(this);
        eVarF2.a(this);
        eVarF3.a(this);
        eVarF4.a(this);
        eVarF5.a(this);
        if (i == 1) {
            this.i.a(this);
            this.f18991k.a(this);
        }
    }

    @Override // q.InterfaceC2157a
    public final void a() {
        this.f18993n = false;
        this.c.invalidateSelf();
    }

    @Override // p.c
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.c == 1) {
                    this.m.f9018a.add(sVar);
                    sVar.c(this);
                }
            }
            i++;
        }
    }

    @Override // s.InterfaceC2222g
    public final void c(C2221f c2221f, int i, ArrayList arrayList, C2221f c2221f2) {
        AbstractC2543e.e(c2221f, i, arrayList, c2221f2, this);
    }

    @Override // s.InterfaceC2222g
    public final void d(ColorFilter colorFilter, A.c cVar) {
        q.i iVar;
        q.i iVar2;
        if (colorFilter == v.f18522r) {
            this.f.k(cVar);
            return;
        }
        if (colorFilter == v.f18523s) {
            this.h.k(cVar);
            return;
        }
        if (colorFilter == v.i) {
            this.f18990g.k(cVar);
            return;
        }
        if (colorFilter == v.f18524t && (iVar2 = this.i) != null) {
            iVar2.k(cVar);
            return;
        }
        if (colorFilter == v.f18525u) {
            this.j.k(cVar);
            return;
        }
        if (colorFilter == v.f18526v && (iVar = this.f18991k) != null) {
            iVar.k(cVar);
        } else if (colorFilter == v.f18527w) {
            this.f18992l.k(cVar);
        }
    }

    @Override // p.c
    public final String getName() {
        return this.f18988b;
    }

    @Override // p.m
    public final Path getPath() {
        float f;
        float f3;
        float f7;
        double d10;
        float f10;
        float f11;
        float f12;
        float f13;
        int i;
        float f14;
        float f15;
        float f16;
        int i4;
        double d11;
        boolean z4 = this.f18993n;
        Path path = this.f18987a;
        if (z4) {
            return path;
        }
        path.reset();
        if (this.e) {
            this.f18993n = true;
            return path;
        }
        int iC = AbstractC2217b.c(this.f18989d);
        q.e eVar = this.f18990g;
        q.i iVar = this.j;
        q.i iVar2 = this.f18992l;
        double dFloatValue = AudioStats.AUDIO_AMPLITUDE_NONE;
        q.i iVar3 = this.h;
        q.i iVar4 = this.f;
        if (iC == 0) {
            float fFloatValue = ((Float) iVar4.f()).floatValue();
            if (iVar3 != null) {
                dFloatValue = ((Float) iVar3.f()).floatValue();
            }
            double radians = Math.toRadians(dFloatValue - 90.0d);
            double d12 = fFloatValue;
            float f17 = (float) (6.283185307179586d / d12);
            float f18 = f17 / 2.0f;
            float f19 = fFloatValue - ((int) fFloatValue);
            if (f19 != 0.0f) {
                f = 2.0f;
                f3 = f18;
                radians += (double) ((1.0f - f19) * f18);
            } else {
                f = 2.0f;
                f3 = f18;
            }
            float fFloatValue2 = ((Float) iVar.f()).floatValue();
            float fFloatValue3 = ((Float) this.i.f()).floatValue();
            q.i iVar5 = this.f18991k;
            float fFloatValue4 = iVar5 != null ? ((Float) iVar5.f()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = iVar2 != null ? ((Float) iVar2.f()).floatValue() / 100.0f : 0.0f;
            if (f19 != 0.0f) {
                float fA = We.s.a(fFloatValue2, fFloatValue3, f19, fFloatValue3);
                double d13 = fA;
                float fCos = (float) (Math.cos(radians) * d13);
                float fSin = (float) (Math.sin(radians) * d13);
                path.moveTo(fCos, fSin);
                f10 = fCos;
                d10 = radians + ((double) ((f17 * f19) / f));
                f7 = f3;
                f11 = fSin;
                f12 = fA;
            } else {
                double d14 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d14);
                float fSin2 = (float) (d14 * Math.sin(radians));
                path.moveTo(fCos2, fSin2);
                f7 = f3;
                d10 = radians + ((double) f7);
                f10 = fCos2;
                f11 = fSin2;
                f12 = 0.0f;
            }
            double dCeil = Math.ceil(d12);
            double d15 = 2.0d;
            double d16 = dCeil * 2.0d;
            float f20 = f11;
            float f21 = f10;
            int i6 = 0;
            boolean z5 = false;
            double d17 = d10;
            while (true) {
                double d18 = i6;
                if (d18 >= d16) {
                    break;
                }
                float f22 = z5 ? fFloatValue2 : fFloatValue3;
                float f23 = (f12 == 0.0f || d18 != d16 - d15) ? f7 : (f17 * f19) / f;
                if (f12 == 0.0f || d18 != d16 - 1.0d) {
                    f13 = f22;
                    i = i6;
                    f14 = f7;
                } else {
                    f13 = f12;
                    f14 = f7;
                    i = i6;
                }
                double d19 = f13;
                float fCos3 = (float) (Math.cos(d17) * d19);
                float fSin3 = (float) (Math.sin(d17) * d19);
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                    f15 = f19;
                    f16 = fCos3;
                } else {
                    f15 = f19;
                    Path path2 = path;
                    float f24 = f20;
                    double dAtan2 = (float) (Math.atan2(f20, f21) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f25 = z5 ? fFloatValue4 : fFloatValue5;
                    float f26 = z5 ? fFloatValue5 : fFloatValue4;
                    float f27 = (z5 ? fFloatValue3 : fFloatValue2) * f25 * 0.47829f;
                    float f28 = fCos4 * f27;
                    float f29 = f27 * fSin4;
                    float f30 = (z5 ? fFloatValue2 : fFloatValue3) * f26 * 0.47829f;
                    float f31 = fCos5 * f30;
                    float f32 = f30 * fSin5;
                    if (f19 != 0.0f) {
                        if (i == 0) {
                            f28 *= f15;
                            f29 *= f15;
                        } else if (d18 == d16 - 1.0d) {
                            f31 *= f15;
                            f32 *= f15;
                        }
                    }
                    f16 = fCos3;
                    path = path2;
                    path.cubicTo(f21 - f28, f24 - f29, f31 + fCos3, fSin3 + f32, f16, fSin3);
                }
                d17 += (double) f23;
                z5 = !z5;
                i6 = i + 1;
                f21 = f16;
                f20 = fSin3;
                f19 = f15;
                f7 = f14;
                d15 = 2.0d;
            }
            PointF pointF = (PointF) eVar.f();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (iC == 1) {
            int iFloor = (int) Math.floor(((Float) iVar4.f()).floatValue());
            if (iVar3 != null) {
                dFloatValue = ((Float) iVar3.f()).floatValue();
            }
            double radians2 = Math.toRadians(dFloatValue - 90.0d);
            double d20 = iFloor;
            float fFloatValue6 = ((Float) iVar2.f()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) iVar.f()).floatValue();
            double d21 = fFloatValue7;
            float fCos6 = (float) (Math.cos(radians2) * d21);
            float fSin6 = (float) (Math.sin(radians2) * d21);
            path.moveTo(fCos6, fSin6);
            double d22 = (float) (6.283185307179586d / d20);
            double dCeil2 = Math.ceil(d20);
            double d23 = radians2 + d22;
            int i10 = 0;
            while (i10 < dCeil2) {
                float fCos7 = (float) (Math.cos(d23) * d21);
                q.e eVar2 = eVar;
                float fSin7 = (float) (Math.sin(d23) * d21);
                if (fFloatValue6 != 0.0f) {
                    i4 = i10;
                    Path path3 = path;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    d11 = d21;
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f33 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f34 = fCos8 * f33;
                    float f35 = f33 * fSin8;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f33;
                    float fSin9 = fSin7 + (f33 * ((float) Math.sin(dAtan24)));
                    path = path3;
                    path.cubicTo(fCos6 - f34, fSin6 - f35, fCos9 + fCos7, fSin9, fCos7, fSin7);
                } else {
                    i4 = i10;
                    d11 = d21;
                    path.lineTo(fCos7, fSin7);
                }
                d23 += d22;
                i10 = i4 + 1;
                fCos6 = fCos7;
                fSin6 = fSin7;
                d21 = d11;
                eVar = eVar2;
            }
            PointF pointF2 = (PointF) eVar.f();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.m.c(path);
        this.f18993n = true;
        return path;
    }
}
