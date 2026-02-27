package v;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n.s;
import s.C2221f;
import u.l;

/* JADX INFO: renamed from: v.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2332g extends AbstractC2327b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p.d f20395A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C2328c f20396B;

    public C2332g(s sVar, C2330e c2330e, C2328c c2328c) {
        super(sVar, c2330e);
        this.f20396B = c2328c;
        p.d dVar = new p.d(sVar, this, new l(numX49.tnTj78("bL9N"), c2330e.f20378a, false));
        this.f20395A = dVar;
        List list = Collections.EMPTY_LIST;
        dVar.b(list, list);
    }

    @Override // v.AbstractC2327b, p.e
    public final void e(RectF rectF, Matrix matrix, boolean z4) {
        super.e(rectF, matrix, z4);
        this.f20395A.e(rectF, this.f20358l, z4);
    }

    @Override // v.AbstractC2327b
    public final void j(Canvas canvas, Matrix matrix, int i) {
        this.f20395A.g(canvas, matrix, i);
    }

    @Override // v.AbstractC2327b
    public final p8.a k() {
        p8.a aVar = this.f20359n.f20393w;
        return aVar != null ? aVar : this.f20396B.f20359n.f20393w;
    }

    @Override // v.AbstractC2327b
    public final Ci.b l() {
        Ci.b bVar = this.f20359n.f20394x;
        return bVar != null ? bVar : this.f20396B.f20359n.f20394x;
    }

    @Override // v.AbstractC2327b
    public final void p(C2221f c2221f, int i, ArrayList arrayList, C2221f c2221f2) {
        this.f20395A.c(c2221f, i, arrayList, c2221f2);
    }
}
