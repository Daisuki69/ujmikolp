package com.clevertap.android.sdk.inapp.fragment;

import D.H;
import S.b;
import S.e;
import S.h;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.paymaya.R;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class CTInAppNativeHalfInterstitialFragment extends CTInAppBaseFullNativeFragment {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate;
        CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment;
        j.g(inflater, "inflater");
        ArrayList arrayList = new ArrayList();
        if ((p1().f9481U && w1()) || (p1().f9500q && H.h(inflater.getContext()) == 2)) {
            viewInflate = inflater.inflate(R.layout.tab_inapp_half_interstitial, viewGroup, false);
            j.d(viewInflate);
        } else {
            viewInflate = inflater.inflate(R.layout.inapp_half_interstitial, viewGroup, false);
            j.d(viewInflate);
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.inapp_half_interstitial_frame_layout);
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.half_interstitial_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(p1().f9505v));
        int i = this.f9520P;
        if (i != 1) {
            if (i == 2) {
                relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new e(relativeLayout, this, closeImageView, 2));
            }
            cTInAppNativeHalfInterstitialFragment = this;
        } else {
            cTInAppNativeHalfInterstitialFragment = this;
            relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new h(relativeLayout, cTInAppNativeHalfInterstitialFragment, inflater, closeImageView, 2));
        }
        CTInAppNotificationMedia cTInAppNotificationMediaB = p1().b(cTInAppNativeHalfInterstitialFragment.f9520P);
        if (cTInAppNotificationMediaB != null) {
            ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.backgroundImage);
            String str = cTInAppNotificationMediaB.c;
            if (!C2576A.H(str)) {
                imageView.setContentDescription(str);
            }
            Bitmap bitmapA = t1().a(cTInAppNotificationMediaB.f9512a);
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
            }
        }
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.half_interstitial_linear_layout);
        Button button = (Button) linearLayout.findViewById(R.id.half_interstitial_button1);
        j.d(button);
        arrayList.add(button);
        Button button2 = (Button) linearLayout.findViewById(R.id.half_interstitial_button2);
        j.d(button2);
        arrayList.add(button2);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.half_interstitial_title);
        textView.setText(p1().f9496l);
        textView.setTextColor(Color.parseColor(p1().f9488a0));
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.half_interstitial_message);
        textView2.setText(p1().m);
        textView2.setTextColor(Color.parseColor(p1().f9484X));
        ArrayList arrayList2 = p1().i;
        if (arrayList2.size() == 1) {
            int i4 = cTInAppNativeHalfInterstitialFragment.f9520P;
            if (i4 == 2) {
                button.setVisibility(8);
            } else if (i4 == 1) {
                button.setVisibility(4);
            }
            F1(button2, (CTInAppNotificationButton) arrayList2.get(0), 0);
        } else if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (i6 < 2) {
                    F1((Button) arrayList.get(i6), (CTInAppNotificationButton) arrayList2.get(i6), i6);
                }
            }
        }
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        closeImageView.setOnClickListener(new b(this, 3));
        if (p1().f9479S) {
            closeImageView.setVisibility(0);
            return viewInflate;
        }
        closeImageView.setVisibility(8);
        return viewInflate;
    }
}
