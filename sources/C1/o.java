package c1;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9241a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9242b;

    public /* synthetic */ o() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f9241a) {
            case 0:
                ((ExecutorService) this.f9242b).execute(new n(runnable, 0));
                break;
            default:
                ((Handler) this.f9242b).post(runnable);
                break;
        }
    }

    public o(ExecutorService executorService) {
        this.f9242b = executorService;
    }
}
