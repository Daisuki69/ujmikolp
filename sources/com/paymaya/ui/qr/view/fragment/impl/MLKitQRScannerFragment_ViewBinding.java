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
import de.j;

/* JADX INFO: loaded from: classes4.dex */
public class MLKitQRScannerFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MLKitQRScannerFragment f14680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14681b;
    public View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f14682d;

    @UiThread
    public MLKitQRScannerFragment_ViewBinding(MLKitQRScannerFragment mLKitQRScannerFragment, View view) {
        this.f14680a = mLKitQRScannerFragment;
        mLKitQRScannerFragment.mCameraSourcePreview = (CameraSourcePreview) Utils.findRequiredViewAsType(view, R.id.camera_source_preview_pma_fragment_qr_scanner_mlkit, "field 'mCameraSourcePreview'", CameraSourcePreview.class);
        mLKitQRScannerFragment.mConstraintGroupDeniedPermission = (Group) Utils.findRequiredViewAsType(view, R.id.deny_permission_constraint_group_pma_fragment_qr_scanner, "field 'mConstraintGroupDeniedPermission'", Group.class);
        mLKitQRScannerFragment.mTextViewQRCodeSpiels = (TextView) Utils.findRequiredViewAsType(view, R.id.qr_code_spiels_text_view_pma_fragment_qr_scanner_mlkit, "field 'mTextViewQRCodeSpiels'", TextView.class);
        mLKitQRScannerFragment.mImageViewQRCodeFrame = (ImageView) Utils.findRequiredViewAsType(view, R.id.qr_code_frame_image_view_pma_fragment_qr_scanner_mlkit, "field 'mImageViewQRCodeFrame'", ImageView.class);
        mLKitQRScannerFragment.mGroupOtherOptions = (Group) Utils.findRequiredViewAsType(view, R.id.other_option_group_pma_fragment_qr_scanner, "field 'mGroupOtherOptions'", Group.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.back_image_view_pma_fragment_qr_scanner, "method 'onQRBackPressed'");
        this.f14681b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new j(mLKitQRScannerFragment, 0));
        View viewFindRequiredView2 = Utils.findRequiredView(view, R.id.enable_camera_text_view_pma_fragment_merchant_qr_scanner, "method 'onEnableCameraPressed'");
        this.c = viewFindRequiredView2;
        viewFindRequiredView2.setOnClickListener(new j(mLKitQRScannerFragment, 1));
        View viewFindRequiredView3 = Utils.findRequiredView(view, R.id.import_from_gallery_text_view_pma_fragment_qr_scanner, "method 'onClickImportFromGallery'");
        this.f14682d = viewFindRequiredView3;
        viewFindRequiredView3.setOnClickListener(new j(mLKitQRScannerFragment, 2));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        MLKitQRScannerFragment mLKitQRScannerFragment = this.f14680a;
        if (mLKitQRScannerFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14680a = null;
        mLKitQRScannerFragment.mCameraSourcePreview = null;
        mLKitQRScannerFragment.mConstraintGroupDeniedPermission = null;
        mLKitQRScannerFragment.mTextViewQRCodeSpiels = null;
        mLKitQRScannerFragment.mImageViewQRCodeFrame = null;
        mLKitQRScannerFragment.mGroupOtherOptions = null;
        this.f14681b.setOnClickListener(null);
        this.f14681b = null;
        this.c.setOnClickListener(null);
        this.c = null;
        this.f14682d.setOnClickListener(null);
        this.f14682d = null;
    }
}
