package P0;

import android.graphics.RectF;
import bg.AbstractC0983W;
import com.google.firebase.messaging.r;
import com.shockwave.pdfium.util.SizeF;
import d4.AbstractC1331a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f4956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4957b;
    public float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4958d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f4959g;
    public float h;
    public final RectF i = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public final int j;

    public h(f fVar) {
        this.f4956a = fVar;
        this.j = (int) AbstractC1331a.j(fVar.getContext(), 1, 20);
    }

    public final int a(int i, int i4, int i6, int i10, int i11, int i12) {
        boolean z4;
        S0.b bVar;
        S0.b bVar2;
        boolean z5;
        int i13 = 0;
        for (int i14 = i4; i14 <= i6; i14++) {
            for (int i15 = i10; i15 <= i11; i15++) {
                float f = this.e;
                float f3 = this.f;
                float f7 = i15 * f;
                float f10 = i14 * f3;
                float f11 = this.f4959g;
                float f12 = this.h;
                if (f7 + f > 1.0f) {
                    f = 1.0f - f7;
                }
                if (f10 + f3 > 1.0f) {
                    f3 = 1.0f - f10;
                }
                float f13 = f11 * f;
                float f14 = f12 * f3;
                RectF rectF = new RectF(f7, f10, f + f7, f3 + f10);
                if (f13 <= 0.0f || f14 <= 0.0f) {
                    z4 = false;
                } else {
                    r rVar = this.f4956a.f4937d;
                    int i16 = this.f4957b;
                    rVar.getClass();
                    S0.b bVar3 = new S0.b(i, null, rectF, false, 0);
                    synchronized (rVar.e) {
                        try {
                            Iterator it = ((PriorityQueue) rVar.f9803b).iterator();
                            while (true) {
                                bVar = null;
                                if (!it.hasNext()) {
                                    bVar2 = null;
                                    break;
                                }
                                bVar2 = (S0.b) it.next();
                                if (bVar2.equals(bVar3)) {
                                    break;
                                }
                            }
                            z4 = true;
                            if (bVar2 != null) {
                                ((PriorityQueue) rVar.f9803b).remove(bVar2);
                                bVar2.e = i16;
                                ((PriorityQueue) rVar.c).offer(bVar2);
                                z5 = true;
                            } else {
                                Iterator it2 = ((PriorityQueue) rVar.c).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    S0.b bVar4 = (S0.b) it2.next();
                                    if (bVar4.equals(bVar3)) {
                                        bVar = bVar4;
                                        break;
                                    }
                                }
                                z5 = bVar != null;
                            }
                        } finally {
                        }
                    }
                    if (!z5) {
                        f fVar = this.f4956a;
                        fVar.f4942o.a(i, f13, f14, rectF, false, this.f4957b, fVar.f4925P);
                    }
                    this.f4957b++;
                }
                if (z4) {
                    i13++;
                }
                if (i13 >= i12) {
                    return i13;
                }
            }
        }
        return i13;
    }

    public final void b() {
        float f;
        float fE;
        float f3;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        h hVar = this;
        hVar.f4957b = 1;
        float currentXOffset = hVar.f4956a.getCurrentXOffset();
        float f14 = 0.0f;
        if (currentXOffset > 0.0f) {
            currentXOffset = 0.0f;
        }
        hVar.c = -currentXOffset;
        float currentYOffset = hVar.f4956a.getCurrentYOffset();
        if (currentYOffset > 0.0f) {
            currentYOffset = 0.0f;
        }
        hVar.f4958d = -currentYOffset;
        float f15 = hVar.j;
        float f16 = -hVar.c;
        float f17 = f16 + f15;
        float width = (f16 - hVar.f4956a.getWidth()) - f15;
        float f18 = -hVar.f4958d;
        float f19 = f18 + f15;
        float height = (f18 - hVar.f4956a.getHeight()) - f15;
        if (f17 > 0.0f) {
            f17 = 0.0f;
        }
        float f20 = -f17;
        if (f19 > 0.0f) {
            f19 = 0.0f;
        }
        float f21 = -f19;
        if (width > 0.0f) {
            width = 0.0f;
        }
        float f22 = -width;
        if (height > 0.0f) {
            height = 0.0f;
        }
        float f23 = -height;
        f fVar = hVar.f4956a;
        boolean z4 = fVar.f4949v;
        float f24 = z4 ? f21 : f20;
        float f25 = z4 ? f23 : f22;
        int iC = fVar.f4938g.c(f24, fVar.getZoom());
        int iC2 = fVar.f4938g.c(f25, fVar.getZoom());
        int i = (iC2 - iC) + 1;
        LinkedList<g> linkedList = new LinkedList();
        int i4 = iC;
        while (i4 <= iC2) {
            g gVar = new g();
            float f26 = f14;
            F3.a aVar = new F3.a(2);
            gVar.f4954b = aVar;
            F3.a aVar2 = new F3.a(3);
            gVar.c = aVar2;
            F3.a aVar3 = new F3.a(3);
            gVar.f4955d = aVar3;
            gVar.f4953a = i4;
            if (i4 != iC) {
                f = f20;
                if (i4 == iC2) {
                    float fE2 = fVar.f4938g.e(fVar.getZoom(), i4);
                    if (fVar.f4949v) {
                        f11 = fE2;
                        fE2 = f;
                    } else {
                        f11 = f21;
                    }
                    f10 = fE2;
                    fE = f11;
                    f3 = f22;
                    f7 = f23;
                } else {
                    fE = fVar.f4938g.e(fVar.getZoom(), i4);
                    SizeF sizeFG = fVar.f4938g.g(fVar.getZoom(), i4);
                    if (fVar.f4949v) {
                        f7 = fE + sizeFG.f15516b;
                        f3 = f22;
                        f10 = f;
                    } else {
                        f3 = fE + sizeFG.f15515a;
                        f7 = f23;
                        f10 = fE;
                        fE = f21;
                    }
                }
            } else if (i == 1) {
                f = f20;
                f10 = f;
                f3 = f22;
                fE = f21;
                f7 = f23;
            } else {
                f = f20;
                float fE3 = fVar.f4938g.e(fVar.getZoom(), i4);
                SizeF sizeFG2 = fVar.f4938g.g(fVar.getZoom(), i4);
                if (fVar.f4949v) {
                    f13 = fE3 + sizeFG2.f15516b;
                    f12 = f22;
                } else {
                    f12 = fE3 + sizeFG2.f15515a;
                    f13 = f23;
                }
                f7 = f13;
                fE = f21;
                f10 = f;
                f3 = f12;
            }
            float f27 = f3;
            SizeF sizeFF = fVar.f4938g.f(gVar.f4953a);
            float f28 = 1.0f / sizeFF.f15515a;
            float zoom = ((1.0f / sizeFF.f15516b) * 256.0f) / fVar.getZoom();
            float zoom2 = (f28 * 256.0f) / fVar.getZoom();
            float f29 = f22;
            float f30 = f21;
            aVar.f1542b = ((int) (((double) (1.0f / zoom)) + 16384.999999999996d)) - 16384;
            aVar.c = ((int) (((double) (1.0f / zoom2)) + 16384.999999999996d)) - 16384;
            SizeF sizeFG3 = fVar.f4938g.g(fVar.getZoom(), gVar.f4953a);
            float f31 = sizeFG3.f15516b / aVar.f1542b;
            float f32 = sizeFG3.f15515a / aVar.c;
            float fH = fVar.f4938g.h(fVar.getZoom(), i4);
            if (fVar.f4949v) {
                aVar2.f1542b = AbstractC0983W.k(Math.abs(fE - fVar.f4938g.e(fVar.getZoom(), gVar.f4953a)) / f31);
                float f33 = f10 - fH;
                if (f33 < f26) {
                    f33 = f26;
                }
                aVar2.c = AbstractC0983W.k(f33 / f32);
                aVar3.f1542b = ((int) (((double) (Math.abs(f7 - fVar.f4938g.e(fVar.getZoom(), gVar.f4953a)) / f31)) + 16384.999999999996d)) - 16384;
                float f34 = f27 - fH;
                if (f34 < f26) {
                    f34 = f26;
                }
                aVar3.c = AbstractC0983W.k(f34 / f32);
            } else {
                aVar2.c = AbstractC0983W.k(Math.abs(f10 - fVar.f4938g.e(fVar.getZoom(), gVar.f4953a)) / f32);
                float f35 = fE - fH;
                if (f35 < f26) {
                    f35 = f26;
                }
                aVar2.f1542b = AbstractC0983W.k(f35 / f31);
                aVar3.c = AbstractC0983W.k(Math.abs(f27 - fVar.f4938g.e(fVar.getZoom(), gVar.f4953a)) / f32);
                float f36 = f7 - fH;
                if (f36 < f26) {
                    f36 = f26;
                }
                aVar3.f1542b = AbstractC0983W.k(f36 / f31);
            }
            linkedList.add(gVar);
            i4++;
            f14 = f26;
            f20 = f;
            f21 = f30;
            f22 = f29;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            int i6 = ((g) it.next()).f4953a;
            SizeF sizeFF2 = hVar.f4956a.f4938g.f(i6);
            float f37 = sizeFF2.f15515a * 0.3f;
            float f38 = sizeFF2.f15516b * 0.3f;
            r rVar = hVar.f4956a.f4937d;
            RectF rectF = hVar.i;
            rVar.getClass();
            S0.b bVar = new S0.b(i6, null, rectF, true, 0);
            synchronized (((ArrayList) rVar.f9804d)) {
                try {
                    Iterator it2 = ((ArrayList) rVar.f9804d).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((S0.b) it2.next()).equals(bVar)) {
                                break;
                            }
                        } else {
                            f fVar2 = hVar.f4956a;
                            fVar2.f4942o.a(i6, f37, f38, hVar.i, true, 0, fVar2.f4925P);
                            break;
                        }
                    }
                } finally {
                }
            }
        }
        int iA = 0;
        for (g gVar2 : linkedList) {
            F3.a aVar4 = gVar2.f4954b;
            float f39 = 1.0f / aVar4.c;
            hVar.e = f39;
            float f40 = 1.0f / aVar4.f1542b;
            hVar.f = f40;
            hVar.f4959g = 256.0f / f39;
            hVar.h = 256.0f / f40;
            int i10 = gVar2.f4953a;
            F3.a aVar5 = gVar2.c;
            int i11 = aVar5.f1542b;
            F3.a aVar6 = gVar2.f4955d;
            iA += hVar.a(i10, i11, aVar6.f1542b, aVar5.c, aVar6.c, 120 - iA);
            if (iA >= 120) {
                return;
            } else {
                hVar = this;
            }
        }
    }
}
