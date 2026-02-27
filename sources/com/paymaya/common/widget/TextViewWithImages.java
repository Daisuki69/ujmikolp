package com.paymaya.common.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class TextViewWithImages extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Spannable.Factory f11289a = Spannable.Factory.getInstance();

    public TextViewWithImages(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        boolean z4;
        Context context = getContext();
        float fFloatValue = BigDecimal.valueOf(getLineHeight()).subtract(BigDecimal.valueOf(getLineSpacingExtra())).floatValue();
        Spannable spannableNewSpannable = f11289a.newSpannable(charSequence);
        Matcher matcher = Pattern.compile("\\Q[img=\\E([a-zA-Z0-9_]+?)\\Q]\\E").matcher(spannableNewSpannable);
        while (matcher.find()) {
            for (ImageSpan imageSpan : (ImageSpan[]) spannableNewSpannable.getSpans(matcher.start(), matcher.end(), ImageSpan.class)) {
                if (spannableNewSpannable.getSpanStart(imageSpan) < matcher.start() || spannableNewSpannable.getSpanEnd(imageSpan) > matcher.end()) {
                    z4 = false;
                    break;
                }
                spannableNewSpannable.removeSpan(imageSpan);
            }
            z4 = true;
            Drawable drawable = ContextCompat.getDrawable(context, context.getResources().getIdentifier(spannableNewSpannable.subSequence(matcher.start(1), matcher.end(1)).toString().trim(), "drawable", context.getPackageName()));
            if (drawable != null) {
                int i = (int) fFloatValue;
                drawable.setBounds(0, 0, i, i);
                if (z4) {
                    spannableNewSpannable.setSpan(new ImageSpan(drawable, 1), matcher.start(), matcher.end(), 33);
                }
            }
        }
        super.setText(spannableNewSpannable, TextView.BufferType.SPANNABLE);
    }
}
