package q;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends k {
    public final PointF i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PathMeasure f19730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f19731l;

    public m(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.f19730k = new PathMeasure();
    }

    @Override // q.e
    public final Object g(A.a aVar, float f) {
        l lVar = (l) aVar;
        Path path = lVar.f19728q;
        if (path == null) {
            return (PointF) aVar.f4b;
        }
        A.c cVar = this.e;
        if (cVar != null) {
            lVar.h.getClass();
            Object obj = lVar.c;
            e();
            PointF pointF = (PointF) cVar.b(lVar.f4b, obj);
            if (pointF != null) {
                return pointF;
            }
        }
        l lVar2 = this.f19731l;
        PathMeasure pathMeasure = this.f19730k;
        if (lVar2 != lVar) {
            pathMeasure.setPath(path, false);
            this.f19731l = lVar;
        }
        float length = pathMeasure.getLength() * f;
        float[] fArr = this.j;
        pathMeasure.getPosTan(length, fArr, null);
        PointF pointF2 = this.i;
        pointF2.set(fArr[0], fArr[1]);
        return pointF2;
    }
}
