package androidx.camera.core.impl;

import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7542b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(int i, Object obj, Object obj2) {
        this.f7541a = i;
        this.c = obj;
        this.f7542b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7541a) {
            case 0:
                ((LiveDataObservable) this.c).lambda$removeObserver$3((LiveDataObservable.LiveDataObserverAdapter) this.f7542b);
                break;
            case 1:
                ((LiveDataObservable.LiveDataObserverAdapter) this.f7542b).lambda$onChanged$0((LiveDataObservable.Result) this.c);
                break;
            case 2:
                ((CameraRepository) this.c).lambda$deinit$1((CameraInternal) this.f7542b);
                break;
            case 3:
                ((ConstantObservable) this.c).lambda$addObserver$0((Observable.Observer) this.f7542b);
                break;
            case 4:
                ((DeferrableSurface) this.c).lambda$new$2((String) this.f7542b);
                break;
            default:
                ((LiveDataObservable) this.c).lambda$fetchData$0((CallbackToFutureAdapter.Completer) this.f7542b);
                break;
        }
    }

    public /* synthetic */ p(LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter, LiveDataObservable.Result result) {
        this.f7541a = 1;
        this.f7542b = liveDataObserverAdapter;
        this.c = result;
    }
}
