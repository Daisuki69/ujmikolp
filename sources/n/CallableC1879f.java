package n;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: n.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class CallableC1879f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18458b;
    public final Object c;

    public /* synthetic */ CallableC1879f(Object obj, int i, int i4) {
        this.f18457a = i4;
        this.c = obj;
        this.f18458b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f18457a) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.c;
                boolean z4 = lottieAnimationView.f9410n;
                int i = this.f18458b;
                if (!z4) {
                    return AbstractC1883j.e(lottieAnimationView.getContext(), i, null);
                }
                Context context = lottieAnimationView.getContext();
                return AbstractC1883j.e(context, i, AbstractC1883j.h(context, i));
            default:
                return ((ch.l) this.c).replay(this.f18458b);
        }
    }
}
