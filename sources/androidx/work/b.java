package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f8225b;
    public final /* synthetic */ CallbackToFutureAdapter.Completer c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f8226d;

    public /* synthetic */ b(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, Function0 function0, int i) {
        this.f8224a = i;
        this.f8225b = atomicBoolean;
        this.c = completer;
        this.f8226d = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8224a) {
            case 0:
                ListenableFutureKt.executeAsync$lambda$4$lambda$3(this.f8225b, this.c, this.f8226d);
                break;
            default:
                WorkerKt.future$lambda$2$lambda$1(this.f8225b, this.c, this.f8226d);
                break;
        }
    }
}
