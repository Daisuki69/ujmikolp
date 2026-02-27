package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f17210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C.h f17211b;

    public D(View view, C.h hVar) {
        this.f17210a = view;
        this.f17211b = hVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        C.h hVar = this.f17211b;
        if (hVar == null) {
            return;
        }
        hVar.run();
        this.f17211b = null;
        this.f17210a.post(new C.h(this, 21));
    }
}
