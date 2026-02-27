package com.paymaya.ui.ekyc.view.fragment.impl;

import Bd.e;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;

/* JADX INFO: loaded from: classes4.dex */
public class EDDApplicationStatusFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EDDApplicationStatusFragment f14527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14528b;

    @UiThread
    public EDDApplicationStatusFragment_ViewBinding(EDDApplicationStatusFragment eDDApplicationStatusFragment, View view) {
        this.f14527a = eDDApplicationStatusFragment;
        eDDApplicationStatusFragment.mHelpCenterHtmlTextView = (HtmlTextView) Utils.findRequiredViewAsType(view, R.id.help_center_html_text_view_pma_fragment_edd_application_status, "field 'mHelpCenterHtmlTextView'", HtmlTextView.class);
        eDDApplicationStatusFragment.mValidationCodeTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.validation_code_text_view_pma_fragment_edd_application_status, "field 'mValidationCodeTextView'", TextView.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.view_submitted_pma_fragment_edd_application_status, "method 'onViewSubmittedDetailsClick'");
        this.f14528b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(eDDApplicationStatusFragment, 8));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        EDDApplicationStatusFragment eDDApplicationStatusFragment = this.f14527a;
        if (eDDApplicationStatusFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14527a = null;
        eDDApplicationStatusFragment.mHelpCenterHtmlTextView = null;
        eDDApplicationStatusFragment.mValidationCodeTextView = null;
        this.f14528b.setOnClickListener(null);
        this.f14528b = null;
    }
}
