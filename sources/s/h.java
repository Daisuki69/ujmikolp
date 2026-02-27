package S;

import D.H;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialImageFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout f5590b;
    public final /* synthetic */ CTInAppBaseFullFragment c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5591d;
    public final /* synthetic */ CloseImageView e;

    public /* synthetic */ h(RelativeLayout relativeLayout, CTInAppBaseFullFragment cTInAppBaseFullFragment, Object obj, CloseImageView closeImageView, int i) {
        this.f5589a = i;
        this.f5590b = relativeLayout;
        this.c = cTInAppBaseFullFragment;
        this.f5591d = obj;
        this.e = closeImageView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f5589a) {
            case 0:
                RelativeLayout relativeLayout = this.f5590b;
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                j.e(layoutParams, numX49.tnTj78("bPjB"));
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment = (CTInAppNativeInterstitialImageFragment) this.c;
                boolean z4 = cTInAppNativeInterstitialImageFragment.p1().f9481U;
                FrameLayout frameLayout = (FrameLayout) this.f5591d;
                CloseImageView closeImageView = this.e;
                if (z4 && cTInAppNativeInterstitialImageFragment.w1()) {
                    j.d(closeImageView);
                    cTInAppNativeInterstitialImageFragment.B1(relativeLayout, layoutParams2, frameLayout, closeImageView);
                } else if (cTInAppNativeInterstitialImageFragment.w1()) {
                    j.d(closeImageView);
                    cTInAppNativeInterstitialImageFragment.A1(relativeLayout, layoutParams2, frameLayout, closeImageView);
                } else {
                    j.d(closeImageView);
                    CTInAppBaseFullFragment.z1(relativeLayout, layoutParams2, closeImageView);
                }
                relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                break;
            case 1:
                RelativeLayout relativeLayout2 = this.f5590b;
                ViewGroup.LayoutParams layoutParams3 = relativeLayout2.getLayoutParams();
                j.e(layoutParams3, numX49.tnTj78("bPjk"));
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment2 = (CTInAppNativeInterstitialImageFragment) this.c;
                boolean z5 = cTInAppNativeInterstitialImageFragment2.p1().f9481U;
                FrameLayout frameLayout2 = (FrameLayout) this.f5591d;
                CloseImageView closeImageView2 = this.e;
                if (z5 && cTInAppNativeInterstitialImageFragment2.w1()) {
                    j.d(closeImageView2);
                    cTInAppNativeInterstitialImageFragment2.E1(relativeLayout2, layoutParams4, frameLayout2, closeImageView2);
                } else if (cTInAppNativeInterstitialImageFragment2.w1()) {
                    j.d(closeImageView2);
                    cTInAppNativeInterstitialImageFragment2.D1(relativeLayout2, layoutParams4, frameLayout2, closeImageView2);
                } else {
                    j.d(closeImageView2);
                    CTInAppBaseFullFragment.C1(relativeLayout2, layoutParams4, closeImageView2);
                }
                relativeLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                break;
            default:
                RelativeLayout relativeLayout3 = this.f5590b;
                ViewGroup.LayoutParams layoutParams5 = relativeLayout3.getLayoutParams();
                j.e(layoutParams5, numX49.tnTj78("bPjZ"));
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment = (CTInAppNativeHalfInterstitialFragment) this.c;
                boolean z8 = cTInAppNativeHalfInterstitialFragment.p1().f9481U;
                CloseImageView closeImageView3 = this.e;
                if (!(z8 && cTInAppNativeHalfInterstitialFragment.w1()) && (!(cTInAppNativeHalfInterstitialFragment.p1().f9500q && H.h(((LayoutInflater) this.f5591d).getContext()) == 2) && cTInAppNativeHalfInterstitialFragment.w1())) {
                    j.d(closeImageView3);
                    cTInAppNativeHalfInterstitialFragment.y1(relativeLayout3, layoutParams6, closeImageView3);
                } else {
                    j.d(closeImageView3);
                    CTInAppBaseFullFragment.x1(relativeLayout3, layoutParams6, closeImageView3);
                }
                relativeLayout3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                break;
        }
    }
}
