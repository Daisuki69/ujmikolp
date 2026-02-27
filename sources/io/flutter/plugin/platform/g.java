package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f17225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f17226b;

    public g(j jVar, View view) {
        this.f17226b = jVar;
        this.f17225a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        this.f17225a.post(new G7.p(this, i, 5));
    }
}
