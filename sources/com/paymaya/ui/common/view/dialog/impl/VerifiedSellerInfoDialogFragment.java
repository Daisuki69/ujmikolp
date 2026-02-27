package com.paymaya.ui.common.view.dialog.impl;

import L9.C0327e;
import N5.C0489y;
import O5.a;
import S.b;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.widget.HtmlTextView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class VerifiedSellerInfoDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C0489y f14399R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0327e f14400S;

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10241B = (C1220i) ((a) W4.a.e().a().c).f4716g.get();
        C0327e c0327e = new C0327e(19);
        this.f14400S = c0327e;
        c0327e.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_dialog_fragment_verified_seller_info, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.content_scroll_view_pma_dialog_fragment_verified_seller_info;
        if (((ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.content_scroll_view_pma_dialog_fragment_verified_seller_info)) != null) {
            i = R.id.got_it_button_pma_dialog_fragment_verified_seller_info;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.got_it_button_pma_dialog_fragment_verified_seller_info);
            if (button != null) {
                i = R.id.information_text_view_pma_dialog_fragment_verified_sellers_info;
                if (((HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.information_text_view_pma_dialog_fragment_verified_sellers_info)) != null) {
                    i = R.id.title_text_view_pma_dialog_fragment_verified_sellers_info;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_view_pma_dialog_fragment_verified_sellers_info)) != null) {
                        this.f14399R = new C0489y(constraintLayout, button, 8);
                        j.f(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f14400S;
        if (c0327e == null) {
            j.n("mVerifiedSellerInfoDialogFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        Window window2 = dialog.getWindow();
        j.d(window2);
        Drawable background = window2.getDecorView().getBackground();
        background.setAlpha(0);
        Window window3 = dialog.getWindow();
        j.d(window3);
        window3.getDecorView().setBackground(background);
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        C0489y c0489y = this.f14399R;
        j.d(c0489y);
        c0489y.c.setOnClickListener(new b(this, 18));
    }
}
