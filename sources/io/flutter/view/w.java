package io.flutter.view;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f17498b;

    public w(x xVar, long j) {
        this.f17498b = xVar;
        this.f17497a = j;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long jNanoTime = System.nanoTime() - j;
        long j6 = jNanoTime < 0 ? 0L : jNanoTime;
        x xVar = this.f17498b;
        xVar.f17500b.onVsync(j6, xVar.f17499a, this.f17497a);
        xVar.c = this;
    }
}
