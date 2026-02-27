package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7846b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7847d;

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3) {
        this.f7845a = i;
        this.f7846b = obj;
        this.c = obj2;
        this.f7847d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7845a) {
            case 0:
                DefaultSpecialEffectsController$AnimationEffect$onCommit$1.onAnimationEnd$lambda$0((ViewGroup) this.f7846b, (View) this.c, (DefaultSpecialEffectsController.AnimationEffect) this.f7847d);
                break;
            case 1:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$12((SpecialEffectsController.Operation) this.f7846b, (SpecialEffectsController.Operation) this.c, (DefaultSpecialEffectsController.TransitionEffect) this.f7847d);
                break;
            default:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$13((FragmentTransitionImpl) this.f7846b, (View) this.c, (Rect) this.f7847d);
                break;
        }
    }
}
