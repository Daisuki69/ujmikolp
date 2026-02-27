package com.paymaya.ui.dataprivacy.view.widget;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivacyPolicyItem extends LinearLayout {

    @BindView(R.id.check_box_pma_view_consent_item)
    public CheckBox mCheckBoxConsent;

    @BindView(R.id.consent_description_text_view_pma_view_consent_item)
    public TextView mTextViewDescription;

    @BindView(R.id.consent_name_text_view_pma_view_consent_item)
    public TextView mTextViewName;

    public final CheckBox getMCheckBoxConsent() {
        CheckBox checkBox = this.mCheckBoxConsent;
        if (checkBox != null) {
            return checkBox;
        }
        j.n("mCheckBoxConsent");
        throw null;
    }

    public final TextView getMTextViewDescription() {
        TextView textView = this.mTextViewDescription;
        if (textView != null) {
            return textView;
        }
        j.n("mTextViewDescription");
        throw null;
    }

    public final TextView getMTextViewName() {
        TextView textView = this.mTextViewName;
        if (textView != null) {
            return textView;
        }
        j.n("mTextViewName");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setCheckBoxConsent(boolean z4) {
        getMCheckBoxConsent().setChecked(z4);
    }

    public final void setMCheckBoxConsent(CheckBox checkBox) {
        j.g(checkBox, "<set-?>");
        this.mCheckBoxConsent = checkBox;
    }

    public final void setMTextViewDescription(TextView textView) {
        j.g(textView, "<set-?>");
        this.mTextViewDescription = textView;
    }

    public final void setMTextViewName(TextView textView) {
        j.g(textView, "<set-?>");
        this.mTextViewName = textView;
    }
}
