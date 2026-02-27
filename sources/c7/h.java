package C7;

import android.animation.Animator;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaDashboardActivity f758b;

    public /* synthetic */ h(MayaDashboardActivity mayaDashboardActivity, int i) {
        this.f757a = i;
        this.f758b = mayaDashboardActivity;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f757a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f757a) {
            case 0:
                TextView textView = this.f758b.f12147t;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                } else {
                    j.n("mTextViewToast");
                    throw null;
                }
            default:
                MayaDashboardActivity mayaDashboardActivity = this.f758b;
                TextView textView2 = mayaDashboardActivity.f12147t;
                if (textView2 == null) {
                    j.n("mTextViewToast");
                    throw null;
                }
                textView2.setVisibility(0);
                mayaDashboardActivity.f12151x.postDelayed(mayaDashboardActivity.f12150w, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f757a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f757a;
    }
}
