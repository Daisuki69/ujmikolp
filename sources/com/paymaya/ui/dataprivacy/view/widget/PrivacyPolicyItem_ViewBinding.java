package com.paymaya.ui.dataprivacy.view.widget;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivacyPolicyItem_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PrivacyPolicyItem f14494a;

    @UiThread
    public PrivacyPolicyItem_ViewBinding(PrivacyPolicyItem privacyPolicyItem, View view) {
        this.f14494a = privacyPolicyItem;
        privacyPolicyItem.mTextViewName = (TextView) Utils.findRequiredViewAsType(view, R.id.consent_name_text_view_pma_view_consent_item, "field 'mTextViewName'", TextView.class);
        privacyPolicyItem.mTextViewDescription = (TextView) Utils.findRequiredViewAsType(view, R.id.consent_description_text_view_pma_view_consent_item, "field 'mTextViewDescription'", TextView.class);
        privacyPolicyItem.mCheckBoxConsent = (CheckBox) Utils.findRequiredViewAsType(view, R.id.check_box_pma_view_consent_item, "field 'mCheckBoxConsent'", CheckBox.class);
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        PrivacyPolicyItem privacyPolicyItem = this.f14494a;
        if (privacyPolicyItem == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14494a = null;
        privacyPolicyItem.mTextViewName = null;
        privacyPolicyItem.mTextViewDescription = null;
        privacyPolicyItem.mCheckBoxConsent = null;
    }
}
