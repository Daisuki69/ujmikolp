package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.CaptureSessionRepository;
import androidx.camera.core.impl.CameraCaptureCallback;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0723f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7452b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0723f(Object obj, int i, int i4) {
        this.f7451a = i4;
        this.c = obj;
        this.f7452b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7451a) {
            case 0:
                ((CameraCaptureCallback) this.c).onCaptureCancelled(this.f7452b);
                break;
            default:
                CaptureSessionRepository.AnonymousClass1.lambda$dispatchOnError$1((LinkedHashSet) this.c, this.f7452b);
                break;
        }
    }
}
