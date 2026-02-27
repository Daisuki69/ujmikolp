package n;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends FutureTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f18533a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, Callable callable) {
        super(callable);
        this.f18533a = yVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        y yVar = this.f18533a;
        if (isCancelled()) {
            return;
        }
        try {
            yVar.e((w) get());
        } catch (InterruptedException | ExecutionException e) {
            yVar.e(new w(e));
        }
    }
}
