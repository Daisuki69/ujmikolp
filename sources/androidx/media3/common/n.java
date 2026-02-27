package androidx.media3.common;

import androidx.media3.common.util.HandlerWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7891b;

    public /* synthetic */ n(Object obj, int i) {
        this.f7890a = i;
        this.f7891b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7890a) {
            case 0:
                ((SimpleBasePlayer) this.f7891b).postOrRunOnApplicationHandler(runnable);
                break;
            default:
                ((HandlerWrapper) this.f7891b).post(runnable);
                break;
        }
    }
}
