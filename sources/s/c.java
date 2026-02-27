package S;

import android.view.animation.Animation;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialHtmlFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialNativeFragment;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CTInAppBasePartialFragment f5578b;

    public /* synthetic */ c(CTInAppBasePartialFragment cTInAppBasePartialFragment, int i) {
        this.f5577a = i;
        this.f5578b = cTInAppBasePartialFragment;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.f5577a) {
            case 0:
                CTInAppAction.CREATOR.getClass();
                CTInAppAction cTInAppAction = new CTInAppAction(null);
                cTInAppAction.f9471a = N.f.c;
                ((CTInAppBasePartialHtmlFragment) this.f5578b).u1(cTInAppAction, "swipe-dismiss", null);
                break;
            default:
                ((CTInAppBasePartialNativeFragment) this.f5578b).m1(null);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.f5577a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.f5577a;
    }
}
