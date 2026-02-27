package androidx.core.view.insets;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Protection f7814b;

    public /* synthetic */ a(Protection protection, int i) {
        this.f7813a = i;
        this.f7814b = protection;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7813a) {
            case 0:
                this.f7814b.lambda$animateInsetsAmount$1(valueAnimator);
                break;
            default:
                this.f7814b.lambda$animateAlpha$0(valueAnimator);
                break;
        }
    }
}
