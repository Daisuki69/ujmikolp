package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceEdge;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7603b;

    public /* synthetic */ m(Object obj, int i) {
        this.f7602a = i;
        this.f7603b = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7602a) {
            case 0:
                return ((SurfaceEdge.SettableSurface) this.f7603b).lambda$new$0(completer);
            default:
                return ((SurfaceOutputImpl) this.f7603b).lambda$new$0(completer);
        }
    }
}
