package com.paymaya.ui.qr.view.fragment.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;
import com.paymaya.ui.qr.view.widget.CameraSourcePreview;
import de.g;

/* JADX INFO: loaded from: classes4.dex */
public class MLKitBarcodeScannerFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MLKitBarcodeScannerFragment f14673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14674b;
    public View c;

    @UiThread
    public MLKitBarcodeScannerFragment_ViewBinding(MLKitBarcodeScannerFragment mLKitBarcodeScannerFragment, View view) {
        this.f14673a = mLKitBarcodeScannerFragment;
        mLKitBarcodeScannerFragment.mCameraSourcePreview = (CameraSourcePreview) Utils.findRequiredViewAsType(view, R.id.camera_source_preview_pma_fragment_barcode_scanner_mlkit, "field 'mCameraSourcePreview'", CameraSourcePreview.class);
        mLKitBarcodeScannerFragment.mConstraintGroupDeniedPermission = (Group) Utils.findRequiredViewAsType(view, R.id.deny_permission_constraint_group_pma_fragment_qr_scanner, "field 'mConstraintGroupDeniedPermission'", Group.class);
        mLKitBarcodeScannerFragment.mTextViewBarcodeSpiels = (TextView) Utils.findRequiredViewAsType(view, R.id.barcode_spiels_text_view_pma_fragment_barcode_scanner_mlkit, "field 'mTextViewBarcodeSpiels'", TextView.class);
        mLKitBarcodeScannerFragment.mImageViewBarcodeFrame = (ImageView) Utils.findRequiredViewAsType(view, R.id.barcode_frame_image_view_pma_fragment_barcode_scanner_mlkit, "field 'mImageViewBarcodeFrame'", ImageView.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.back_image_view_pma_fragment_qr_scanner, "method 'onQRBackPressed'");
        this.f14674b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new g(mLKitBarcodeScannerFragment, 0));
        View viewFindRequiredView2 = Utils.findRequiredView(view, R.id.enable_camera_text_view_pma_fragment_merchant_qr_scanner, "method 'onEnableCameraPressed'");
        this.c = viewFindRequiredView2;
        viewFindRequiredView2.setOnClickListener(new g(mLKitBarcodeScannerFragment, 1));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        MLKitBarcodeScannerFragment mLKitBarcodeScannerFragment = this.f14673a;
        if (mLKitBarcodeScannerFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14673a = null;
        mLKitBarcodeScannerFragment.mCameraSourcePreview = null;
        mLKitBarcodeScannerFragment.mConstraintGroupDeniedPermission = null;
        mLKitBarcodeScannerFragment.mTextViewBarcodeSpiels = null;
        mLKitBarcodeScannerFragment.mImageViewBarcodeFrame = null;
        this.f14674b.setOnClickListener(null);
        this.f14674b = null;
        this.c.setOnClickListener(null);
        this.c = null;
    }
}
