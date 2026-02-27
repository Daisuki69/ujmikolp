package Bj;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class V implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f605a;

    public V(ScheduledFuture scheduledFuture) {
        this.f605a = scheduledFuture;
    }

    @Override // Bj.W
    public final void dispose() {
        this.f605a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f605a + ']';
    }
}
