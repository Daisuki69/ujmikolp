package com.paymaya.mayaui.common.view.widget;

import a7.C0654o;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import com.paymaya.common.utility.B;
import com.paymaya.common.utility.S;
import com.paymaya.common.widget.HtmlTextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaHtmlTextView extends HtmlTextView {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pattern f12048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaHtmlTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        this.f12048d = Pattern.compile("https?://\\S+");
    }

    @Override // com.paymaya.common.widget.HtmlTextView
    public final SpannableStringBuilder a(String str, B b8, S s9) {
        SpannableStringBuilder spannableStringBuilderA = super.a(str, b8, s9);
        Matcher matcher = this.f12048d.matcher(spannableStringBuilderA);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (iStart < spannableStringBuilderA.length() && iEnd <= spannableStringBuilderA.length()) {
                spannableStringBuilderA.setSpan(new C0654o(0, this, spannableStringBuilderA.subSequence(iStart, iEnd).toString()), iStart, iEnd, 33);
            }
        }
        return spannableStringBuilderA;
    }
}
