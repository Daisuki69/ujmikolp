package We;

import android.graphics.Bitmap;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends AbstractC0598b {
    @Override // We.AbstractC0598b
    public final void b(Bitmap bitmap, int i) {
        if (bitmap == null) {
            throw new AssertionError(numX49.tnTj78("bkRPL") + this);
        }
        K k8 = (K) d();
        if (k8 != null) {
            k8.a(bitmap);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException(numX49.tnTj78("bkRP2"));
            }
        }
    }

    @Override // We.AbstractC0598b
    public final void c(Exception exc) {
        K k8 = (K) d();
        if (k8 != null) {
            int i = this.f;
            if (i != 0) {
                k8.b(exc, this.f6378a.f6342b.getResources().getDrawable(i));
            } else {
                k8.b(exc, null);
            }
        }
    }
}
