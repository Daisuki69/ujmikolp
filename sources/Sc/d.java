package Sc;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f5718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f5719b;
    public Handler c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5720d;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f5720d) {
            return;
        }
        this.f5720d = true;
        Handler handler = this.c;
        final int i = 0;
        handler.postAtFrontOfQueue(new Runnable(this) { // from class: Sc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f5715b;

            {
                this.f5715b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f5715b.f5719b.e();
                        break;
                    default:
                        d dVar = this.f5715b;
                        if (dVar.f5718a.getViewTreeObserver().isAlive()) {
                            dVar.f5718a.getViewTreeObserver().removeOnDrawListener(dVar);
                        }
                        break;
                }
            }
        });
        final int i4 = 1;
        handler.post(new Runnable(this) { // from class: Sc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f5715b;

            {
                this.f5715b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f5715b.f5719b.e();
                        break;
                    default:
                        d dVar = this.f5715b;
                        if (dVar.f5718a.getViewTreeObserver().isAlive()) {
                            dVar.f5718a.getViewTreeObserver().removeOnDrawListener(dVar);
                        }
                        break;
                }
            }
        });
    }
}
