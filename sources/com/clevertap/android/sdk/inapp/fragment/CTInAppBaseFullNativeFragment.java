package com.clevertap.android.sdk.inapp.fragment;

import S.a;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.Button;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import kotlin.jvm.internal.j;
import zj.x;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CTInAppBaseFullNativeFragment extends CTInAppBaseFullFragment {
    public final void F1(Button inAppButton, CTInAppNotificationButton cTInAppNotificationButton, int i) {
        char c;
        char c10;
        int i4;
        ShapeDrawable shapeDrawable;
        j.g(inAppButton, "inAppButton");
        if (cTInAppNotificationButton == null) {
            inAppButton.setVisibility(8);
            return;
        }
        inAppButton.setVisibility(0);
        inAppButton.setTag(Integer.valueOf(i));
        inAppButton.setText(cTInAppNotificationButton.f9509a);
        inAppButton.setTextColor(Color.parseColor(cTInAppNotificationButton.e));
        inAppButton.setOnClickListener(new a(this, 0));
        String str = cTInAppNotificationButton.f9511d;
        ShapeDrawable shapeDrawable2 = null;
        if (str.length() > 0) {
            Float fValueOf = x.d(str) ? Float.valueOf(Float.parseFloat(str)) : null;
            float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
            WindowManager windowManager = (WindowManager) requireContext().getSystemService("window");
            int i6 = 160;
            if (windowManager == null) {
                c = 7;
                c10 = 6;
            } else {
                c = 7;
                c10 = 6;
                if (Build.VERSION.SDK_INT >= 30) {
                    i4 = requireContext().getResources().getConfiguration().densityDpi;
                } else {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    i4 = displayMetrics.densityDpi;
                }
                if (i4 > 0) {
                    i6 = i4;
                }
            }
            float f = (480.0f / i6) * fFloatValue * 2;
            float[] fArr = new float[8];
            fArr[0] = f;
            fArr[1] = f;
            fArr[2] = f;
            fArr[3] = f;
            fArr[4] = f;
            fArr[5] = f;
            fArr[c10] = f;
            fArr[c] = f;
            shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
            shapeDrawable.getPaint().setColor(Color.parseColor(cTInAppNotificationButton.f9510b));
            shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
            shapeDrawable.getPaint().setAntiAlias(true);
            float[] fArr2 = new float[8];
            fArr2[0] = f;
            fArr2[1] = f;
            fArr2[2] = f;
            fArr2[3] = f;
            fArr2[4] = f;
            fArr2[5] = f;
            fArr2[c10] = f;
            fArr2[c] = f;
            float[] fArr3 = new float[8];
            fArr3[0] = f;
            fArr3[1] = f;
            fArr3[2] = f;
            fArr3[3] = f;
            fArr3[4] = f;
            fArr3[5] = f;
            fArr3[c10] = f;
            fArr3[c] = f;
            shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr2, null, fArr3));
        } else {
            shapeDrawable = null;
        }
        String str2 = cTInAppNotificationButton.c;
        if (str2.length() != 0 && shapeDrawable2 != null) {
            shapeDrawable2.getPaint().setColor(Color.parseColor(str2));
            shapeDrawable2.setPadding(1, 1, 1, 1);
            shapeDrawable2.getPaint().setStyle(Paint.Style.FILL);
        }
        if (shapeDrawable == null || shapeDrawable2 == null) {
            return;
        }
        inAppButton.setBackground(new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable}));
    }
}
