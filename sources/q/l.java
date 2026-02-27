package q;

import We.C0600d;
import android.graphics.Path;
import android.graphics.PointF;
import n.C1880g;
import z.AbstractC2544f;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends A.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Path f19728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final A.a f19729r;

    public l(C1880g c1880g, A.a aVar) {
        super(c1880g, aVar.f4b, aVar.c, aVar.f5d, aVar.e, aVar.f, aVar.f6g, aVar.h);
        this.f19729r = aVar;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.c;
        Object obj3 = this.f4b;
        boolean z4 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.c) == null || z4) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        A.a aVar = this.f19729r;
        PointF pointF3 = aVar.f10o;
        PointF pointF4 = aVar.f11p;
        C0600d c0600d = AbstractC2544f.f21341a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f3 = pointF.y + pointF3.y;
            float f7 = pointF2.x;
            float f10 = f7 + pointF4.x;
            float f11 = pointF2.y;
            path.cubicTo(f, f3, f10, f11 + pointF4.y, f7, f11);
        }
        this.f19728q = path;
    }
}
