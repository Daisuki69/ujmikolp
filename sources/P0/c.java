package P0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.util.Log;
import com.google.firebase.messaging.p;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import ng.C1946a;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f4906b;
    public PdfiumCore c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4907d;
    public U0.a e;
    public i f;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            f fVar = (f) this.f4906b.get();
            if (fVar == null) {
                return new NullPointerException("pdfView == null");
            }
            this.f = new i(this.c, this.e.a(fVar.getContext(), this.c, this.f4907d), fVar.getPageFitPolicy(), new Size(fVar.getWidth(), fVar.getHeight()), fVar.f4949v, fVar.getSpacingPx(), fVar.f4929T, fVar.f4947t);
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.f4905a = true;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Throwable th2 = (Throwable) obj;
        f fVar = (f) this.f4906b.get();
        if (fVar != null) {
            if (th2 != null) {
                fVar.f4936b0 = 4;
                p pVar = (p) fVar.f4944q.f785b;
                fVar.p();
                fVar.invalidate();
                if (pVar == null) {
                    Log.e("PDFView", "load pdf error", th2);
                    return;
                }
                HashMap map = new HashMap();
                map.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, th2.toString());
                ((C1946a) pVar.f9799b).f18730b.a("onError", map, null);
                return;
            }
            if (this.f4905a) {
                return;
            }
            i iVar = this.f;
            fVar.f4936b0 = 2;
            fVar.f4938g = iVar;
            HandlerThread handlerThread = fVar.f4941n;
            if (handlerThread == null) {
                return;
            }
            if (!handlerThread.isAlive()) {
                fVar.f4941n.start();
            }
            k kVar = new k(fVar.f4941n.getLooper());
            kVar.f4977b = new RectF();
            kVar.c = new Rect();
            kVar.f4978d = new Matrix();
            kVar.f4976a = fVar;
            fVar.f4942o = kVar;
            kVar.e = true;
            fVar.f.f4911g = true;
            Ci.b bVar = fVar.f4944q;
            int i = iVar.c;
            bVar.getClass();
            fVar.k(fVar.f4948u);
        }
    }
}
