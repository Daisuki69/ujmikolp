package com.paymaya.ui.ekyc.view.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class FinancialDocumentPhoto_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FinancialDocumentPhoto f14612a;

    @UiThread
    public FinancialDocumentPhoto_ViewBinding(FinancialDocumentPhoto financialDocumentPhoto, View view) {
        this.f14612a = financialDocumentPhoto;
        financialDocumentPhoto.mDocumentTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.pma_item_edd_financial_document_document_text_view, "field 'mDocumentTextView'", TextView.class);
        financialDocumentPhoto.mPhotoImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.pma_item_edd_financial_document_photo, "field 'mPhotoImageView'", ImageView.class);
        financialDocumentPhoto.mPhotoGroup = (Group) Utils.findRequiredViewAsType(view, R.id.pma_item_edd_financial_document_photo_group, "field 'mPhotoGroup'", Group.class);
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        FinancialDocumentPhoto financialDocumentPhoto = this.f14612a;
        if (financialDocumentPhoto == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14612a = null;
        financialDocumentPhoto.mDocumentTextView = null;
        financialDocumentPhoto.mPhotoImageView = null;
        financialDocumentPhoto.mPhotoGroup = null;
    }
}
