package n;

import android.animation.ValueAnimator;
import v.C2328c;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f18485a;

    public p(s sVar) {
        this.f18485a = sVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        s sVar = this.f18485a;
        C2328c c2328c = sVar.m;
        if (c2328c != null) {
            c2328c.r(sVar.c.a());
        }
    }
}
