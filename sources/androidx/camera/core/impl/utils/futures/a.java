package androidx.camera.core.impl.utils.futures;

import S1.q;
import S1.y;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements CallbackToFutureAdapter.Resolver, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f7548b;

    public /* synthetic */ a(int i, y yVar) {
        this.f7547a = i;
        this.f7548b = yVar;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7547a) {
            case 0:
                return Futures.lambda$transformAsyncOnCompletion$8(this.f7548b, completer);
            default:
                return Futures.lambda$nonCancellationPropagating$0(this.f7548b, completer);
        }
    }
}
