package de;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.paymaya.ui.qr.view.fragment.impl.BarcodeScannerFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends DebouncingOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeScannerFragment f16364b;

    public /* synthetic */ e(BarcodeScannerFragment barcodeScannerFragment, int i) {
        this.f16363a = i;
        this.f16364b = barcodeScannerFragment;
    }

    @Override // butterknife.internal.DebouncingOnClickListener
    public final void doClick(View view) {
        switch (this.f16363a) {
            case 0:
                this.f16364b.onQRBackPressed();
                break;
            default:
                this.f16364b.onEnableCameraPressed();
                break;
        }
    }
}
