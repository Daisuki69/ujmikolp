package de;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.paymaya.ui.qr.view.fragment.impl.MLKitBarcodeScannerFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends DebouncingOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MLKitBarcodeScannerFragment f16366b;

    public /* synthetic */ g(MLKitBarcodeScannerFragment mLKitBarcodeScannerFragment, int i) {
        this.f16365a = i;
        this.f16366b = mLKitBarcodeScannerFragment;
    }

    @Override // butterknife.internal.DebouncingOnClickListener
    public final void doClick(View view) {
        switch (this.f16365a) {
            case 0:
                this.f16366b.onQRBackPressed();
                break;
            default:
                this.f16366b.onEnableCameraPressed();
                break;
        }
    }
}
