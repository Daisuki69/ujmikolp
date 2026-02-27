package com.clevertap.android.sdk.inapp.fragment;

import S.a;
import S.b;
import S.e;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.paymaya.R;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class CTInAppNativeHalfInterstitialImageFragment extends CTInAppBaseFullFragment {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = (p1().f9481U && w1()) ? inflater.inflate(R.layout.tab_inapp_half_interstitial_image, viewGroup, false) : inflater.inflate(R.layout.inapp_half_interstitial_image, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.inapp_half_interstitial_image_frame_layout);
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.half_interstitial_image_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(p1().f9505v));
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.half_interstitial_image);
        int i = this.f9520P;
        if (i == 1) {
            relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new e(relativeLayout, this, closeImageView, 0));
        } else if (i == 2) {
            relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new e(relativeLayout, this, closeImageView, 1));
        }
        CTInAppNotificationMedia cTInAppNotificationMediaB = p1().b(this.f9520P);
        if (cTInAppNotificationMediaB != null) {
            String str = cTInAppNotificationMediaB.c;
            if (!C2576A.H(str)) {
                imageView.setContentDescription(str);
            }
            Bitmap bitmapA = t1().a(cTInAppNotificationMediaB.f9512a);
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
                imageView.setTag(0);
                imageView.setOnClickListener(new a(this, 0));
            }
        }
        closeImageView.setOnClickListener(new b(this, 4));
        if (p1().f9479S) {
            closeImageView.setVisibility(0);
            return viewInflate;
        }
        closeImageView.setVisibility(8);
        return viewInflate;
    }
}
