package com.paymaya.ui.support.view.fragment.impl;

import Bd.e;
import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;

/* JADX INFO: loaded from: classes4.dex */
public class SupportFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SupportFragment f14929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14930b;

    @UiThread
    public SupportFragment_ViewBinding(SupportFragment supportFragment, View view) {
        this.f14929a = supportFragment;
        supportFragment.mHtmlTextViewEmail = (HtmlTextView) Utils.findRequiredViewAsType(view, R.id.email_us_text_view_pma_fragment_support, "field 'mHtmlTextViewEmail'", HtmlTextView.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.messenger_button_pma_fragment_support, "method 'onMessageSupportClick'");
        this.f14930b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(supportFragment, 1));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        SupportFragment supportFragment = this.f14929a;
        if (supportFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14929a = null;
        supportFragment.mHtmlTextViewEmail = null;
        this.f14930b.setOnClickListener(null);
        this.f14930b = null;
    }
}
