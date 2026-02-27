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
public class EDDIntroFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EDDIntroFragment f14541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14542b;

    @UiThread
    public EDDIntroFragment_ViewBinding(EDDIntroFragment eDDIntroFragment, View view) {
        this.f14541a = eDDIntroFragment;
        eDDIntroFragment.mNameTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.pma_fragment_edd_intro_name, "field 'mNameTextView'", TextView.class);
        eDDIntroFragment.mCloseHtmlTextView = (HtmlTextView) Utils.findRequiredViewAsType(view, R.id.pma_fragment_edd_intro_close, "field 'mCloseHtmlTextView'", HtmlTextView.class);
        eDDIntroFragment.mHelpCenterHtmlTextView = (HtmlTextView) Utils.findRequiredViewAsType(view, R.id.pma_fragment_edd_help_center_html_text_view, "field 'mHelpCenterHtmlTextView'", HtmlTextView.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.pma_fragment_edd_intro_proceed, "method 'onProceedClick'");
        this.f14542b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(eDDIntroFragment, 12));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        EDDIntroFragment eDDIntroFragment = this.f14541a;
        if (eDDIntroFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14541a = null;
        eDDIntroFragment.mNameTextView = null;
        eDDIntroFragment.mCloseHtmlTextView = null;
        eDDIntroFragment.mHelpCenterHtmlTextView = null;
        this.f14542b.setOnClickListener(null);
        this.f14542b = null;
    }
}
