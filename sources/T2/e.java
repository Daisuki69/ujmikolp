package T2;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f5753a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f5754b;
    public final N2.a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N2.a f5755d;

    public e(View view, N2.a aVar, N2.a aVar2) {
        this.f5754b = new AtomicReference(view);
        this.c = aVar;
        this.f5755d = aVar2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.f5754b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        Handler handler = this.f5753a;
        handler.post(this.c);
        handler.postAtFrontOfQueue(this.f5755d);
        return true;
    }
}
