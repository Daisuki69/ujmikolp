package G5;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialHtmlFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialNativeFragment;
import com.paymaya.common.widget.ItemSlideLayoutView;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1772b;

    public /* synthetic */ x(Object obj, int i) {
        this.f1771a = i;
        this.f1772b = obj;
    }

    public void a(boolean z4) {
        switch (this.f1771a) {
            case 1:
                AnimationSet animationSet = new AnimationSet(true);
                CTInAppBasePartialHtmlFragment cTInAppBasePartialHtmlFragment = (CTInAppBasePartialHtmlFragment) this.f1772b;
                animationSet.addAnimation(z4 ? new TranslateAnimation(0.0f, cTInAppBasePartialHtmlFragment.r1(50), 0.0f, 0.0f) : new TranslateAnimation(0.0f, -cTInAppBasePartialHtmlFragment.r1(50), 0.0f, 0.0f));
                animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
                animationSet.setDuration(300L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setAnimationListener(new S.c(cTInAppBasePartialHtmlFragment, 0));
                N.d dVar = cTInAppBasePartialHtmlFragment.f9528V;
                if (dVar != null) {
                    dVar.startAnimation(animationSet);
                }
                break;
            default:
                AnimationSet animationSet2 = new AnimationSet(true);
                CTInAppBasePartialNativeFragment cTInAppBasePartialNativeFragment = (CTInAppBasePartialNativeFragment) this.f1772b;
                animationSet2.addAnimation(z4 ? new TranslateAnimation(0.0f, cTInAppBasePartialNativeFragment.r1(50), 0.0f, 0.0f) : new TranslateAnimation(0.0f, -cTInAppBasePartialNativeFragment.r1(50), 0.0f, 0.0f));
                animationSet2.addAnimation(new AlphaAnimation(1.0f, 0.0f));
                animationSet2.setDuration(300L);
                animationSet2.setFillAfter(true);
                animationSet2.setFillEnabled(true);
                animationSet2.setAnimationListener(new S.c(cTInAppBasePartialNativeFragment, 1));
                View view = cTInAppBasePartialNativeFragment.f9530V;
                if (view != null) {
                    view.startAnimation(animationSet2);
                }
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        switch (this.f1771a) {
            case 0:
                kotlin.jvm.internal.j.g(e, "e");
                return true;
            case 1:
            default:
                return super.onDown(e);
            case 2:
                kotlin.jvm.internal.j.g(e, "e");
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f, float f3) {
        switch (this.f1771a) {
            case 0:
                kotlin.jvm.internal.j.g(e22, "e2");
                return false;
            case 1:
                kotlin.jvm.internal.j.g(e22, "e2");
                if (motionEvent == null) {
                    return false;
                }
                if (motionEvent.getX() - e22.getX() > 120.0f && Math.abs(f) > 200.0d) {
                    a(false);
                } else {
                    if (e22.getX() - motionEvent.getX() <= 120.0f || Math.abs(f) <= 200.0d) {
                        return false;
                    }
                    a(true);
                }
                return true;
            default:
                kotlin.jvm.internal.j.g(e22, "e2");
                if (motionEvent == null) {
                    return false;
                }
                if (motionEvent.getX() - e22.getX() > 120.0f && Math.abs(f) > 200.0d) {
                    a(false);
                } else {
                    if (e22.getX() - motionEvent.getX() <= 120.0f || Math.abs(f) <= 200.0d) {
                        return false;
                    }
                    a(true);
                }
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f, float f3) {
        switch (this.f1771a) {
            case 0:
                kotlin.jvm.internal.j.g(e22, "e2");
                ItemSlideLayoutView itemSlideLayoutView = (ItemSlideLayoutView) this.f1772b;
                if (itemSlideLayoutView.getParent() == null) {
                    return false;
                }
                itemSlideLayoutView.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            default:
                return super.onScroll(motionEvent, e22, f, f3);
        }
    }
}
