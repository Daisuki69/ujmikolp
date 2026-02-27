package androidx.camera.view;

import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7723b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f7722a = i;
        this.f7723b = obj;
        this.c = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7722a) {
            case 0:
                return ((PendingValue) this.f7723b).lambda$setValue$0(this.c, completer);
            default:
                return ((TextureViewImplementation) this.f7723b).lambda$tryToProvidePreviewSurface$1((Surface) this.c, completer);
        }
    }
}
