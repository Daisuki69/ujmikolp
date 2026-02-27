package com.paymaya.common.widget;

import G5.v;
import Rj.f;
import W4.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes3.dex */
public final class TextViewWithImagesKt extends AppCompatTextView {
    public static final Spannable.Factory e = Spannable.Factory.getInstance();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11291b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewWithImagesKt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f6305u);
        this.f11292d = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.f11290a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        setText(getText());
    }

    private final float getLineHeight() {
        return getLineHeight() - getLineSpacingExtra();
    }

    public final int getDrawableHeight() {
        return this.c;
    }

    public final int getDrawableWidth() {
        return this.f11291b;
    }

    public final int getImageTextAlignment() {
        return this.f11290a;
    }

    public final void setDrawableHeight(int i) {
        this.c = i;
    }

    public final void setDrawableWidth(int i) {
        this.f11291b = i;
    }

    public final void setImageTextAlignment(int i) {
        this.f11290a = i;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence text, TextView.BufferType type) {
        boolean z4;
        j.g(text, "text");
        j.g(type, "type");
        Context context = getContext();
        j.f(context, "getContext(...)");
        Spannable spannableNewSpannable = e.newSpannable(text);
        j.d(spannableNewSpannable);
        Matcher matcher = Pattern.compile("\\Q[img=\\E([a-zA-Z0-9_]+?)\\Q]\\E").matcher(spannableNewSpannable);
        while (matcher.find()) {
            f fVarF = D.f((v[]) spannableNewSpannable.getSpans(matcher.start(), matcher.end(), v.class));
            while (fVarF.hasNext()) {
                v vVar = (v) fVarF.next();
                if (spannableNewSpannable.getSpanStart(vVar) < matcher.start() || spannableNewSpannable.getSpanEnd(vVar) > matcher.end()) {
                    z4 = false;
                    break;
                }
                spannableNewSpannable.removeSpan(vVar);
            }
            z4 = true;
            Drawable drawable = ContextCompat.getDrawable(context, context.getResources().getIdentifier(C2576A.b0(spannableNewSpannable.subSequence(matcher.start(1), matcher.end(1)).toString()).toString(), "drawable", context.getPackageName()));
            if (drawable != null) {
                if (this.f11292d) {
                    this.f11291b = (int) getLineHeight();
                    this.c = (int) getLineHeight();
                } else {
                    if (this.f11291b == 0) {
                        this.f11291b = drawable.getIntrinsicWidth();
                    }
                    if (this.c == 0) {
                        this.c = drawable.getIntrinsicHeight();
                    }
                }
                drawable.setBounds(0, 0, this.f11291b, this.c);
                if (z4) {
                    spannableNewSpannable.setSpan(new v(drawable, this.f11290a), matcher.start(), matcher.end(), 33);
                }
            }
        }
        super.setText(spannableNewSpannable, TextView.BufferType.SPANNABLE);
    }

    public final void setUseLineHeight(boolean z4) {
        this.f11292d = z4;
    }
}
