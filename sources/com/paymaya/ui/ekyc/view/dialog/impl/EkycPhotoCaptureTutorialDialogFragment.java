package com.paymaya.ui.ekyc.view.dialog.impl;

import N5.C0441c;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseDialogFragment;
import kotlin.jvm.internal.j;
import qf.d;

/* JADX INFO: loaded from: classes4.dex */
public final class EkycPhotoCaptureTutorialDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C0441c f14504R;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_dialog_fragment_ekyc_photo_capture_tutorial, viewGroup, false);
        int i = R.id.close_image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.close_image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial);
        if (imageView != null) {
            i = R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_1;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_1)) != null) {
                i = R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_2;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_2)) != null) {
                    i = R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_3;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_3)) != null) {
                        i = R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_bullet_1;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_bullet_1)) != null) {
                            i = R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_bullet_2;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_bullet_2)) != null) {
                                i = R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_bullet_3;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_bullet_3)) != null) {
                                    i = R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_bullet_4;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_bullet_4)) != null) {
                                        i = R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_bullet_5;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_guide_bullet_5)) != null) {
                                            i = R.id.label_text_view_pma_dialog_fragment_ekyc_photo_capture_tutorial;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.label_text_view_pma_dialog_fragment_ekyc_photo_capture_tutorial)) != null) {
                                                i = R.id.label_text_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_step_1;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.label_text_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_step_1)) != null) {
                                                    i = R.id.label_text_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_step_2;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.label_text_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_step_2)) != null) {
                                                        i = R.id.label_text_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_step_3;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.label_text_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_step_3)) != null) {
                                                            i = R.id.label_text_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_step_4;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.label_text_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_step_4)) != null) {
                                                                i = R.id.label_text_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_step_5;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.label_text_view_pma_dialog_fragment_ekyc_photo_capture_tutorial_step_5)) != null) {
                                                                    ScrollView scrollView = (ScrollView) viewInflate;
                                                                    this.f14504R = new C0441c(scrollView, imageView, 17);
                                                                    return scrollView;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f14504R = null;
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Dialog dialog;
        Window window;
        super.onStart();
        if (getDialog() != null) {
            Dialog dialog2 = getDialog();
            if ((dialog2 != null ? dialog2.getWindow() : null) == null || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
                return;
            }
            window.setLayout(-1, -2);
        }
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0441c c0441c = this.f14504R;
        j.d(c0441c);
        ((ImageView) c0441c.c).setOnClickListener(new d(this, 13));
    }
}
