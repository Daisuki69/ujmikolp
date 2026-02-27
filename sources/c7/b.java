package C7;

import android.animation.ValueAnimator;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaDashboardActivity f744b;

    public /* synthetic */ b(MayaDashboardActivity mayaDashboardActivity, int i) {
        this.f743a = i;
        this.f744b = mayaDashboardActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        MayaDashboardActivity mayaDashboardActivity = this.f744b;
        switch (this.f743a) {
            case 0:
                int i = MayaDashboardActivity.f12133U;
                j.g(it, "it");
                it.addListener(new h(mayaDashboardActivity, 1));
                break;
            default:
                int i4 = MayaDashboardActivity.f12133U;
                j.g(it, "it");
                it.addListener(new h(mayaDashboardActivity, 0));
                break;
        }
    }
}
