package com.paymaya.ui.ekyc.view.fragment.impl;

import Bd.e;
import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;

/* JADX INFO: loaded from: classes4.dex */
public class EDDSubmittedFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EDDSubmittedFragment f14558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14559b;

    @UiThread
    public EDDSubmittedFragment_ViewBinding(EDDSubmittedFragment eDDSubmittedFragment, View view) {
        this.f14558a = eDDSubmittedFragment;
        eDDSubmittedFragment.mHtmlTextView = (HtmlTextView) Utils.findRequiredViewAsType(view, R.id.help_center_html_text_view_pma_fragment_edd_submitted, "field 'mHtmlTextView'", HtmlTextView.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.back_to_home_pma_fragment_edd_submitted, "method 'onBackToHome'");
        this.f14559b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(eDDSubmittedFragment, 15));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        EDDSubmittedFragment eDDSubmittedFragment = this.f14558a;
        if (eDDSubmittedFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14558a = null;
        eDDSubmittedFragment.mHtmlTextView = null;
        this.f14559b.setOnClickListener(null);
        this.f14559b = null;
    }
}
