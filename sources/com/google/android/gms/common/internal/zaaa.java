package com.google.android.gms.common.internal;

import We.s;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.gms.common.util.DeviceProperties;

/* JADX INFO: loaded from: classes2.dex */
public final class zaaa extends Button {
    public zaaa(Context context, @Nullable AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i, int i4, int i6, int i10) {
        if (i == 0) {
            return i4;
        }
        if (i == 1) {
            return i6;
        }
        if (i == 2) {
            return i10;
        }
        throw new IllegalStateException(s.f(i, "Unknown color scheme: "));
    }

    public final void zaa(Resources resources, int i, int i4) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i6 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i6);
        setMinWidth(i6);
        int i10 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int i11 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int iZab = zab(i4, i10, i11, i11);
        int i12 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int i13 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int iZab2 = zab(i4, i12, i13, i13);
        if (i == 0 || i == 1) {
            iZab = iZab2;
        } else if (i != 2) {
            throw new IllegalStateException(s.f(i, "Unknown button size: "));
        }
        Drawable drawableWrap = DrawableCompat.wrap(resources.getDrawable(iZab));
        DrawableCompat.setTintList(drawableWrap, resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableWrap);
        int i14 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int i15 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i4, i14, i15, i15))));
        if (i == 0) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
        } else {
            if (i != 2) {
                throw new IllegalStateException(s.f(i, "Unknown button size: "));
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
