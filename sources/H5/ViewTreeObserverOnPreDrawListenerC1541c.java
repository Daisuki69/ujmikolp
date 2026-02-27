package h5;

import F.i;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: renamed from: h5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC1541c implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f16934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1539a f16935b;

    public ViewTreeObserverOnPreDrawListenerC1541c(i iVar, C1539a c1539a) {
        this.f16934a = iVar;
        this.f16935b = c1539a;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C1539a c1539a = this.f16935b;
        int height = ((ImageView) c1539a.f16930a.f4138b).getHeight();
        i iVar = this.f16934a;
        iVar.c = height;
        if (iVar.c > 0) {
            ((LottieAnimationView) c1539a.f16930a.f4139d).getLayoutParams().height = iVar.c;
        }
        ((ImageView) c1539a.f16930a.f4138b).getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
