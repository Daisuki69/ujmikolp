package Ie;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Path;
import com.paymaya.ui.travel.view.widget.StepProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StepProgressBar f2293b;

    public b(StepProgressBar stepProgressBar, int i) {
        this.f2293b = stepProgressBar;
        this.f2292a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        StepProgressBar stepProgressBar = this.f2293b;
        Path path = stepProgressBar.f14947k;
        path.reset();
        path.op((Path) stepProgressBar.m.get(this.f2292a), Path.Op.UNION);
        stepProgressBar.invalidate();
    }
}
