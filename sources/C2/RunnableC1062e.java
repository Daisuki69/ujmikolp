package c2;

import Q6.n;

/* JADX INFO: renamed from: c2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1062e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC1063f f9263b;
    public final /* synthetic */ Runnable c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f9264d;

    public /* synthetic */ RunnableC1062e(ScheduledExecutorServiceC1063f scheduledExecutorServiceC1063f, Runnable runnable, n nVar, int i) {
        this.f9262a = i;
        this.f9263b = scheduledExecutorServiceC1063f;
        this.c = runnable;
        this.f9264d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9262a) {
            case 0:
                ScheduledExecutorServiceC1063f scheduledExecutorServiceC1063f = this.f9263b;
                final n nVar = this.f9264d;
                final Runnable runnable = this.c;
                final int i = 0;
                scheduledExecutorServiceC1063f.f9265a.execute(new Runnable() { // from class: c2.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC1065h) nVar.f5284b).setException(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((ScheduledFutureC1065h) nVar.f5284b).setException(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                ScheduledFutureC1065h scheduledFutureC1065h = (ScheduledFutureC1065h) nVar.f5284b;
                                try {
                                    runnable2.run();
                                    scheduledFutureC1065h.set(null);
                                    return;
                                } catch (Exception e10) {
                                    scheduledFutureC1065h.setException(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ScheduledExecutorServiceC1063f scheduledExecutorServiceC1063f2 = this.f9263b;
                final n nVar2 = this.f9264d;
                final Runnable runnable2 = this.c;
                final int i4 = 2;
                scheduledExecutorServiceC1063f2.f9265a.execute(new Runnable() { // from class: c2.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC1065h) nVar2.f5284b).setException(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((ScheduledFutureC1065h) nVar2.f5284b).setException(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                ScheduledFutureC1065h scheduledFutureC1065h = (ScheduledFutureC1065h) nVar2.f5284b;
                                try {
                                    runnable22.run();
                                    scheduledFutureC1065h.set(null);
                                    return;
                                } catch (Exception e10) {
                                    scheduledFutureC1065h.setException(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ScheduledExecutorServiceC1063f scheduledExecutorServiceC1063f3 = this.f9263b;
                final n nVar3 = this.f9264d;
                final Runnable runnable3 = this.c;
                final int i6 = 1;
                scheduledExecutorServiceC1063f3.f9265a.execute(new Runnable() { // from class: c2.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i6) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC1065h) nVar3.f5284b).setException(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((ScheduledFutureC1065h) nVar3.f5284b).setException(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                ScheduledFutureC1065h scheduledFutureC1065h = (ScheduledFutureC1065h) nVar3.f5284b;
                                try {
                                    runnable22.run();
                                    scheduledFutureC1065h.set(null);
                                    return;
                                } catch (Exception e10) {
                                    scheduledFutureC1065h.setException(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
