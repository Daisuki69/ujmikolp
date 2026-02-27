package androidx.camera.core;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7512b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.f7511a = i;
        this.f7512b = obj;
        this.c = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7511a) {
            case 0:
                return ((CameraX) this.f7512b).lambda$initInternal$0((Context) this.c, completer);
            default:
                return ((SurfaceRequest) this.f7512b).lambda$initialSurfaceRecreationCompleter$6((AtomicReference) this.c, completer);
        }
    }
}
