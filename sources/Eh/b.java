package Eh;

import Nh.r;
import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import sh.p;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1362a;

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1362a) {
            case 0:
                break;
            case 1:
                for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(r.f4483d.keySet())) {
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        r.f4483d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                break;
            case 2:
            case 3:
            case 4:
                break;
            default:
                for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 : new ArrayList(p.f20107d.keySet())) {
                    if (scheduledThreadPoolExecutor2.isShutdown()) {
                        p.f20107d.remove(scheduledThreadPoolExecutor2);
                    } else {
                        scheduledThreadPoolExecutor2.purge();
                    }
                }
                break;
        }
    }

    public String toString() {
        switch (this.f1362a) {
            case 0:
                return "EmptyRunnable";
            case 3:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }
}
