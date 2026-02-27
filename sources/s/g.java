package S;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CTInAppNativeInterstitialFragment f5587b;
    public final /* synthetic */ FrameLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CloseImageView f5588d;

    public /* synthetic */ g(CTInAppNativeInterstitialFragment cTInAppNativeInterstitialFragment, FrameLayout frameLayout, CloseImageView closeImageView, int i) {
        this.f5586a = i;
        this.f5587b = cTInAppNativeInterstitialFragment;
        this.c = frameLayout;
        this.f5588d = closeImageView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f5586a) {
            case 0:
                CTInAppNativeInterstitialFragment cTInAppNativeInterstitialFragment = this.f5587b;
                RelativeLayout relativeLayout = cTInAppNativeInterstitialFragment.f9536Y;
                if (relativeLayout != null) {
                    ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                    j.e(layoutParams, numX49.tnTj78("bPjr"));
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    boolean z4 = cTInAppNativeInterstitialFragment.p1().f9481U;
                    FrameLayout frameLayout = this.c;
                    CloseImageView closeImageView = this.f5588d;
                    if (z4 && cTInAppNativeInterstitialFragment.w1()) {
                        cTInAppNativeInterstitialFragment.B1(relativeLayout, layoutParams2, frameLayout, closeImageView);
                    } else if (cTInAppNativeInterstitialFragment.w1()) {
                        cTInAppNativeInterstitialFragment.A1(relativeLayout, layoutParams2, frameLayout, closeImageView);
                    } else {
                        CTInAppBaseFullFragment.z1(relativeLayout, layoutParams2, closeImageView);
                    }
                    relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                CTInAppNativeInterstitialFragment cTInAppNativeInterstitialFragment2 = this.f5587b;
                RelativeLayout relativeLayout2 = cTInAppNativeInterstitialFragment2.f9536Y;
                if (relativeLayout2 != null) {
                    ViewGroup.LayoutParams layoutParams3 = relativeLayout2.getLayoutParams();
                    j.e(layoutParams3, numX49.tnTj78("bPjL"));
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    boolean z5 = cTInAppNativeInterstitialFragment2.p1().f9481U;
                    FrameLayout frameLayout2 = this.c;
                    CloseImageView closeImageView2 = this.f5588d;
                    if (z5 && cTInAppNativeInterstitialFragment2.w1()) {
                        cTInAppNativeInterstitialFragment2.E1(relativeLayout2, layoutParams4, frameLayout2, closeImageView2);
                    } else if (cTInAppNativeInterstitialFragment2.w1()) {
                        cTInAppNativeInterstitialFragment2.D1(relativeLayout2, layoutParams4, frameLayout2, closeImageView2);
                    } else {
                        CTInAppBaseFullFragment.C1(relativeLayout2, layoutParams4, closeImageView2);
                    }
                    relativeLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
        }
    }
}
