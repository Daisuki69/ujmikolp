package n;

import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: renamed from: n.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1878e implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f18456b;

    public /* synthetic */ C1878e(LottieAnimationView lottieAnimationView, int i) {
        this.f18455a = i;
        this.f18456b = lottieAnimationView;
    }

    @Override // n.u
    public final void onResult(Object obj) {
        switch (this.f18455a) {
            case 0:
                this.f18456b.setComposition((C1880g) obj);
                break;
            default:
                Throwable th2 = (Throwable) obj;
                LottieAnimationView lottieAnimationView = this.f18456b;
                int i = lottieAnimationView.f9406d;
                if (i != 0) {
                    lottieAnimationView.setImageResource(i);
                }
                u uVar = lottieAnimationView.c;
                if (uVar == null) {
                    uVar = LottieAnimationView.f9403t;
                }
                uVar.onResult(th2);
                break;
        }
    }
}
