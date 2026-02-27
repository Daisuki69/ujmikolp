package q;

import We.s;
import android.graphics.PointF;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import z.AbstractC2543e;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends k {
    public final /* synthetic */ int i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List list, int i) {
        super(list);
        this.i = i;
        switch (i) {
            case 1:
                super(list);
                this.j = new PointF();
                break;
            case 2:
                super(list);
                this.j = new A.d();
                break;
            default:
                u.c cVar = (u.c) ((A.a) list.get(0)).f4b;
                int length = cVar != null ? cVar.f20215b.length : 0;
                this.j = new u.c(new float[length], new int[length]);
                break;
        }
    }

    @Override // q.e
    public final Object g(A.a aVar, float f) {
        Object obj;
        switch (this.i) {
            case 0:
                u.c cVar = (u.c) aVar.f4b;
                u.c cVar2 = (u.c) aVar.c;
                u.c cVar3 = (u.c) this.j;
                cVar3.getClass();
                int[] iArr = cVar.f20215b;
                int length = iArr.length;
                int[] iArr2 = cVar2.f20215b;
                if (length != iArr2.length) {
                    StringBuilder sb2 = new StringBuilder(numX49.tnTj78("b27b"));
                    sb2.append(iArr.length);
                    sb2.append(numX49.tnTj78("b272"));
                    throw new IllegalArgumentException(s.o(sb2, numX49.tnTj78("b27L"), iArr2.length));
                }
                for (int i = 0; i < iArr.length; i++) {
                    cVar3.f20214a[i] = AbstractC2543e.d(cVar.f20214a[i], cVar2.f20214a[i], f);
                    cVar3.f20215b[i] = X5.f.l(f, iArr[i], iArr2[i]);
                }
                return cVar3;
            case 1:
                return l(aVar, f, f);
            default:
                Object obj2 = aVar.f4b;
                if (obj2 == null || (obj = aVar.c) == null) {
                    throw new IllegalStateException(numX49.tnTj78("b27P"));
                }
                A.d dVar = (A.d) obj2;
                A.d dVar2 = (A.d) obj;
                A.c cVar4 = this.e;
                if (cVar4 != null) {
                    aVar.h.getClass();
                    e();
                    A.d dVar3 = (A.d) cVar4.b(dVar, dVar2);
                    if (dVar3 != null) {
                        return dVar3;
                    }
                }
                float fD = AbstractC2543e.d(dVar.f16a, dVar2.f16a, f);
                float fD2 = AbstractC2543e.d(dVar.f17b, dVar2.f17b, f);
                A.d dVar4 = (A.d) this.j;
                dVar4.f16a = fD;
                dVar4.f17b = fD2;
                return dVar4;
        }
    }

    @Override // q.e
    public /* bridge */ /* synthetic */ Object h(A.a aVar, float f, float f3, float f7) {
        switch (this.i) {
            case 1:
                return l(aVar, f3, f7);
            default:
                return super.h(aVar, f, f3, f7);
        }
    }

    public PointF l(A.a aVar, float f, float f3) {
        Object obj;
        Object obj2 = aVar.f4b;
        if (obj2 == null || (obj = aVar.c) == null) {
            throw new IllegalStateException(numX49.tnTj78("b27r"));
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        A.c cVar = this.e;
        if (cVar != null) {
            aVar.h.getClass();
            e();
            PointF pointF3 = (PointF) cVar.b(pointF, pointF2);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = (PointF) this.j;
        float f7 = pointF.x;
        float fA = s.a(pointF2.x, f7, f, f7);
        float f10 = pointF.y;
        pointF4.set(fA, s.a(pointF2.y, f10, f3, f10));
        return pointF4;
    }
}
