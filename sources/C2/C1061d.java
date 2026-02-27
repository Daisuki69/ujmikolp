package c2;

import Q6.n;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: c2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1061d implements InterfaceC1064g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC1063f f9260b;
    public final /* synthetic */ Runnable c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f9261d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ C1061d(ScheduledExecutorServiceC1063f scheduledExecutorServiceC1063f, Runnable runnable, long j, long j6, TimeUnit timeUnit, int i) {
        this.f9259a = i;
        this.f9260b = scheduledExecutorServiceC1063f;
        this.c = runnable;
        this.f9261d = j;
        this.e = j6;
        this.f = timeUnit;
    }

    @Override // c2.InterfaceC1064g
    public final ScheduledFuture a(n nVar) {
        switch (this.f9259a) {
            case 0:
                ScheduledExecutorServiceC1063f scheduledExecutorServiceC1063f = this.f9260b;
                return scheduledExecutorServiceC1063f.f9266b.scheduleAtFixedRate(new RunnableC1062e(scheduledExecutorServiceC1063f, this.c, nVar, 0), this.f9261d, this.e, this.f);
            default:
                ScheduledExecutorServiceC1063f scheduledExecutorServiceC1063f2 = this.f9260b;
                return scheduledExecutorServiceC1063f2.f9266b.scheduleWithFixedDelay(new RunnableC1062e(scheduledExecutorServiceC1063f2, this.c, nVar, 2), this.f9261d, this.e, this.f);
        }
    }
}
