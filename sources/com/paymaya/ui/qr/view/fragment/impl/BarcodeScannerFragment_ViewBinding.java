package com.paymaya.ui.qr.view.fragment.impl;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;
import de.e;

/* JADX INFO: loaded from: classes4.dex */
public class BarcodeScannerFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BarcodeScannerFragment f14668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14669b;
    public View c;

    @UiThread
    public BarcodeScannerFragment_ViewBinding(BarcodeScannerFragment barcodeScannerFragment, View view) {
        this.f14668a = barcodeScannerFragment;
        barcodeScannerFragment.mConstraintGroupDeniedPermission = (Group) Utils.findRequiredViewAsType(view, R.id.deny_permission_constraint_group_pma_fragment_qr_scanner, "field 'mConstraintGroupDeniedPermission'", Group.class);
        barcodeScannerFragment.mFrameLayoutScannerContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.scanner_frame_layout_pma_fragment_qr_scanner, "field 'mFrameLayoutScannerContainer'", FrameLayout.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.back_image_view_pma_fragment_qr_scanner, "method 'onQRBackPressed'");
        this.f14669b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(barcodeScannerFragment, 0));
        View viewFindRequiredView2 = Utils.findRequiredView(view, R.id.enable_camera_text_view_pma_fragment_merchant_qr_scanner, "method 'onEnableCameraPressed'");
        this.c = viewFindRequiredView2;
        viewFindRequiredView2.setOnClickListener(new e(barcodeScannerFragment, 1));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        BarcodeScannerFragment barcodeScannerFragment = this.f14668a;
        if (barcodeScannerFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14668a = null;
        barcodeScannerFragment.mConstraintGroupDeniedPermission = null;
        barcodeScannerFragment.mFrameLayoutScannerContainer = null;
        this.f14669b.setOnClickListener(null);
        this.f14669b = null;
        this.c.setOnClickListener(null);
        this.c = null;
    }
}
