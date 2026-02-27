package de;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.paymaya.ui.qr.view.fragment.impl.QRScannerFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends DebouncingOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QRScannerFragment f16376b;

    public /* synthetic */ p(QRScannerFragment qRScannerFragment, int i) {
        this.f16375a = i;
        this.f16376b = qRScannerFragment;
    }

    @Override // butterknife.internal.DebouncingOnClickListener
    public final void doClick(View view) {
        switch (this.f16375a) {
            case 0:
                this.f16376b.onQRBackPressed();
                break;
            case 1:
                this.f16376b.onEnableCameraPressed();
                break;
            default:
                this.f16376b.onClickImportFromGallery();
                break;
        }
    }
}
