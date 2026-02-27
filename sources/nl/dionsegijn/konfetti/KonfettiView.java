package nl.dionsegijn.konfetti;

import Zj.b;
import Zj.c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import bk.a;
import cj.I;
import cj.x;
import ck.d;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.ranges.IntRange;
import wj.e;

/* JADX INFO: loaded from: classes2.dex */
public class KonfettiView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18749b;

    public KonfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18748a = new ArrayList();
        b bVar = new b();
        bVar.f6967a = -1L;
        this.f18749b = bVar;
    }

    public final List<c> getActiveSystems() {
        return this.f18748a;
    }

    public final a getOnParticleSystemUpdateListener() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        boolean z4;
        ak.b bVar;
        int i;
        float f3;
        int i4;
        j.g(canvas, "canvas");
        super.onDraw(canvas);
        b bVar2 = this.f18749b;
        if (bVar2.f6967a == -1) {
            bVar2.f6967a = System.nanoTime();
        }
        bVar2.f6967a = System.nanoTime();
        float f7 = 1000;
        float f10 = ((r2 - bVar2.f6967a) / 1000000.0f) / f7;
        ArrayList arrayList = this.f18748a;
        boolean z5 = true;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            c cVar = (c) arrayList.get(size);
            ak.b bVar3 = cVar.h;
            if (bVar3 == null) {
                j.n("renderSystem");
                throw null;
            }
            if (System.currentTimeMillis() - bVar3.f7247l >= cVar.f.c) {
                ak.b bVar4 = cVar.h;
                if (bVar4 == null) {
                    j.n("renderSystem");
                    throw null;
                }
                if (bVar4.f7242a) {
                    ak.c cVar2 = bVar4.f7246k;
                    float f11 = cVar2.e + f10;
                    cVar2.e = f11;
                    float f12 = cVar2.f7250d;
                    if (f11 >= f12 && cVar2.c < 500) {
                        Iterator<Integer> it = new IntRange(1, (int) (f11 / f12), 1).iterator();
                        while (((e) it).c) {
                            ((I) it).nextInt();
                            cVar2.f7249b++;
                            Ta.a aVar = cVar2.f7248a;
                            if (aVar != null) {
                                aVar.invoke();
                            }
                        }
                        cVar2.e %= cVar2.f7250d;
                    }
                    cVar2.c = (f10 * f7) + cVar2.c;
                }
                ArrayList arrayList2 = bVar4.c;
                z4 = true;
                int size2 = arrayList2.size() - 1;
                while (size2 >= 0) {
                    Zj.a aVar2 = (Zj.a) arrayList2.get(size2);
                    aVar2.getClass();
                    d force = bVar4.f;
                    j.g(force, "force");
                    float f13 = 1.0f / aVar2.f6959a;
                    d dVar = aVar2.f6965n;
                    float f14 = (force.f9401a * f13) + dVar.f9401a;
                    dVar.f9401a = f14;
                    float f15 = (force.f9402b * f13) + dVar.f9402b;
                    dVar.f9402b = f15;
                    d dVar2 = aVar2.f6966o;
                    dVar2.f9401a += f14;
                    dVar2.f9402b += f15;
                    float f16 = aVar2.f6962g;
                    float f17 = f10 * f16;
                    d dVar3 = aVar2.i;
                    dVar3.f9401a = (dVar2.f9401a * f17) + dVar3.f9401a;
                    float f18 = (dVar2.f9402b * f17) + dVar3.f9402b;
                    dVar3.f9402b = f18;
                    ak.b bVar5 = bVar4;
                    long j = aVar2.f6964l;
                    if (j <= 0) {
                        if (!aVar2.m || (i4 = aVar2.h - ((int) ((5 * f10) * f16))) < 0) {
                            i4 = 0;
                        }
                        aVar2.h = i4;
                    } else {
                        aVar2.f6964l = j - ((long) (f10 * f7));
                    }
                    float f19 = aVar2.f6961d * f10 * f16;
                    float f20 = aVar2.e + f19;
                    aVar2.e = f20;
                    if (f20 >= SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) {
                        aVar2.e = 0.0f;
                    }
                    float f21 = aVar2.f - f19;
                    aVar2.f = f21;
                    float f22 = 0;
                    float f23 = aVar2.f6960b;
                    if (f21 < f22) {
                        aVar2.f = f23;
                    }
                    if (f18 > canvas.getHeight()) {
                        aVar2.f6964l = 0L;
                    } else {
                        if (dVar3.f9401a <= canvas.getWidth() && dVar3.f9401a + f23 >= f22 && dVar3.f9402b + f23 >= f22) {
                            Paint paint = aVar2.c;
                            paint.setColor((aVar2.h << 24) | (aVar2.j & 16777215));
                            float f24 = 2;
                            float fAbs = Math.abs((aVar2.f / f23) - 0.5f) * f24;
                            bVar = bVar5;
                            float f25 = (fAbs * f23) / f24;
                            int iSave = canvas.save();
                            canvas.translate(dVar3.f9401a - f25, dVar3.f9402b);
                            canvas.rotate(aVar2.e, f25, f23 / f24);
                            canvas.scale(fAbs, 1.0f);
                            aVar2.f6963k.getClass();
                            float f26 = aVar2.f6960b;
                            i = size2;
                            f3 = f7;
                            canvas.drawRect(0.0f, 0.0f, f26, f26, paint);
                            canvas.restoreToCount(iSave);
                        }
                        size2 = i - 1;
                        f7 = f3;
                        bVar4 = bVar;
                    }
                    bVar = bVar5;
                    i = size2;
                    f3 = f7;
                    size2 = i - 1;
                    f7 = f3;
                    bVar4 = bVar;
                }
                f = f7;
                x.s(arrayList2, ak.a.f7241a);
            } else {
                f = f7;
                z4 = z5;
            }
            ak.b bVar6 = cVar.h;
            if (bVar6 == null) {
                j.n("renderSystem");
                throw null;
            }
            ak.c cVar3 = bVar6.f7246k;
            cVar3.getClass();
            ArrayList arrayList3 = bVar6.c;
            if ((cVar3.c >= 500 && arrayList3.size() == 0) || (!bVar6.f7242a && arrayList3.size() == 0)) {
                arrayList.remove(size);
            }
            size--;
            f7 = f;
            z5 = z4;
        }
        if (arrayList.size() != 0) {
            invalidate();
        } else {
            bVar2.f6967a = -1L;
        }
    }

    public final void setOnParticleSystemUpdateListener(a aVar) {
    }
}
