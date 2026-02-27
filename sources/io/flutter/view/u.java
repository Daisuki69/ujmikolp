package io.flutter.view;

import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements FlutterJNI.AsyncWaitForVsyncDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f17494a;

    public u(x xVar) {
        this.f17494a = xVar;
    }

    @Override // io.flutter.embedding.engine.FlutterJNI.AsyncWaitForVsyncDelegate
    public final void asyncWaitForVsync(long j) {
        Choreographer choreographer = Choreographer.getInstance();
        x xVar = this.f17494a;
        w wVar = xVar.c;
        if (wVar != null) {
            wVar.f17497a = j;
            xVar.c = null;
        } else {
            wVar = new w(xVar, j);
        }
        choreographer.postFrameCallback(wVar);
    }
}
