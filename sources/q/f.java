package q;

import android.graphics.PointF;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import s.C2218c;
import z.AbstractC2543e;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends k {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(List list, int i) {
        super(list);
        this.i = i;
    }

    @Override // q.e
    public final Object g(A.a aVar, float f) {
        Object obj;
        switch (this.i) {
            case 0:
                return Integer.valueOf(l(aVar, f));
            case 1:
                return Integer.valueOf(l(aVar, f));
            default:
                return (f != 1.0f || (obj = aVar.c) == null) ? (C2218c) aVar.f4b : (C2218c) obj;
        }
    }

    public int l(A.a aVar, float f) {
        String strTnTj78 = numX49.tnTj78("b27Z");
        switch (this.i) {
            case 0:
                Object obj = aVar.f4b;
                if (obj == null || aVar.c == null) {
                    throw new IllegalStateException(strTnTj78);
                }
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                Integer num2 = (Integer) aVar.c;
                int iIntValue2 = num2.intValue();
                A.c cVar = this.e;
                if (cVar != null) {
                    aVar.h.getClass();
                    e();
                    Integer num3 = (Integer) cVar.b(num, num2);
                    if (num3 != null) {
                        return num3.intValue();
                    }
                }
                return X5.f.l(AbstractC2543e.b(f, 0.0f, 1.0f), iIntValue, iIntValue2);
            default:
                if (aVar.f4b == null || aVar.c == null) {
                    throw new IllegalStateException(strTnTj78);
                }
                A.c cVar2 = this.e;
                Object obj2 = aVar.f4b;
                if (cVar2 != null) {
                    aVar.h.getClass();
                    Object obj3 = aVar.c;
                    e();
                    Integer num4 = (Integer) cVar2.b(obj2, obj3);
                    if (num4 != null) {
                        return num4.intValue();
                    }
                }
                if (aVar.f7k == 784923401) {
                    aVar.f7k = ((Integer) obj2).intValue();
                }
                int i = aVar.f7k;
                if (aVar.f8l == 784923401) {
                    aVar.f8l = ((Integer) aVar.c).intValue();
                }
                int i4 = aVar.f8l;
                PointF pointF = AbstractC2543e.f21340a;
                return (int) ((f * (i4 - i)) + i);
        }
    }
}
