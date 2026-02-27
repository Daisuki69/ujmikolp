package Xj;

import S1.v;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import bi.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6687b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ b(Runnable runnable, int i, int i4) {
        this.f6686a = i4;
        this.c = runnable;
        this.f6687b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Camera cameraOpen;
        int i = this.f6687b;
        boolean z4 = false;
        switch (this.f6686a) {
            case 0:
                try {
                    cameraOpen = i == -1 ? Camera.open() : Camera.open(i);
                } catch (Exception unused) {
                    cameraOpen = null;
                }
                new Handler(Looper.getMainLooper()).post(new v(20, this, cameraOpen, z4));
                break;
            default:
                i iVar = i.f9158g;
                bi.h hVar = (bi.h) this.c;
                if (i > 0) {
                    try {
                        Thread.sleep(i);
                        hVar.a(iVar);
                    } catch (InterruptedException e) {
                        Ri.a.e("Waiting before to check if SDK is READY has been interrupted", e.getMessage());
                        hVar.a(iVar);
                    } catch (Throwable th2) {
                        Ri.a.e("Waiting before to check if SDK is READY interrupted ", th2.getMessage());
                        hVar.a(iVar);
                        return;
                    }
                }
                break;
        }
    }
}
