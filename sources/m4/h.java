package m4;

import android.app.AlertDialog;
import android.os.Handler;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.paymaya.R;
import com.paymaya.domain.store.T;
import n4.C1920d;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f18358l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureActivity f18359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DecoratedBarcodeView f18360b;
    public final H3.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A3.i f18362g;
    public final Handler h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18363k;
    public int c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18361d = false;
    public boolean e = false;
    public boolean i = false;
    public final T j = new T(this, 26);

    public h(CaptureActivity captureActivity, DecoratedBarcodeView decoratedBarcodeView) {
        d dVar = new d(this, 1);
        this.f18363k = false;
        this.f18359a = captureActivity;
        this.f18360b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().j.add(dVar);
        this.h = new Handler();
        this.f = new H3.g(captureActivity, new f(this, 0));
        this.f18362g = new A3.i(captureActivity);
    }

    public final void a() {
        DecoratedBarcodeView decoratedBarcodeView = this.f18360b;
        C1920d c1920d = decoratedBarcodeView.getBarcodeView().f18337a;
        if (c1920d == null || c1920d.f18602g) {
            c();
        } else {
            this.i = true;
        }
        decoratedBarcodeView.f10148a.g();
        this.f.a();
    }

    public final void b() {
        CaptureActivity captureActivity = this.f18359a;
        if (captureActivity.isFinishing() || this.e || this.i) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(captureActivity);
        builder.setTitle(captureActivity.getString(R.string.zxing_app_name));
        builder.setMessage(captureActivity.getString(R.string.zxing_msg_camera_framework_bug));
        builder.setPositiveButton(R.string.zxing_button_ok, new kk.b(this, 3));
        builder.setOnCancelListener(new g(this));
        builder.show();
    }

    public final void c() {
        this.f18359a.finish();
    }
}
