package x;

import android.graphics.Color;
import android.graphics.PointF;
import dOYHB6.tiZVw8.numX49;
import v.AbstractC2329d;
import y.AbstractC2494a;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements InterfaceC2445C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f20816b = new f(0);
    public static final f c = new f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f20817d = new f(2);
    public static final f e = new f(3);
    public static final f f = new f(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f20818g = new f(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20819a;

    public /* synthetic */ f(int i) {
        this.f20819a = i;
    }

    @Override // x.InterfaceC2445C
    public final Object a(AbstractC2494a abstractC2494a, float f3) {
        switch (this.f20819a) {
            case 0:
                boolean z4 = abstractC2494a.peek() == 1;
                if (z4) {
                    abstractC2494a.b();
                }
                double dM = abstractC2494a.m();
                double dM2 = abstractC2494a.m();
                double dM3 = abstractC2494a.m();
                double dM4 = abstractC2494a.peek() == 7 ? abstractC2494a.m() : 1.0d;
                if (z4) {
                    abstractC2494a.f();
                }
                if (dM <= 1.0d && dM2 <= 1.0d && dM3 <= 1.0d) {
                    dM *= 255.0d;
                    dM2 *= 255.0d;
                    dM3 *= 255.0d;
                    if (dM4 <= 1.0d) {
                        dM4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dM4, (int) dM, (int) dM2, (int) dM3));
            case 1:
                return Float.valueOf(n.d(abstractC2494a) * f3);
            case 2:
                return Integer.valueOf(Math.round(n.d(abstractC2494a) * f3));
            case 3:
                return n.b(abstractC2494a, f3);
            case 4:
                int iPeek = abstractC2494a.peek();
                if (iPeek == 1) {
                    return n.b(abstractC2494a, f3);
                }
                if (iPeek == 3) {
                    return n.b(abstractC2494a, f3);
                }
                if (iPeek != 7) {
                    throw new IllegalArgumentException(numX49.tnTj78("bbNg").concat(AbstractC2329d.k(iPeek)));
                }
                PointF pointF = new PointF(((float) abstractC2494a.m()) * f3, ((float) abstractC2494a.m()) * f3);
                while (abstractC2494a.i()) {
                    abstractC2494a.z();
                }
                return pointF;
            default:
                boolean z5 = abstractC2494a.peek() == 1;
                if (z5) {
                    abstractC2494a.b();
                }
                float fM = (float) abstractC2494a.m();
                float fM2 = (float) abstractC2494a.m();
                while (abstractC2494a.i()) {
                    abstractC2494a.z();
                }
                if (z5) {
                    abstractC2494a.f();
                }
                return new A.d((fM / 100.0f) * f3, (fM2 / 100.0f) * f3);
        }
    }
}
