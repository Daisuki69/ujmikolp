package N2;

import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppStartTrace f3513a;

    public b(AppStartTrace appStartTrace) {
        this.f3513a = appStartTrace;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.f3513a.f9845t++;
    }
}
