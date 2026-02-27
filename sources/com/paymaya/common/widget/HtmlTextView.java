package com.paymaya.common.widget;

import G5.s;
import G5.t;
import W4.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.LeadingMarginSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.paymaya.R;
import com.paymaya.common.utility.B;
import com.paymaya.common.utility.S;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class HtmlTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f11270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11271b;
    public boolean c;

    public HtmlTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11271b = true;
        setAttributes(attributeSet);
        setTextHTML(getInitializerText().toString());
    }

    private CharSequence getInitializerText() {
        return getText();
    }

    public SpannableStringBuilder a(String str, B b8, S s9) {
        setLinksClickable(true);
        setHighlightColor(ContextCompat.getColor(getContext(), R.color.transparent));
        setMovementMethod(LinkMovementMethod.getInstance());
        Spanned spannedFromHtml = b8 != null ? Html.fromHtml(str.replace("<li>", "<listItem>").replace("</li>", "</listItem>").replace("<\\/li>", "</listItem>"), s9, b8) : Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
            spannableStringBuilder.setSpan(new s(this, uRLSpan, spannableStringBuilder.subSequence(spanStart, spanEnd).toString()), spanStart, spanEnd, spannableStringBuilder.getSpanFlags(uRLSpan));
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        return spannableStringBuilder;
    }

    public final void setAttributes(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.f6293b);
        this.f11271b = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setEnableClickableTextListener(boolean z4) {
        this.c = z4;
    }

    public void setOnLinkClickListener(t tVar) {
        this.f11270a = tVar;
    }

    public final void setTextHTML(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setText(a(str, null, null));
    }

    public final void setTextHTMLWithIndention(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilderA = a(str, null, null);
        SpannableString spannableString = new SpannableString(spannableStringBuilderA);
        spannableString.setSpan(new LeadingMarginSpan.Standard(0, 45), 0, spannableStringBuilderA.length(), 0);
        setText(spannableString);
    }

    public HtmlTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f11271b = true;
        setAttributes(attributeSet);
        setTextHTML(getInitializerText().toString());
    }
}
