package de;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.paymaya.ui.qr.view.fragment.impl.MLKitQRScannerFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends DebouncingOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MLKitQRScannerFragment f16369b;

    public /* synthetic */ j(MLKitQRScannerFragment mLKitQRScannerFragment, int i) {
        this.f16368a = i;
        this.f16369b = mLKitQRScannerFragment;
    }

    @Override // butterknife.internal.DebouncingOnClickListener
    public final void doClick(View view) {
        switch (this.f16368a) {
            case 0:
                this.f16369b.onQRBackPressed();
                break;
            case 1:
                this.f16369b.onEnableCameraPressed();
                break;
            default:
                this.f16369b.onClickImportFromGallery();
                break;
        }
    }
}
