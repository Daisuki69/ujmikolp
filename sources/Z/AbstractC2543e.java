package z;

import We.s;
import android.graphics.PointF;
import java.util.ArrayList;
import p.k;
import s.C2221f;

/* JADX INFO: renamed from: z.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2543e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PointF f21340a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f3, float f7) {
        return Math.max(f3, Math.min(f7, f));
    }

    public static int c(float f, float f3) {
        int i = (int) f;
        int i4 = (int) f3;
        int i6 = i / i4;
        int i10 = i % i4;
        if (!((i ^ i4) >= 0) && i10 != 0) {
            i6--;
        }
        return i - (i4 * i6);
    }

    public static float d(float f, float f3, float f7) {
        return s.a(f3, f, f7, f);
    }

    public static void e(C2221f c2221f, int i, ArrayList arrayList, C2221f c2221f2, k kVar) {
        if (c2221f.a(i, kVar.getName())) {
            String name = kVar.getName();
            C2221f c2221f3 = new C2221f(c2221f2);
            c2221f3.f19975a.add(name);
            C2221f c2221f4 = new C2221f(c2221f3);
            c2221f4.f19976b = kVar;
            arrayList.add(c2221f4);
        }
    }
}
