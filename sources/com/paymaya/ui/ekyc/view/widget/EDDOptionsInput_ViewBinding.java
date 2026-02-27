package com.paymaya.ui.ekyc.view.widget;

import Bd.h;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class EDDOptionsInput_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EDDOptionsInput f14609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14610b;
    public View c;

    @UiThread
    public EDDOptionsInput_ViewBinding(EDDOptionsInput eDDOptionsInput, View view) {
        this.f14609a = eDDOptionsInput;
        eDDOptionsInput.mOptionsTextInputLayout = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.edd_options_text_input_layout_pma_view_edd_input, "field 'mOptionsTextInputLayout'", TextInputLayout.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.edd_options_edit_text_pma_view_edd_input, "field 'mOptionsEditText' and method 'onClickOptions'");
        eDDOptionsInput.mOptionsEditText = (TextInputEditText) Utils.castView(viewFindRequiredView, R.id.edd_options_edit_text_pma_view_edd_input, "field 'mOptionsEditText'", TextInputEditText.class);
        this.f14610b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new h(eDDOptionsInput, 0));
        eDDOptionsInput.mTextInputLayout = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.edd_text_input_layout_pma_view_edd_input, "field 'mTextInputLayout'", TextInputLayout.class);
        eDDOptionsInput.mEditText = (TextInputEditText) Utils.findRequiredViewAsType(view, R.id.edd_edit_text_pma_view_edd_input, "field 'mEditText'", TextInputEditText.class);
        View viewFindRequiredView2 = Utils.findRequiredView(view, R.id.remove_image_view_pma_view_edd_input, "field 'mRemoveImageView' and method 'onRemove'");
        eDDOptionsInput.mRemoveImageView = (ImageView) Utils.castView(viewFindRequiredView2, R.id.remove_image_view_pma_view_edd_input, "field 'mRemoveImageView'", ImageView.class);
        this.c = viewFindRequiredView2;
        viewFindRequiredView2.setOnClickListener(new h(eDDOptionsInput, 1));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        EDDOptionsInput eDDOptionsInput = this.f14609a;
        if (eDDOptionsInput == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14609a = null;
        eDDOptionsInput.mOptionsTextInputLayout = null;
        eDDOptionsInput.mOptionsEditText = null;
        eDDOptionsInput.mTextInputLayout = null;
        eDDOptionsInput.mEditText = null;
        eDDOptionsInput.mRemoveImageView = null;
        this.f14610b.setOnClickListener(null);
        this.f14610b = null;
        this.c.setOnClickListener(null);
        this.c = null;
    }
}
