package com.clevertap.android.sdk.inapp.fragment;

import D.S;
import D.d0;
import N.l;
import S1.v;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.paymaya.R;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CTInAppBaseFullFragment extends CTInAppBaseFragment {
    public static void C1(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, CloseImageView closeImageView) {
        j.g(relativeLayout, "relativeLayout");
        j.g(closeImageView, "closeImageView");
        layoutParams.width = (int) (relativeLayout.getMeasuredHeight() * 1.78f);
        layoutParams.gravity = 1;
        relativeLayout.setLayoutParams(layoutParams);
        v1(relativeLayout, closeImageView);
    }

    public static void v1(RelativeLayout relativeLayout, CloseImageView closeImageView) {
        j.g(relativeLayout, "relativeLayout");
        j.g(closeImageView, "closeImageView");
        relativeLayout.post(new v(16, closeImageView, relativeLayout));
    }

    public static void x1(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, CloseImageView closeImageView) {
        j.g(closeImageView, "closeImageView");
        layoutParams.height = (int) (relativeLayout.getMeasuredWidth() * 1.3f);
        relativeLayout.setLayoutParams(layoutParams);
        v1(relativeLayout, closeImageView);
    }

    public static void z1(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, CloseImageView closeImageView) {
        j.g(relativeLayout, "relativeLayout");
        j.g(closeImageView, "closeImageView");
        layoutParams.height = (int) (relativeLayout.getMeasuredWidth() * 1.78f);
        relativeLayout.setLayoutParams(layoutParams);
        v1(relativeLayout, closeImageView);
    }

    public final void A1(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, FrameLayout frameLayout, CloseImageView closeImageView) {
        j.g(relativeLayout, "relativeLayout");
        j.g(closeImageView, "closeImageView");
        int measuredWidth = (int) ((relativeLayout.getMeasuredWidth() - r1(200)) * 1.78f);
        int measuredHeight = frameLayout.getMeasuredHeight() - r1(280);
        if (measuredWidth > measuredHeight) {
            layoutParams.height = measuredHeight;
            layoutParams.width = (int) (measuredHeight / 1.78f);
        } else {
            layoutParams.height = measuredWidth;
            layoutParams.width = relativeLayout.getMeasuredWidth() - r1(200);
        }
        layoutParams.setMargins(r1(140), r1(140), r1(140), r1(140));
        relativeLayout.setLayoutParams(layoutParams);
        v1(relativeLayout, closeImageView);
    }

    public final void B1(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, FrameLayout frameLayout, CloseImageView closeImageView) {
        j.g(relativeLayout, "relativeLayout");
        j.g(closeImageView, "closeImageView");
        int measuredWidth = (int) (relativeLayout.getMeasuredWidth() * 1.78f);
        int measuredHeight = frameLayout.getMeasuredHeight() - r1(80);
        if (measuredWidth > measuredHeight) {
            layoutParams.height = measuredHeight;
            layoutParams.width = (int) (measuredHeight / 1.78f);
        } else {
            layoutParams.height = measuredWidth;
        }
        relativeLayout.setLayoutParams(layoutParams);
        v1(relativeLayout, closeImageView);
    }

    public final void D1(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, FrameLayout frameLayout, CloseImageView closeImageView) {
        j.g(relativeLayout, "relativeLayout");
        j.g(closeImageView, "closeImageView");
        int measuredHeight = (int) ((relativeLayout.getMeasuredHeight() - r1(120)) * 1.78f);
        int measuredWidth = frameLayout.getMeasuredWidth() - r1(280);
        if (measuredHeight > measuredWidth) {
            layoutParams.width = measuredWidth;
            layoutParams.height = (int) (measuredWidth / 1.78f);
        } else {
            layoutParams.width = measuredHeight;
            layoutParams.height = relativeLayout.getMeasuredHeight() - r1(120);
        }
        layoutParams.setMargins(r1(140), r1(100), r1(140), r1(100));
        layoutParams.gravity = 17;
        relativeLayout.setLayoutParams(layoutParams);
        v1(relativeLayout, closeImageView);
    }

    public final void E1(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, FrameLayout frameLayout, CloseImageView closeImageView) {
        j.g(relativeLayout, "relativeLayout");
        j.g(closeImageView, "closeImageView");
        int measuredHeight = (int) (relativeLayout.getMeasuredHeight() * 1.78f);
        int measuredWidth = frameLayout.getMeasuredWidth() - r1(80);
        if (measuredHeight > measuredWidth) {
            layoutParams.width = measuredWidth;
            layoutParams.height = (int) (measuredWidth / 1.78f);
        } else {
            layoutParams.width = measuredHeight;
        }
        layoutParams.gravity = 17;
        relativeLayout.setLayoutParams(layoutParams);
        v1(relativeLayout, closeImageView);
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    public void l1() {
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    public final void n1() {
        Object context = getContext();
        if (context instanceof InAppNotificationActivity) {
            l listener = (l) context;
            j.g(listener, "listener");
            this.f9522R = new WeakReference(listener);
        }
    }

    public final boolean w1() {
        FragmentActivity activity = getActivity();
        Pattern pattern = d0.f906a;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return false;
        }
        try {
            return getResources().getBoolean(R.bool.ctIsTablet);
        } catch (Exception unused) {
            S.b("Failed to decide whether device is a smart phone or tablet!");
            return false;
        }
    }

    public final void y1(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, CloseImageView closeImageView) {
        j.g(closeImageView, "closeImageView");
        layoutParams.setMargins(r1(140), r1(140), r1(140), r1(140));
        int measuredWidth = relativeLayout.getMeasuredWidth() - r1(210);
        layoutParams.width = measuredWidth;
        layoutParams.height = (int) (measuredWidth * 1.3f);
        relativeLayout.setLayoutParams(layoutParams);
        v1(relativeLayout, closeImageView);
    }
}
