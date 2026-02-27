package com.clevertap.android.sdk.inapp.fragment;

import A7.c;
import Bj.C0165x;
import S.a;
import S.b;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.paymaya.R;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class CTInAppNativeCoverImageFragment extends CTInAppBaseFullFragment {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.inapp_cover_image, viewGroup, false);
        j.d(viewInflate);
        ViewCompat.setOnApplyWindowInsetsListener(viewInflate, new c(new C0165x(26), 9));
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.inapp_cover_image_frame_layout);
        frameLayout.setBackgroundColor(Color.parseColor(p1().f9505v));
        ImageView imageView = (ImageView) ((RelativeLayout) frameLayout.findViewById(R.id.cover_image_relative_layout)).findViewById(R.id.cover_image);
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
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        closeImageView.setOnClickListener(new b(this, 2));
        if (p1().f9479S) {
            closeImageView.setVisibility(0);
            return viewInflate;
        }
        closeImageView.setVisibility(8);
        return viewInflate;
    }
}
