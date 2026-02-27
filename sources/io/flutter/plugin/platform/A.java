package io.flutter.plugin.platform;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements io.flutter.view.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f17206a;

    public A(B b8) {
        this.f17206a = b8;
    }

    @Override // io.flutter.view.q
    public final void onTrimMemory(int i) {
        if (i != 80 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f17206a.f = true;
    }
}
