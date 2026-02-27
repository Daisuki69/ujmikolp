package S0;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f5594b;
    public final RectF c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5595d;
    public int e;

    public b(int i, Bitmap bitmap, RectF rectF, boolean z4, int i4) {
        this.f5593a = i;
        this.f5594b = bitmap;
        this.c = rectF;
        this.f5595d = z4;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (bVar.f5593a == this.f5593a) {
            RectF rectF = bVar.c;
            float f = rectF.left;
            RectF rectF2 = this.c;
            if (f == rectF2.left && rectF.right == rectF2.right && rectF.top == rectF2.top && rectF.bottom == rectF2.bottom) {
                return true;
            }
        }
        return false;
    }
}
