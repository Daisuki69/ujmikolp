package n4;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import com.paymaya.R;
import com.paymaya.domain.store.L;
import dOYHB6.tiZVw8.numX49;
import m4.p;
import m4.q;

/* JADX INFO: renamed from: n4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1921e implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L f18605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f18606b;
    public final /* synthetic */ C1922f c;

    public C1921e(C1922f c1922f) {
        this.c = c1922f;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        p pVar = this.f18606b;
        L l6 = this.f18605a;
        if (pVar == null || l6 == null) {
            Log.d(numX49.tnTj78("brEz"), numX49.tnTj78("brEl"));
            if (l6 != null) {
                new Exception(numX49.tnTj78("brEW"));
                l6.e();
                return;
            }
            return;
        }
        try {
            if (bArr == null) {
                throw new NullPointerException("No preview data received");
            }
            q qVar = new q(bArr, pVar.f18368a, pVar.f18369b, camera.getParameters().getPreviewFormat(), this.c.f18611k);
            synchronized (((X2.c) l6.f11367b).h) {
                try {
                    X2.c cVar = (X2.c) l6.f11367b;
                    if (cVar.f6473a) {
                        ((Handler) cVar.f6475d).obtainMessage(R.id.zxing_decode, qVar).sendToTarget();
                    }
                } finally {
                }
            }
        } catch (RuntimeException e) {
            Log.e(numX49.tnTj78("brEI"), numX49.tnTj78("brEq"), e);
            l6.e();
        }
    }
}
