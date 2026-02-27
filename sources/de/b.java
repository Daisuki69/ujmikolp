package de;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.ui.qr.view.fragment.impl.BarcodeScannerFragment;
import com.paymaya.ui.qr.view.fragment.impl.MLKitBarcodeScannerFragment;
import com.paymaya.ui.qr.view.fragment.impl.MLKitQRScannerFragment;
import com.paymaya.ui.qr.view.fragment.impl.QRScannerFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f16361b;
    public final /* synthetic */ BaseFragment c;

    public /* synthetic */ b(BaseFragment baseFragment, AlertDialog alertDialog, int i) {
        this.f16360a = i;
        this.c = baseFragment;
        this.f16361b = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f16360a) {
            case 0:
                BarcodeScannerFragment barcodeScannerFragment = (BarcodeScannerFragment) this.c;
                Callback.onClick_enter(view);
                try {
                    this.f16361b.dismiss();
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", barcodeScannerFragment.getContext().getPackageName(), null));
                    barcodeScannerFragment.startActivityForResult(intent, 2);
                    return;
                } finally {
                }
            case 1:
                MLKitBarcodeScannerFragment mLKitBarcodeScannerFragment = (MLKitBarcodeScannerFragment) this.c;
                Callback.onClick_enter(view);
                try {
                    this.f16361b.dismiss();
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.fromParts("package", mLKitBarcodeScannerFragment.getContext().getPackageName(), null));
                    mLKitBarcodeScannerFragment.startActivityForResult(intent2, 2);
                    return;
                } finally {
                }
            case 2:
                MLKitQRScannerFragment mLKitQRScannerFragment = (MLKitQRScannerFragment) this.c;
                Callback.onClick_enter(view);
                try {
                    this.f16361b.dismiss();
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.fromParts("package", mLKitQRScannerFragment.getContext().getPackageName(), null));
                    mLKitQRScannerFragment.startActivityForResult(intent3, 2);
                    return;
                } finally {
                }
            default:
                QRScannerFragment qRScannerFragment = (QRScannerFragment) this.c;
                Callback.onClick_enter(view);
                try {
                    this.f16361b.dismiss();
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.fromParts("package", qRScannerFragment.getContext().getPackageName(), null));
                    qRScannerFragment.startActivityForResult(intent4, 2);
                    return;
                } finally {
                }
        }
    }
}
