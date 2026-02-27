package com.paymaya.ui.qr.view.dialog.impl;

import Bd.e;
import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public class MeralcoBillDialogFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MeralcoBillDialogFragment f14658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14659b;

    @UiThread
    public MeralcoBillDialogFragment_ViewBinding(MeralcoBillDialogFragment meralcoBillDialogFragment, View view) {
        this.f14658a = meralcoBillDialogFragment;
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.got_it_button_pma_dialog_fragment_meralco_guidelines, "method 'onDismissClick'");
        this.f14659b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(meralcoBillDialogFragment, 4));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        if (this.f14658a == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14658a = null;
        this.f14659b.setOnClickListener(null);
        this.f14659b = null;
    }
}
