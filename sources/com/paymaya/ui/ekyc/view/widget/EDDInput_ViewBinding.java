package com.paymaya.ui.ekyc.view.widget;

import Bd.e;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class EDDInput_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EDDInput f14605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14606b;

    @UiThread
    public EDDInput_ViewBinding(EDDInput eDDInput, View view) {
        this.f14605a = eDDInput;
        eDDInput.mTextInputLayout = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.edd_text_input_layout_pma_view_edd_input, "field 'mTextInputLayout'", TextInputLayout.class);
        eDDInput.mEditText = (TextInputEditText) Utils.findRequiredViewAsType(view, R.id.edd_edit_text_pma_view_edd_input, "field 'mEditText'", TextInputEditText.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.remove_image_view_pma_view_edd_input, "field 'mRemoveImageView' and method 'onRemove'");
        eDDInput.mRemoveImageView = (ImageView) Utils.castView(viewFindRequiredView, R.id.remove_image_view_pma_view_edd_input, "field 'mRemoveImageView'", ImageView.class);
        this.f14606b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(eDDInput, 0));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        EDDInput eDDInput = this.f14605a;
        if (eDDInput == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14605a = null;
        eDDInput.mTextInputLayout = null;
        eDDInput.mEditText = null;
        eDDInput.mRemoveImageView = null;
        this.f14606b.setOnClickListener(null);
        this.f14606b = null;
    }
}
