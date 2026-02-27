package com.paymaya.ui.ekyc.view.widget;

import Bd.c;
import Bd.d;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class EDDInputFinancialDocument_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EDDInputFinancialDocument f14601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14602b;
    public View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f14603d;
    public View e;
    public View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f14604g;

    @UiThread
    public EDDInputFinancialDocument_ViewBinding(EDDInputFinancialDocument eDDInputFinancialDocument, View view) {
        this.f14601a = eDDInputFinancialDocument;
        eDDInputFinancialDocument.mTextInputLayout = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.edd_dropdown_pma_view_input_financial_document, "field 'mTextInputLayout'", TextInputLayout.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.choose_one_edit_text_pma_fragment_edd_financial_document, "field 'mEditText', method 'onChooseClick', and method 'onChooseFocused'");
        eDDInputFinancialDocument.mEditText = (TextInputEditText) Utils.castView(viewFindRequiredView, R.id.choose_one_edit_text_pma_fragment_edd_financial_document, "field 'mEditText'", TextInputEditText.class);
        this.f14602b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new c(eDDInputFinancialDocument, 0));
        viewFindRequiredView.setOnFocusChangeListener(new d(eDDInputFinancialDocument, 0));
        View viewFindRequiredView2 = Utils.findRequiredView(view, R.id.remove_image_view_pma_view_edd_input_financial_document, "field 'mRemoveImageView' and method 'onRemove'");
        eDDInputFinancialDocument.mRemoveImageView = (ImageView) Utils.castView(viewFindRequiredView2, R.id.remove_image_view_pma_view_edd_input_financial_document, "field 'mRemoveImageView'", ImageView.class);
        this.c = viewFindRequiredView2;
        viewFindRequiredView2.setOnClickListener(new c(eDDInputFinancialDocument, 1));
        eDDInputFinancialDocument.mUploadLabelGroup = (Group) Utils.findRequiredViewAsType(view, R.id.upload_label_group_pma_view_edd_input_financial_document, "field 'mUploadLabelGroup'", Group.class);
        eDDInputFinancialDocument.mUploadGroup = (Group) Utils.findRequiredViewAsType(view, R.id.upload_group_pma_view_edd_input_financial_document, "field 'mUploadGroup'", Group.class);
        eDDInputFinancialDocument.mPreviewGroup = (Group) Utils.findRequiredViewAsType(view, R.id.preview_group_pma_view_edd_input_financial_document, "field 'mPreviewGroup'", Group.class);
        eDDInputFinancialDocument.mImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.preview_image_view_pma_view_edd_input_financial_document, "field 'mImageView'", ImageView.class);
        View viewFindRequiredView3 = Utils.findRequiredView(view, R.id.upload_clickable_background_view_pma_view_edd_input_financial_document, "field 'mBackgroundDocument' and method 'onTakePhoto'");
        eDDInputFinancialDocument.mBackgroundDocument = viewFindRequiredView3;
        this.f14603d = viewFindRequiredView3;
        viewFindRequiredView3.setOnClickListener(new c(eDDInputFinancialDocument, 2));
        eDDInputFinancialDocument.mTextViewError = (TextView) Utils.findRequiredViewAsType(view, R.id.photo_error_text_pma_view_edd_input_financial_document, "field 'mTextViewError'", TextView.class);
        eDDInputFinancialDocument.mViewDivider = Utils.findRequiredView(view, R.id.divider_view_pma_view_edd_input_financial_document, "field 'mViewDivider'");
        View viewFindRequiredView4 = Utils.findRequiredView(view, R.id.take_photo_label_text_view_pma_view_edd_input_financial_document, "method 'onTakePhoto'");
        this.e = viewFindRequiredView4;
        viewFindRequiredView4.setOnClickListener(new c(eDDInputFinancialDocument, 3));
        View viewFindRequiredView5 = Utils.findRequiredView(view, R.id.preview_clickable_background_view_pma_view_edd_input_financial_document, "method 'onTakePhoto'");
        this.f = viewFindRequiredView5;
        viewFindRequiredView5.setOnClickListener(new c(eDDInputFinancialDocument, 4));
        View viewFindRequiredView6 = Utils.findRequiredView(view, R.id.retake_text_view_pma_view_edd_input_financial_document, "method 'onTakePhoto'");
        this.f14604g = viewFindRequiredView6;
        viewFindRequiredView6.setOnClickListener(new c(eDDInputFinancialDocument, 5));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        EDDInputFinancialDocument eDDInputFinancialDocument = this.f14601a;
        if (eDDInputFinancialDocument == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14601a = null;
        eDDInputFinancialDocument.mTextInputLayout = null;
        eDDInputFinancialDocument.mEditText = null;
        eDDInputFinancialDocument.mRemoveImageView = null;
        eDDInputFinancialDocument.mUploadLabelGroup = null;
        eDDInputFinancialDocument.mUploadGroup = null;
        eDDInputFinancialDocument.mPreviewGroup = null;
        eDDInputFinancialDocument.mImageView = null;
        eDDInputFinancialDocument.mBackgroundDocument = null;
        eDDInputFinancialDocument.mTextViewError = null;
        eDDInputFinancialDocument.mViewDivider = null;
        this.f14602b.setOnClickListener(null);
        this.f14602b.setOnFocusChangeListener(null);
        this.f14602b = null;
        this.c.setOnClickListener(null);
        this.c = null;
        this.f14603d.setOnClickListener(null);
        this.f14603d = null;
        this.e.setOnClickListener(null);
        this.e = null;
        this.f.setOnClickListener(null);
        this.f = null;
        this.f14604g.setOnClickListener(null);
        this.f14604g = null;
    }
}
