package com.paymaya.ui.qr.view.fragment.impl;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;
import de.p;

/* JADX INFO: loaded from: classes4.dex */
public class QRScannerFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public QRScannerFragment f14692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14693b;
    public View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f14694d;

    @UiThread
    public QRScannerFragment_ViewBinding(QRScannerFragment qRScannerFragment, View view) {
        this.f14692a = qRScannerFragment;
        qRScannerFragment.mConstraintGroupDeniedPermission = (Group) Utils.findRequiredViewAsType(view, R.id.deny_permission_constraint_group_pma_fragment_qr_scanner, "field 'mConstraintGroupDeniedPermission'", Group.class);
        qRScannerFragment.mFrameLayoutScannerContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.scanner_frame_layout_pma_fragment_qr_scanner, "field 'mFrameLayoutScannerContainer'", FrameLayout.class);
        qRScannerFragment.mGroupOtherOptions = (Group) Utils.findRequiredViewAsType(view, R.id.other_option_group_pma_fragment_qr_scanner, "field 'mGroupOtherOptions'", Group.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.back_image_view_pma_fragment_qr_scanner, "method 'onQRBackPressed'");
        this.f14693b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new p(qRScannerFragment, 0));
        View viewFindRequiredView2 = Utils.findRequiredView(view, R.id.enable_camera_text_view_pma_fragment_merchant_qr_scanner, "method 'onEnableCameraPressed'");
        this.c = viewFindRequiredView2;
        viewFindRequiredView2.setOnClickListener(new p(qRScannerFragment, 1));
        View viewFindRequiredView3 = Utils.findRequiredView(view, R.id.import_from_gallery_text_view_pma_fragment_qr_scanner, "method 'onClickImportFromGallery'");
        this.f14694d = viewFindRequiredView3;
        viewFindRequiredView3.setOnClickListener(new p(qRScannerFragment, 2));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        QRScannerFragment qRScannerFragment = this.f14692a;
        if (qRScannerFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14692a = null;
        qRScannerFragment.mConstraintGroupDeniedPermission = null;
        qRScannerFragment.mFrameLayoutScannerContainer = null;
        qRScannerFragment.mGroupOtherOptions = null;
        this.f14693b.setOnClickListener(null);
        this.f14693b = null;
        this.c.setOnClickListener(null);
        this.c = null;
        this.f14694d.setOnClickListener(null);
        this.f14694d = null;
    }
}
