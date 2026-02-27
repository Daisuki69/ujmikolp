package Sc;

import android.view.View;
import android.view.ViewTreeObserver;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnDrawListener f5717b;

    public /* synthetic */ c(ViewTreeObserver.OnDrawListener onDrawListener, int i) {
        this.f5716a = i;
        this.f5717b = onDrawListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f5716a) {
            case 0:
                j.g(view, numX49.tnTj78("bZzP"));
                d dVar = (d) this.f5717b;
                if (dVar.f5718a.getViewTreeObserver().isAlive()) {
                    dVar.f5718a.getViewTreeObserver().addOnDrawListener(dVar);
                }
                dVar.f5718a.removeOnAttachStateChangeListener(this);
                break;
            default:
                view.getViewTreeObserver().addOnDrawListener((T2.b) this.f5717b);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f5716a) {
            case 0:
                j.g(view, numX49.tnTj78("bZzb"));
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
