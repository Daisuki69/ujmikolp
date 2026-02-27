package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f17232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f17233b;

    public o(p pVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f17233b = pVar;
        this.f17232a = onFocusChangeListener;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        p pVar = this.f17233b;
        this.f17232a.onFocusChange(pVar, E1.c.s(pVar, new df.o(22, (byte) 0)));
    }
}
