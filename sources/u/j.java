package u;

import android.graphics.PointF;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f20239b;
    public boolean c;

    public j(PointF pointF, boolean z4, List list) {
        this.f20239b = pointF;
        this.c = z4;
        this.f20238a = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("b2zH"));
        sb2.append(this.f20238a.size());
        sb2.append(numX49.tnTj78("b2zO"));
        return androidx.camera.core.impl.a.q(sb2, this.c, '}');
    }

    public j() {
        this.f20238a = new ArrayList();
    }
}
