package m4;

import android.graphics.Rect;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18335b;

    public /* synthetic */ d(Object obj, int i) {
        this.f18334a = i;
        this.f18335b = obj;
    }

    private final void b() {
    }

    private final void d(Exception exc) {
    }

    private final void f() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void k() {
    }

    private final void l() {
    }

    public final void a() {
        Object obj = this.f18335b;
        switch (this.f18334a) {
            case 0:
                Iterator it = ((BarcodeView) obj).j.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a();
                }
                break;
            case 1:
                h hVar = (h) obj;
                if (hVar.i) {
                    Log.d(CmcdData.Factory.STREAMING_FORMAT_HLS, "Camera closed; finishing activity");
                    hVar.c();
                }
                break;
        }
    }

    public final void c(Exception exc) {
        switch (this.f18334a) {
            case 0:
                Iterator it = ((BarcodeView) this.f18335b).j.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).c(exc);
                }
                break;
            case 1:
                ((h) this.f18335b).b();
                break;
        }
    }

    public final void e() {
        switch (this.f18334a) {
            case 0:
                Iterator it = ((BarcodeView) this.f18335b).j.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).e();
                }
                break;
            case 1:
                break;
            default:
                ViewfinderView viewfinderView = (ViewfinderView) this.f18335b;
                e eVar = viewfinderView.h;
                if (eVar != null) {
                    Rect framingRect = eVar.getFramingRect();
                    Rect previewFramingRect = viewfinderView.h.getPreviewFramingRect();
                    if (framingRect != null && previewFramingRect != null) {
                        viewfinderView.i = framingRect;
                        viewfinderView.j = previewFramingRect;
                    }
                }
                viewfinderView.invalidate();
                break;
        }
    }

    public final void g() {
        switch (this.f18334a) {
            case 0:
                Iterator it = ((BarcodeView) this.f18335b).j.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).g();
                }
                break;
        }
    }

    public final void j() {
        switch (this.f18334a) {
            case 0:
                Iterator it = ((BarcodeView) this.f18335b).j.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).j();
                }
                break;
        }
    }
}
