package m4;

import S1.v;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import com.paymaya.R;
import com.paymaya.domain.store.T;
import e2.C1421c;
import java.util.List;

/* JADX INFO: renamed from: m4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1846b implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeView f18332b;

    public /* synthetic */ C1846b(BarcodeView barcodeView, int i) {
        this.f18331a = i;
        this.f18332b = barcodeView;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z4;
        C1421c c1421c;
        F.i iVar;
        boolean z5 = false;
        switch (this.f18331a) {
            case 0:
                int i = message.what;
                BarcodeView barcodeView = this.f18332b;
                if (i != R.id.zxing_decode_succeeded) {
                    if (i != R.id.zxing_decode_failed) {
                        if (i != R.id.zxing_possible_result_points) {
                            return false;
                        }
                        List<C3.l> list = (List) message.obj;
                        C1421c c1421c2 = barcodeView.f10142P;
                        if (c1421c2 != null) {
                            z4 = true;
                            if (barcodeView.f10141K != 1) {
                                c1421c2.getClass();
                                for (C3.l lVar : list) {
                                    ViewfinderView viewfinderView = ((DecoratedBarcodeView) c1421c2.c).f10149b;
                                    if (viewfinderView.f.size() < 20) {
                                        viewfinderView.f.add(lVar);
                                    }
                                }
                            }
                        }
                    }
                    return z4;
                }
                C1845a c1845a = (C1845a) message.obj;
                if (c1845a != null && (c1421c = barcodeView.f10142P) != null && barcodeView.f10141K != 1) {
                    T t5 = (T) c1421c.f16555b;
                    ((h) t5.f11391b).f18360b.f10148a.g();
                    A3.i iVar2 = ((h) t5.f11391b).f18362g;
                    synchronized (iVar2) {
                        if (iVar2.f41b) {
                            iVar2.e();
                        }
                        break;
                    }
                    ((h) t5.f11391b).h.post(new v(29, t5, c1845a, z5));
                    if (barcodeView.f10141K == 2) {
                        barcodeView.f10141K = 1;
                        barcodeView.f10142P = null;
                        barcodeView.i();
                        return true;
                    }
                }
                z4 = true;
                return z4;
            default:
                int i4 = message.what;
                BarcodeView barcodeView2 = this.f18332b;
                d dVar = barcodeView2.f18354y;
                if (i4 != R.id.zxing_prewiew_size_ready) {
                    if (i4 == R.id.zxing_camera_error) {
                        Exception exc = (Exception) message.obj;
                        if (barcodeView2.f18337a != null) {
                            barcodeView2.g();
                            dVar.c(exc);
                        }
                    } else if (i4 == R.id.zxing_camera_closed) {
                        dVar.a();
                    }
                    return false;
                }
                p pVar = (p) message.obj;
                barcodeView2.f18343n = pVar;
                p pVar2 = barcodeView2.m;
                if (pVar2 != null) {
                    if (pVar == null || (iVar = barcodeView2.f18341k) == null) {
                        barcodeView2.f18347r = null;
                        barcodeView2.f18346q = null;
                        barcodeView2.f18344o = null;
                        throw new IllegalStateException("containerSize or previewSize is not set yet");
                    }
                    barcodeView2.f18344o = ((n4.i) iVar.f1504d).b(pVar, (p) iVar.f1503b);
                    Rect rect = new Rect(0, 0, pVar2.f18368a, pVar2.f18369b);
                    Rect rect2 = barcodeView2.f18344o;
                    Rect rect3 = new Rect(rect);
                    rect3.intersect(rect2);
                    if (barcodeView2.f18348s != null) {
                        rect3.inset(Math.max(0, (rect3.width() - barcodeView2.f18348s.f18368a) / 2), Math.max(0, (rect3.height() - barcodeView2.f18348s.f18369b) / 2));
                    } else {
                        int iMin = (int) Math.min(((double) rect3.width()) * barcodeView2.f18349t, ((double) rect3.height()) * barcodeView2.f18349t);
                        rect3.inset(iMin, iMin);
                        if (rect3.height() > rect3.width()) {
                            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                        }
                    }
                    barcodeView2.f18346q = rect3;
                    Rect rect4 = new Rect(barcodeView2.f18346q);
                    Rect rect5 = barcodeView2.f18344o;
                    rect4.offset(-rect5.left, -rect5.top);
                    int i6 = rect4.left;
                    int i10 = pVar.f18368a;
                    int iWidth = (i6 * i10) / barcodeView2.f18344o.width();
                    int i11 = rect4.top;
                    int i12 = pVar.f18369b;
                    Rect rect6 = new Rect(iWidth, (i11 * i12) / barcodeView2.f18344o.height(), (rect4.right * i10) / barcodeView2.f18344o.width(), (rect4.bottom * i12) / barcodeView2.f18344o.height());
                    barcodeView2.f18347r = rect6;
                    if (rect6.width() <= 0 || barcodeView2.f18347r.height() <= 0) {
                        barcodeView2.f18347r = null;
                        barcodeView2.f18346q = null;
                        Log.w("e", "Preview frame is too small");
                    } else {
                        dVar.e();
                    }
                    barcodeView2.requestLayout();
                    barcodeView2.e();
                }
                return true;
        }
    }
}
