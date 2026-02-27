package S;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialImageFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout f5582b;
    public final /* synthetic */ CTInAppBaseFullFragment c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CloseImageView f5583d;

    public /* synthetic */ e(RelativeLayout relativeLayout, CTInAppBaseFullFragment cTInAppBaseFullFragment, CloseImageView closeImageView, int i) {
        this.f5581a = i;
        this.f5582b = relativeLayout;
        this.c = cTInAppBaseFullFragment;
        this.f5583d = closeImageView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f5581a) {
            case 0:
                RelativeLayout relativeLayout = this.f5582b;
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                j.e(layoutParams, numX49.tnTj78("bPj2"));
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment = (CTInAppNativeHalfInterstitialImageFragment) this.c;
                boolean z4 = cTInAppNativeHalfInterstitialImageFragment.p1().f9481U;
                CloseImageView closeImageView = this.f5583d;
                if (!(z4 && cTInAppNativeHalfInterstitialImageFragment.w1()) && cTInAppNativeHalfInterstitialImageFragment.w1()) {
                    j.d(closeImageView);
                    cTInAppNativeHalfInterstitialImageFragment.y1(relativeLayout, layoutParams2, closeImageView);
                } else {
                    j.d(closeImageView);
                    CTInAppBaseFullFragment.x1(relativeLayout, layoutParams2, closeImageView);
                }
                relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                break;
            case 1:
                final RelativeLayout relativeLayout2 = this.f5582b;
                ViewGroup.LayoutParams layoutParams3 = relativeLayout2.getLayoutParams();
                j.e(layoutParams3, numX49.tnTj78("bPjb"));
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment2 = (CTInAppNativeHalfInterstitialImageFragment) this.c;
                boolean z5 = cTInAppNativeHalfInterstitialImageFragment2.p1().f9481U;
                final CloseImageView closeImageView2 = this.f5583d;
                if (z5 && cTInAppNativeHalfInterstitialImageFragment2.w1()) {
                    layoutParams4.width = (int) (relativeLayout2.getMeasuredHeight() * 1.3f);
                    layoutParams4.gravity = 17;
                    relativeLayout2.setLayoutParams(layoutParams4);
                    final int i = 5;
                    relativeLayout2.post(new Runnable() { // from class: S.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    CloseImageView closeImageView3 = closeImageView2;
                                    int measuredWidth = closeImageView3.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout3 = relativeLayout2;
                                    closeImageView3.setX(relativeLayout3.getRight() - measuredWidth);
                                    closeImageView3.setY(relativeLayout3.getTop() - measuredWidth);
                                    break;
                                case 1:
                                    CloseImageView closeImageView4 = closeImageView2;
                                    int measuredWidth2 = closeImageView4.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout4 = relativeLayout2;
                                    closeImageView4.setX(relativeLayout4.getRight() - measuredWidth2);
                                    closeImageView4.setY(relativeLayout4.getTop() - measuredWidth2);
                                    break;
                                case 2:
                                    CloseImageView closeImageView5 = closeImageView2;
                                    int measuredWidth3 = closeImageView5.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout5 = relativeLayout2;
                                    closeImageView5.setX(relativeLayout5.getRight() - measuredWidth3);
                                    closeImageView5.setY(relativeLayout5.getTop() - measuredWidth3);
                                    break;
                                case 3:
                                    CloseImageView closeImageView6 = closeImageView2;
                                    int measuredWidth4 = closeImageView6.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout6 = relativeLayout2;
                                    closeImageView6.setX(relativeLayout6.getRight() - measuredWidth4);
                                    closeImageView6.setY(relativeLayout6.getTop() - measuredWidth4);
                                    break;
                                case 4:
                                    CloseImageView closeImageView7 = closeImageView2;
                                    int measuredWidth5 = closeImageView7.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout7 = relativeLayout2;
                                    closeImageView7.setX(relativeLayout7.getRight() - measuredWidth5);
                                    closeImageView7.setY(relativeLayout7.getTop() - measuredWidth5);
                                    break;
                                default:
                                    CloseImageView closeImageView8 = closeImageView2;
                                    int measuredWidth6 = closeImageView8.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout8 = relativeLayout2;
                                    closeImageView8.setX(relativeLayout8.getRight() - measuredWidth6);
                                    closeImageView8.setY(relativeLayout8.getTop() - measuredWidth6);
                                    break;
                            }
                        }
                    });
                } else if (cTInAppNativeHalfInterstitialImageFragment2.w1()) {
                    layoutParams4.setMargins(cTInAppNativeHalfInterstitialImageFragment2.r1(140), cTInAppNativeHalfInterstitialImageFragment2.r1(100), cTInAppNativeHalfInterstitialImageFragment2.r1(140), cTInAppNativeHalfInterstitialImageFragment2.r1(100));
                    int measuredHeight = relativeLayout2.getMeasuredHeight() - cTInAppNativeHalfInterstitialImageFragment2.r1(130);
                    layoutParams4.height = measuredHeight;
                    layoutParams4.width = (int) (measuredHeight * 1.3f);
                    layoutParams4.gravity = 17;
                    relativeLayout2.setLayoutParams(layoutParams4);
                    final int i4 = 3;
                    relativeLayout2.post(new Runnable() { // from class: S.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    CloseImageView closeImageView3 = closeImageView2;
                                    int measuredWidth = closeImageView3.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout3 = relativeLayout2;
                                    closeImageView3.setX(relativeLayout3.getRight() - measuredWidth);
                                    closeImageView3.setY(relativeLayout3.getTop() - measuredWidth);
                                    break;
                                case 1:
                                    CloseImageView closeImageView4 = closeImageView2;
                                    int measuredWidth2 = closeImageView4.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout4 = relativeLayout2;
                                    closeImageView4.setX(relativeLayout4.getRight() - measuredWidth2);
                                    closeImageView4.setY(relativeLayout4.getTop() - measuredWidth2);
                                    break;
                                case 2:
                                    CloseImageView closeImageView5 = closeImageView2;
                                    int measuredWidth3 = closeImageView5.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout5 = relativeLayout2;
                                    closeImageView5.setX(relativeLayout5.getRight() - measuredWidth3);
                                    closeImageView5.setY(relativeLayout5.getTop() - measuredWidth3);
                                    break;
                                case 3:
                                    CloseImageView closeImageView6 = closeImageView2;
                                    int measuredWidth4 = closeImageView6.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout6 = relativeLayout2;
                                    closeImageView6.setX(relativeLayout6.getRight() - measuredWidth4);
                                    closeImageView6.setY(relativeLayout6.getTop() - measuredWidth4);
                                    break;
                                case 4:
                                    CloseImageView closeImageView7 = closeImageView2;
                                    int measuredWidth5 = closeImageView7.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout7 = relativeLayout2;
                                    closeImageView7.setX(relativeLayout7.getRight() - measuredWidth5);
                                    closeImageView7.setY(relativeLayout7.getTop() - measuredWidth5);
                                    break;
                                default:
                                    CloseImageView closeImageView8 = closeImageView2;
                                    int measuredWidth6 = closeImageView8.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout8 = relativeLayout2;
                                    closeImageView8.setX(relativeLayout8.getRight() - measuredWidth6);
                                    closeImageView8.setY(relativeLayout8.getTop() - measuredWidth6);
                                    break;
                            }
                        }
                    });
                } else {
                    layoutParams4.width = (int) (relativeLayout2.getMeasuredHeight() * 1.3f);
                    layoutParams4.gravity = 1;
                    relativeLayout2.setLayoutParams(layoutParams4);
                    final int i6 = 4;
                    relativeLayout2.post(new Runnable() { // from class: S.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i6) {
                                case 0:
                                    CloseImageView closeImageView3 = closeImageView2;
                                    int measuredWidth = closeImageView3.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout3 = relativeLayout2;
                                    closeImageView3.setX(relativeLayout3.getRight() - measuredWidth);
                                    closeImageView3.setY(relativeLayout3.getTop() - measuredWidth);
                                    break;
                                case 1:
                                    CloseImageView closeImageView4 = closeImageView2;
                                    int measuredWidth2 = closeImageView4.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout4 = relativeLayout2;
                                    closeImageView4.setX(relativeLayout4.getRight() - measuredWidth2);
                                    closeImageView4.setY(relativeLayout4.getTop() - measuredWidth2);
                                    break;
                                case 2:
                                    CloseImageView closeImageView5 = closeImageView2;
                                    int measuredWidth3 = closeImageView5.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout5 = relativeLayout2;
                                    closeImageView5.setX(relativeLayout5.getRight() - measuredWidth3);
                                    closeImageView5.setY(relativeLayout5.getTop() - measuredWidth3);
                                    break;
                                case 3:
                                    CloseImageView closeImageView6 = closeImageView2;
                                    int measuredWidth4 = closeImageView6.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout6 = relativeLayout2;
                                    closeImageView6.setX(relativeLayout6.getRight() - measuredWidth4);
                                    closeImageView6.setY(relativeLayout6.getTop() - measuredWidth4);
                                    break;
                                case 4:
                                    CloseImageView closeImageView7 = closeImageView2;
                                    int measuredWidth5 = closeImageView7.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout7 = relativeLayout2;
                                    closeImageView7.setX(relativeLayout7.getRight() - measuredWidth5);
                                    closeImageView7.setY(relativeLayout7.getTop() - measuredWidth5);
                                    break;
                                default:
                                    CloseImageView closeImageView8 = closeImageView2;
                                    int measuredWidth6 = closeImageView8.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout8 = relativeLayout2;
                                    closeImageView8.setX(relativeLayout8.getRight() - measuredWidth6);
                                    closeImageView8.setY(relativeLayout8.getTop() - measuredWidth6);
                                    break;
                            }
                        }
                    });
                }
                relativeLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                break;
            default:
                final RelativeLayout relativeLayout3 = this.f5582b;
                ViewGroup.LayoutParams layoutParams5 = relativeLayout3.getLayoutParams();
                j.e(layoutParams5, numX49.tnTj78("bPjP"));
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment = (CTInAppNativeHalfInterstitialFragment) this.c;
                boolean z8 = cTInAppNativeHalfInterstitialFragment.p1().f9481U;
                final CloseImageView closeImageView3 = this.f5583d;
                if (z8 && cTInAppNativeHalfInterstitialFragment.w1()) {
                    layoutParams6.width = (int) (relativeLayout3.getMeasuredHeight() * 1.3f);
                    layoutParams6.gravity = 17;
                    relativeLayout3.setLayoutParams(layoutParams6);
                    final int i10 = 2;
                    relativeLayout3.post(new Runnable() { // from class: S.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    CloseImageView closeImageView32 = closeImageView3;
                                    int measuredWidth = closeImageView32.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout32 = relativeLayout3;
                                    closeImageView32.setX(relativeLayout32.getRight() - measuredWidth);
                                    closeImageView32.setY(relativeLayout32.getTop() - measuredWidth);
                                    break;
                                case 1:
                                    CloseImageView closeImageView4 = closeImageView3;
                                    int measuredWidth2 = closeImageView4.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout4 = relativeLayout3;
                                    closeImageView4.setX(relativeLayout4.getRight() - measuredWidth2);
                                    closeImageView4.setY(relativeLayout4.getTop() - measuredWidth2);
                                    break;
                                case 2:
                                    CloseImageView closeImageView5 = closeImageView3;
                                    int measuredWidth3 = closeImageView5.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout5 = relativeLayout3;
                                    closeImageView5.setX(relativeLayout5.getRight() - measuredWidth3);
                                    closeImageView5.setY(relativeLayout5.getTop() - measuredWidth3);
                                    break;
                                case 3:
                                    CloseImageView closeImageView6 = closeImageView3;
                                    int measuredWidth4 = closeImageView6.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout6 = relativeLayout3;
                                    closeImageView6.setX(relativeLayout6.getRight() - measuredWidth4);
                                    closeImageView6.setY(relativeLayout6.getTop() - measuredWidth4);
                                    break;
                                case 4:
                                    CloseImageView closeImageView7 = closeImageView3;
                                    int measuredWidth5 = closeImageView7.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout7 = relativeLayout3;
                                    closeImageView7.setX(relativeLayout7.getRight() - measuredWidth5);
                                    closeImageView7.setY(relativeLayout7.getTop() - measuredWidth5);
                                    break;
                                default:
                                    CloseImageView closeImageView8 = closeImageView3;
                                    int measuredWidth6 = closeImageView8.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout8 = relativeLayout3;
                                    closeImageView8.setX(relativeLayout8.getRight() - measuredWidth6);
                                    closeImageView8.setY(relativeLayout8.getTop() - measuredWidth6);
                                    break;
                            }
                        }
                    });
                } else if (cTInAppNativeHalfInterstitialFragment.w1()) {
                    layoutParams6.setMargins(cTInAppNativeHalfInterstitialFragment.r1(140), cTInAppNativeHalfInterstitialFragment.r1(100), cTInAppNativeHalfInterstitialFragment.r1(140), cTInAppNativeHalfInterstitialFragment.r1(100));
                    int measuredHeight2 = relativeLayout3.getMeasuredHeight() - cTInAppNativeHalfInterstitialFragment.r1(130);
                    layoutParams6.height = measuredHeight2;
                    layoutParams6.width = (int) (measuredHeight2 * 1.3f);
                    layoutParams6.gravity = 17;
                    relativeLayout3.setLayoutParams(layoutParams6);
                    final int i11 = 0;
                    relativeLayout3.post(new Runnable() { // from class: S.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    CloseImageView closeImageView32 = closeImageView3;
                                    int measuredWidth = closeImageView32.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout32 = relativeLayout3;
                                    closeImageView32.setX(relativeLayout32.getRight() - measuredWidth);
                                    closeImageView32.setY(relativeLayout32.getTop() - measuredWidth);
                                    break;
                                case 1:
                                    CloseImageView closeImageView4 = closeImageView3;
                                    int measuredWidth2 = closeImageView4.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout4 = relativeLayout3;
                                    closeImageView4.setX(relativeLayout4.getRight() - measuredWidth2);
                                    closeImageView4.setY(relativeLayout4.getTop() - measuredWidth2);
                                    break;
                                case 2:
                                    CloseImageView closeImageView5 = closeImageView3;
                                    int measuredWidth3 = closeImageView5.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout5 = relativeLayout3;
                                    closeImageView5.setX(relativeLayout5.getRight() - measuredWidth3);
                                    closeImageView5.setY(relativeLayout5.getTop() - measuredWidth3);
                                    break;
                                case 3:
                                    CloseImageView closeImageView6 = closeImageView3;
                                    int measuredWidth4 = closeImageView6.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout6 = relativeLayout3;
                                    closeImageView6.setX(relativeLayout6.getRight() - measuredWidth4);
                                    closeImageView6.setY(relativeLayout6.getTop() - measuredWidth4);
                                    break;
                                case 4:
                                    CloseImageView closeImageView7 = closeImageView3;
                                    int measuredWidth5 = closeImageView7.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout7 = relativeLayout3;
                                    closeImageView7.setX(relativeLayout7.getRight() - measuredWidth5);
                                    closeImageView7.setY(relativeLayout7.getTop() - measuredWidth5);
                                    break;
                                default:
                                    CloseImageView closeImageView8 = closeImageView3;
                                    int measuredWidth6 = closeImageView8.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout8 = relativeLayout3;
                                    closeImageView8.setX(relativeLayout8.getRight() - measuredWidth6);
                                    closeImageView8.setY(relativeLayout8.getTop() - measuredWidth6);
                                    break;
                            }
                        }
                    });
                } else {
                    layoutParams6.width = (int) (relativeLayout3.getMeasuredHeight() * 1.3f);
                    final int i12 = 1;
                    layoutParams6.gravity = 1;
                    relativeLayout3.setLayoutParams(layoutParams6);
                    relativeLayout3.post(new Runnable() { // from class: S.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    CloseImageView closeImageView32 = closeImageView3;
                                    int measuredWidth = closeImageView32.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout32 = relativeLayout3;
                                    closeImageView32.setX(relativeLayout32.getRight() - measuredWidth);
                                    closeImageView32.setY(relativeLayout32.getTop() - measuredWidth);
                                    break;
                                case 1:
                                    CloseImageView closeImageView4 = closeImageView3;
                                    int measuredWidth2 = closeImageView4.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout4 = relativeLayout3;
                                    closeImageView4.setX(relativeLayout4.getRight() - measuredWidth2);
                                    closeImageView4.setY(relativeLayout4.getTop() - measuredWidth2);
                                    break;
                                case 2:
                                    CloseImageView closeImageView5 = closeImageView3;
                                    int measuredWidth3 = closeImageView5.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout5 = relativeLayout3;
                                    closeImageView5.setX(relativeLayout5.getRight() - measuredWidth3);
                                    closeImageView5.setY(relativeLayout5.getTop() - measuredWidth3);
                                    break;
                                case 3:
                                    CloseImageView closeImageView6 = closeImageView3;
                                    int measuredWidth4 = closeImageView6.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout6 = relativeLayout3;
                                    closeImageView6.setX(relativeLayout6.getRight() - measuredWidth4);
                                    closeImageView6.setY(relativeLayout6.getTop() - measuredWidth4);
                                    break;
                                case 4:
                                    CloseImageView closeImageView7 = closeImageView3;
                                    int measuredWidth5 = closeImageView7.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout7 = relativeLayout3;
                                    closeImageView7.setX(relativeLayout7.getRight() - measuredWidth5);
                                    closeImageView7.setY(relativeLayout7.getTop() - measuredWidth5);
                                    break;
                                default:
                                    CloseImageView closeImageView8 = closeImageView3;
                                    int measuredWidth6 = closeImageView8.getMeasuredWidth() / 2;
                                    RelativeLayout relativeLayout8 = relativeLayout3;
                                    closeImageView8.setX(relativeLayout8.getRight() - measuredWidth6);
                                    closeImageView8.setY(relativeLayout8.getTop() - measuredWidth6);
                                    break;
                            }
                        }
                    });
                }
                relativeLayout3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                break;
        }
    }
}
