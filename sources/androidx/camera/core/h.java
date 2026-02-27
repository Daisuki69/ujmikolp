package androidx.camera.core;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7507a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraX f7508b;
    public final /* synthetic */ Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Executor f7509d;
    public final /* synthetic */ int e;
    public final /* synthetic */ CallbackToFutureAdapter.Completer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f7510g;

    public /* synthetic */ h(CameraX cameraX, Context context, Executor executor, int i, CallbackToFutureAdapter.Completer completer, long j) {
        this.f7508b = cameraX;
        this.c = context;
        this.f7509d = executor;
        this.e = i;
        this.f = completer;
        this.f7510g = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7507a) {
            case 0:
                this.f7508b.lambda$initAndRetryRecursively$1(this.f7509d, this.f7510g, this.e, this.c, this.f);
                break;
            default:
                this.f7508b.lambda$initAndRetryRecursively$2(this.c, this.f7509d, this.e, this.f, this.f7510g);
                break;
        }
    }

    public /* synthetic */ h(CameraX cameraX, Executor executor, long j, int i, Context context, CallbackToFutureAdapter.Completer completer) {
        this.f7508b = cameraX;
        this.f7509d = executor;
        this.f7510g = j;
        this.e = i;
        this.c = context;
        this.f = completer;
    }
}
